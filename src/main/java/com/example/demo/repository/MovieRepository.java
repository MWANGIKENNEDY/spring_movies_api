package com.example.demo.repository;

import com.example.demo.models.MoviesModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<MoviesModel,Long> {
}
