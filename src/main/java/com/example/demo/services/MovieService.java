package com.example.demo.services;

import com.example.demo.models.MoviesModel;

public interface MovieService {
    public void addMovie(MoviesModel moviesModel);
    public void deleteMovie(Long id);
}
