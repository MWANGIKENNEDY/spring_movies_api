package com.example.demo.services;

import com.example.demo.models.MoviesModel;

import java.util.List;
import java.util.Optional;

public interface MovieService {
    public void addMovie(MoviesModel moviesModel);
    public List<MoviesModel> getAllMovies();
    public Optional<MoviesModel> getOneMovie(Long id);
    public void updateMovie(MoviesModel moviesModel);
    public void deleteMovie(Long id);
}
