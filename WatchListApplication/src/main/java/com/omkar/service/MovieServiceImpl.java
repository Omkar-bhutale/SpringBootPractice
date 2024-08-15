package com.omkar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.omkar.dao.IMovieDAO;
import com.omkar.model.Movie;
@Service
public class MovieServiceImpl implements IMovieService {
	
	@Autowired
	IMovieDAO dao;
	@Autowired
	RatingRequest request ;
	
	@Override
	public void create(Movie movie) {
		Float rating = request.getMovieRating(movie.getTitle());
		if(rating != null)
			movie.setRating(rating);
			
		dao.save(movie);
		
	}

	@Override
	public List<Movie> getAllMovies() {
		return dao.findAll();
	}

	@Override
	public Movie getMovieById(Integer id) {
		Movie movie = dao.findById(id).get();
		return movie;
	}
	@Override
	public void update(Movie movie, Integer id) {
		
		Movie toBeUpdated = getMovieById(id);
		toBeUpdated.setTitle(movie.getTitle());
		toBeUpdated.setRating(movie.getRating());
		toBeUpdated.setComment(movie.getComment());
		toBeUpdated.setPriority(movie.getPriority());
		
		dao.save(toBeUpdated);
	}
	
}
