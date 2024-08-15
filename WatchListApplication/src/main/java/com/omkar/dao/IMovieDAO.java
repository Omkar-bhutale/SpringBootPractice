package com.omkar.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.omkar.model.Movie;

public interface IMovieDAO extends JpaRepository<Movie, Integer> {

}
