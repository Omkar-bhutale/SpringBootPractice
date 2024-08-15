package com.omkar.controller;

import java.awt.Dialog.ModalExclusionType;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.omkar.modal.Student;


@Controller
public class MyController {

	@GetMapping("/student")
	public String showInfo(@RequestParam (name = "sid") Integer sid,@RequestParam("sname") String sname,@RequestParam("saddr") String saddr,Model model) {
		Student student = new Student();
		student.setsId(sid);
		student.setsName(sname);
		student.setsAddress(saddr);
		model.addAttribute("student", student);
		return "index";
	}
	
}
