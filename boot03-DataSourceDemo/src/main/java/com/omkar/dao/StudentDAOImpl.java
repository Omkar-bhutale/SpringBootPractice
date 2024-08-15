package com.omkar.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.omkar.dto.Student;
@Repository
public class StudentDAOImpl implements IStudentDAO {
	@Autowired
	DataSource dataSource;
	@Override
	public List<Student> getAllStudents() {
		List<Student> stdList = new ArrayList<Student>();
		String SQL_SELECT_QUERY="select sid,sname,sage,saddress,smarks from student";
		try(Connection con = dataSource.getConnection(); PreparedStatement pstmt = con.prepareStatement(SQL_SELECT_QUERY);
				ResultSet resultSet = pstmt.executeQuery()){
			if(resultSet!=null) {
				while(resultSet.next()) {
					Student std = new Student();
					std.setSid(resultSet.getInt(1));
					std.setSname(resultSet.getString(2));
					std.setSage(resultSet.getInt("sage"));
					std.setSaddress(resultSet.getString("saddress"));
					std.setSmarks(resultSet.getInt("smarks"));
					stdList.add(std);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return stdList;
	}

}
