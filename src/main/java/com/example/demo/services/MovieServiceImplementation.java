package com.example.demo.services;

import com.example.demo.models.MoviesModel;
import com.example.demo.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImplementation implements MovieService {
    @Autowired
    MovieRepository movieRepository;

    @Override
    public void addMovie(MoviesModel moviesModel) {
        movieRepository.save(moviesModel);
    }

    @Override
    public void deleteMovie(Long id) {
        movieRepository.deleteById(id);
    }

    @Override
    public void updateMovie(int id) {
        movieRepository.save();
    }
}
