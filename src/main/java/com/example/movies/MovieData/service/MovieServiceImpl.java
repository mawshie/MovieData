package com.example.movies.MovieData.service;

import com.example.movies.MovieData.dao.MovieDAO;
import com.example.movies.MovieData.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService{

    private MovieDAO movieDAO;

    @Autowired
    public MovieServiceImpl(MovieDAO movieDAO){
        this.movieDAO = movieDAO;
    }

    @Override
    public List<Movie> findAll() {
        return movieDAO.findAll();
    }

    @Override
    public Movie findById(int theId) {
        return movieDAO.findById(theId);
    }

    @Transactional
    @Override
    public Movie save(Movie theMovie) {
        return movieDAO.save(theMovie);
    }

    @Transactional
    @Override
    public void deleteById(int theId) {
        movieDAO.deleteById(theId);
    }
}
