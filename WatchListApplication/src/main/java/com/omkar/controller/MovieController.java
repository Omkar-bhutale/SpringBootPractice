package com.omkar.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.omkar.model.Movie;
import com.omkar.service.IMovieService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class MovieController {
	@Autowired
	IMovieService service;
//	@GetMapping("/watchlistItemForm")
//	public String showWatchListForm(Model model) {
//		model.addAttribute("watchlistItem",new Movie());
//		return "watchlistItemForm";
//	}
	@GetMapping("/watchlistItemForm")
	public ModelAndView showWatchListForm(@RequestParam(required = false) Integer id) {
		System.out.println("MovieController.showWatchListForm()");
		Map<String, Object> map = new HashMap<String, Object>();
		if (id != null) {
			Movie movie = service.getMovieById(id);
				map.put("watchlistItem", movie);
		}
		else {
			map.put("watchlistItem", new Movie());
		}
		return new ModelAndView("watchlistItemForm",map);
	}

	@PostMapping("/watchlistItemForm")
	public ModelAndView submitWatchListForm(@Valid @ModelAttribute("watchlistItem") Movie movie,BindingResult bindingResult) {
		System.out.println("MovieController.submitWatchListForm()");
		
		System.out.println(movie);
		if(bindingResult.hasErrors()) {
			System.out.println("in if");
			return new ModelAndView("/watchlistItemForm");
		}
		
		Integer id = movie.getId();
		if(id == null) {
			service.create(movie);
		} else {
			service.update(movie, id);
		}
		
		RedirectView rv = new RedirectView();
		rv.setUrl("/watchlist");
		return new ModelAndView(rv);
	}
	
	@GetMapping("/watchlist")
	public ModelAndView getWatchList() {
		System.out.println("MovieController.getWatchList()");
		String viewName = "watchlist";
		Map<String, Object> map = new HashMap<String, Object>();
		List<Movie> movies = service.getAllMovies();
		System.out.println(movies);
		map.put("watchlistrows", movies);
		map.put("noofmovies", movies.size());
		return new ModelAndView(viewName,map);
		
	}
	
}
