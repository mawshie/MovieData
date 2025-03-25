package com.example.movies.MovieData.dao;

import com.example.movies.MovieData.entity.Movie;

import java.util.List;

public interface MoviesDAO {

    List<Movie> findByAll();

    Movie findById(int theId);

    Movie save (Movie theMovie);

    void deleteById(int theId);
}
