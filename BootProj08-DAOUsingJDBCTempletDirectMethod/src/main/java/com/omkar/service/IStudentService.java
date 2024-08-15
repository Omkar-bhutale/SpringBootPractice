package com.omkar.service;

import java.util.List;

import com.omkar.bo.StudentBO;
import com.omkar.dto.StudentDTO;

public interface IStudentService {
	public StudentDTO fetchStudentByNo(int sno);
	public List<StudentDTO> fetchAllStudentsDTOs();
	public List<StudentBO> fetchStudentsDTOsByName(String sname1,String sname2,String sname3);


}
