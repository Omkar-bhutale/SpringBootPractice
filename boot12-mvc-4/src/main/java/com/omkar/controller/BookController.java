package com.omkar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.omkar.model.Book;

import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class BookController {
	
	@GetMapping("/lodingform")
	public String LodePage(Model model) {
		return "index";
	}
	
	@PostMapping("/bookinfo")
	public String showBookInfo(Book book,Model model) {
		model.addAttribute("book", book);
		return "book_info";
	}
	

}
