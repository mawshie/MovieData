package com.example.movies.MovieData.rest;

import com.example.movies.MovieData.entity.Movie;
import com.example.movies.MovieData.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MovieRestController {

    private MovieService movieService;

    @Autowired
    public MovieRestController(MovieService movieService){
        this.movieService = movieService;
    }

    @GetMapping("/movies")
    public List<Movie> findAll(){
        return movieService.findAll();
    }

    @GetMapping("/movies/{movieId}")
    public Movie getMovie(@PathVariable int movieId){
        Movie theMovie = movieService.findById(movieId);
        if (theMovie == null){
            throw new RuntimeException("Movie id not found - " + movieId);
        }
        return theMovie;
    }

    @PostMapping("/movies")
    public Movie addMovie(@RequestBody Movie theMovie){
        theMovie.setMovId(0); // if someone accidentally passes in an ID it will overwrite it to 0 to force a save.
        Movie dbMovie = movieService.save(theMovie);
        return dbMovie;
    }

    @PutMapping("/movies")
    public Movie updateMovie(@RequestBody Movie theMovei){
        Movie dbMovie = movieService.save(theMovei);
        return dbMovie;
    }

    @DeleteMapping("/movies/{movieId}")
    public String deleteMovie(@PathVariable int movieId){
        Movie tempMovie = movieService.findById(movieId);

        if (tempMovie == null){
            throw new RuntimeException("Movie id not found - " + movieId);
        }
        movieService.deleteById(movieId);
        return "Deleted movie id - " +movieId;
    }

}
