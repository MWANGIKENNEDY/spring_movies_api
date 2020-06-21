package com.example.demo.services;

import com.example.demo.models.MoviesModel;
import com.example.demo.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieServiceImplementation implements MovieService {
    @Autowired
    MovieRepository movieRepository;

    @Override
    public void addMovie(MoviesModel moviesModel) {
        movieRepository.save(moviesModel);
    }

    @Override
    public List<MoviesModel> getAllMovies() {
        return movieRepository.findAll();
    }

    @Override
    public Optional<MoviesModel> getOneMovie(Long id) {
        return movieRepository.findById(id);
    }

    @Override
    public void updateMovie(MoviesModel moviesModel) {
        movieRepository.save(moviesModel);
    }

    @Override
    public void deleteMovie(Long id) {
        movieRepository.deleteById(id);
    }

}
