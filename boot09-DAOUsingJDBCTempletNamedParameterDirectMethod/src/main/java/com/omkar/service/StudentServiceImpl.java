package com.omkar.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.omkar.bo.StudentBO;
import com.omkar.dao.IStudentDAO;
import com.omkar.dto.StudentDTO;
@Service
public class StudentServiceImpl implements IStudentService{
	@Autowired
	IStudentDAO dao;
	@Override
	public StudentDTO fetchStudentByNo(int sno) {
		StudentBO bo = dao.getStudentByNo(sno);
		StudentDTO dto = new StudentDTO();
		System.out.println(dto);
		BeanUtils.copyProperties(bo, dto);
		System.out.println(dto);
		return dto;
	}
	@Override
	public List<StudentDTO> fetchAllStudentsDTOs() {
		List<StudentBO> bos = dao.getAllStudentsBos();
		List<StudentDTO> dtos = new ArrayList<>();
		bos.forEach(bo->{
			StudentDTO dto = new StudentDTO();
			BeanUtils.copyProperties(bo, dto);
			dtos.add(dto);
		});
		return dtos;
	}
	@Override
	public List<StudentBO> fetchStudentsDTOsByName(String sname1, String sname2, String sname3) {
		return dao.getStudentsBosByName(sname1, sname2, sname3);
	}

}
