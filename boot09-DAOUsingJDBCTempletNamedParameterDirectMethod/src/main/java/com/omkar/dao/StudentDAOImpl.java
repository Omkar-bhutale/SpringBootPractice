package com.omkar.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.omkar.bo.StudentBO;
@Repository
public class StudentDAOImpl implements IStudentDAO{
	
	private static final String STUDENT_SELECT_QUERY_BY_NO = "SELECT sno,sname,saddr,sage,smarks from student where sno=:no";
	private static final String SELECT_ALL_STUDENTS = "SELECT sno,sname,saddr,sage,smarks from student";
	private static final String SELECT_STUDENTS_BY_NAMES = "SELECT sno,sname,sage,saddr,smarks from student where sname in(:name1,:name2,:name3)";
	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;
	//in this example we used rowmapper
	@Override
	public StudentBO getStudentByNo(int sno) {
		Map<String,Object> snoMap = Map.of("no",sno);
		return jdbcTemplate.queryForObject(STUDENT_SELECT_QUERY_BY_NO,snoMap, new StudentMapper());
	}
	
	private static class StudentMapper implements RowMapper<StudentBO>{

		@Override
		public StudentBO mapRow(ResultSet rs, int rowNum) throws SQLException {
			System.out.println("StudentDAOImpl.StudentMapper.mapRow()");
			System.out.println(rowNum);
			StudentBO bo = new StudentBO();
			bo.setSrNo(rs.getInt(1));
			bo.setSname(rs.getString(2));
			bo.setSaddr(rs.getString(3));
			bo.setSage(rs.getInt(4));
			bo.setSmarks(rs.getInt(5));
			return bo;
		}
		
	}

	@Override
	public List<StudentBO> getAllStudentsBos() {
		List<StudentBO> bos = jdbcTemplate.query(SELECT_ALL_STUDENTS,new StudentMapper());
		return bos;
	}

	//int this example we used resultserextracter
	@Override
	public List<StudentBO> getStudentsBosByName(String sname1, String sname2, String sname3) {
		
//		return jdbcTemplate.query(SELECT_STUDENTS_BY_NAMES,source,(rs)->{
//			System.out.println("StudentDAOImpl.getStudentsBosByName()");
//			List<StudentBO> bos = new ArrayList<>();
//			StudentBO stdbo = null;
//			while(rs.next()) {
//				stdbo= new StudentBO();
//				stdbo.setSrNo(rs.getInt(1));
//				stdbo.setSname(rs.getString(2));
//				stdbo.setSage(rs.getInt(3));
//				stdbo.setSaddr(rs.getString(4));
//				stdbo.setSmarks(rs.getInt(5));
//				bos.add(stdbo);
//			}
//			
//			return bos;
//		});
		SqlParameterSource source = new MapSqlParameterSource(Map.of("name1",sname1,"name2",sname2,"name3",sname3));
		
		return jdbcTemplate.query(SELECT_STUDENTS_BY_NAMES,source,new BeanPropertyRowMapper<StudentBO>(StudentBO.class));
	}
	
	//working with row call back handler functional interface
	//void processRow(ResultSet rs) throws SQLException;
	public List<StudentBO> getStudentsBosByName1(String sname1, String sname2, String sname3) {
		SqlParameterSource source = new MapSqlParameterSource(Map.of("name1",sname1,"name2",sname2,"name3",sname3));

		List<StudentBO> bos = new ArrayList<StudentBO>();
 		
		jdbcTemplate.query(SELECT_STUDENTS_BY_NAMES,source,(rs)->{
			StudentBO stdbo = null;
				stdbo= new StudentBO();
				stdbo.setSrNo(rs.getInt(1));
				stdbo.setSname(rs.getString(2));
				stdbo.setSage(rs.getInt(3));
				stdbo.setSaddr(rs.getString(4));
				stdbo.setSmarks(rs.getInt(5));
				bos.add(stdbo);
		});
 		
		return bos;
	}
	public int insertstudent(StudentBO stdBo) {
		
	}

}
