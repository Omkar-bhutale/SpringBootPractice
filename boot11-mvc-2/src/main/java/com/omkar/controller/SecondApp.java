package com.omkar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class SecondApp {
	
	@GetMapping("/show")
	public String shoing(@RequestParam(name = "name") String param,Model model) {
		System.out.println("in showing");
		model.addAttribute("msg",param +"welcome");
		return "index";
	}
	
}
