package com.omkar.service;

import java.util.List;

import com.omkar.model.Movie;

public interface IMovieService {
	void create(Movie movie);
	List<Movie> getAllMovies();
	
	Movie getMovieById(Integer id) ;
	public void update(Movie movie, Integer id);
	

}
