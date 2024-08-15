package com.omkar.dao;

import java.util.List;

import com.omkar.bo.StudentBO;

public interface IStudentDAO {
	public StudentBO getStudentByNo(int sno);
	public List<StudentBO> getAllStudentsBos();
	public List<StudentBO> getStudentsBosByName(String sname1,String sname2,String sname3);
	
}
