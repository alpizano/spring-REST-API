package com.demo.restservice.services;

import com.demo.restservice.domain.Film;
import com.demo.restservice.repositories.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/***
 * Implements listAll() method from IFilmService
 */
@Service
public class FilmServiceImpl implements FilmService {
    FilmRepository filmRepository;

    // Injects the FilmRepository which extends CrudRepository which gives access to CRUD methods
    @Autowired
    public FilmServiceImpl(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }

    @Override
    public List<Film> listAll() {
        List<Film> films = new ArrayList<>();
        filmRepository.findAll().forEach(films::add); //fun with Java 8
        return films;
    }
}
