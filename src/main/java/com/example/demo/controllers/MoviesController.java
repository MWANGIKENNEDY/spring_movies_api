package com.example.demo.controllers;

import com.example.demo.models.MoviesModel;
import com.example.demo.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MoviesController {

    @Autowired
    MovieService movieService;

    @RequestMapping(value = "/api/movies/add",method = RequestMethod.POST)
    public ResponseEntity<Object> createMovie(@RequestBody MoviesModel moviesModel){
        movieService.addMovie(moviesModel);
        return new ResponseEntity<>("Movie created",HttpStatus.CREATED);
    }

    @RequestMapping(value = "/api/movies",method = RequestMethod.GET)
    public ResponseEntity<Object> getMovies(){
        return new ResponseEntity<>(movieService.getAllMovies(),HttpStatus.OK);
    }

    @RequestMapping(value = "/api/movies/{id}",method = RequestMethod.GET)
    public ResponseEntity<Object> getOneMovie(@PathVariable("id") Long id){
        return new ResponseEntity<>(movieService.getOneMovie(id),HttpStatus.OK);
    }

    @RequestMapping(value = "/api/movies/update/{id}",method = RequestMethod.PUT)
    public ResponseEntity<Object> updateMovie(@PathVariable("id") Long id,@RequestBody MoviesModel moviesModel){
        moviesModel.setMovie_id(id);
        movieService.addMovie(moviesModel);
        return new ResponseEntity<>("Movie added",HttpStatus.OK);
    }

    @RequestMapping(value = "/api/movies/delete/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<Object> deleteMovie(@PathVariable("id") Long id){
        movieService.deleteMovie(id);
        return new ResponseEntity<>("Movie deleted:",HttpStatus.OK);
    }







}
