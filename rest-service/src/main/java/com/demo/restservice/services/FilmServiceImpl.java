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

    FilmRepository filmsRepository;


    @Autowired
    public FilmServiceImpl(FilmRepository filmsRepository) {
        this.filmsRepository = filmsRepository;
    }

    @Override
    public List<Film> listAll() {
        List<Film> films = new ArrayList<>();
        filmsRepository.findAll().forEach(films::add); //fun with Java 8
        return films;
    }
}
