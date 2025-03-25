package com.example.movies.MovieData.entity;

import jakarta.persistence.*;

@Entity
@Table(name="movies")
public class Movie {

    // define fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mov_id")
    private int movId;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private int price;

    @Column(name = "release_date")
    private int releaseDate;

    //define constructors
    public Movie(){}

    public Movie(String name, int price, int releaseDate){
        this.name = name;
        this.price = price;
        this.releaseDate = releaseDate;
    }

    // define getters/setters


    public int getMovId() {
        return movId;
    }

    public void setMovId(int movId) {
        this.movId = movId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "movId=" + movId +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", releaseDate=" + releaseDate +
                '}';
    }
}
