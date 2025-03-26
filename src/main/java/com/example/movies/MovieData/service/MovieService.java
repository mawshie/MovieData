package com.example.movies.MovieData.service;

import com.example.movies.MovieData.entity.Movie;

import java.util.List;

public interface MovieService {
    List<Movie> findAll();

    Movie findById (int theId);

    Movie save (Movie theMovie);

    void deleteById(int theID);

    List<Movie> findAllMoviesWithGenres();
}
