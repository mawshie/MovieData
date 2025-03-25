package com.example.movies.MovieData.dao;

import com.example.movies.MovieData.entity.Movie;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MoviesDAOImpl implements MoviesDAO{

    // inject entity manager
    private EntityManager entityManager;

    @Autowired
    public MoviesDAOImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    @Override
    public List<Movie> findByAll() {
        TypedQuery<Movie> theQuery = entityManager.createQuery("from Movie", Movie.class);

        List<Movie> movies = theQuery.getResultList();
        return movies;
    }

    @Override
    public Movie findById(int theId) {
        Movie theMovie = entityManager.find(Movie.class, theId);

        return theMovie;
    }

    @Override
    public Movie save(Movie theMovie) {
        Movie dbMovie = entityManager.merge(theMovie);

        return dbMovie;
    }

    @Override
    public void deleteById(int theId) {
        Movie theMovie = entityManager.find(Movie.class, theId);
        entityManager.remove(theMovie);

    }
}
