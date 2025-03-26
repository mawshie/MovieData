package com.example.movies.MovieData.dao;

import com.example.movies.MovieData.entity.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Integer> {

}
