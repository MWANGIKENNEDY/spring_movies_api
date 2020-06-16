package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MoviesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long movie_id;
    private int movie_rating;
    private String movie_title,movie_description;

    public Long getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(Long movie_id) {
        this.movie_id = movie_id;
    }

    public int getMovie_rating() {
        return movie_rating;
    }

    public void setMovie_rating(int movie_rating) {
        this.movie_rating = movie_rating;
    }

    public String getMovie_title() {
        return movie_title;
    }

    public void setMovie_title(String movie_title) {
        this.movie_title = movie_title;
    }

    public String getMovie_description() {
        return movie_description;
    }

    public void setMovie_description(String movie_description) {
        this.movie_description = movie_description;
    }
}
