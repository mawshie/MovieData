package com.example.movies.MovieData.entity;

import jakarta.persistence.*;

@Entity
@Table(name="movies")
public class Movies {

    // define fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mov_id")
    private int mov_id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private int price;

    @Column(name = "release_date")
    private int date;

    //define constructors

}
