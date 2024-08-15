package com.omkar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class FirstApp {
	@GetMapping("/show")
	public ModelAndView show() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg", "hi");
		mv.setViewName("index");
		return mv;
	}
	@GetMapping("/disp")
	public String display(Model model) {
		System.out.println("FirstApp.display()");

		model.addAttribute("msg", "display");
		return "index";		
	}
	
}
