package com.demo.restservice.repositories;

import com.demo.restservice.domain.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

// Provides a suite of CRUD operations
//public interface FilmRepository extends CrudRepository<Film,Long> {
public interface FilmRepository extends JpaRepository<Film,Long> {


}
