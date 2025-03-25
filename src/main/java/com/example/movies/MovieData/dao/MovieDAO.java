package com.example.movies.MovieData.dao;

import com.example.movies.MovieData.entity.Movie;

import java.util.List;

public interface MovieDAO {

    List<Movie> findAll();

    Movie findById(int theId);

    Movie save (Movie theMovie);

    void deleteById(int theId);
}
