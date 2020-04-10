package com.demo.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FilmServiceImpl implements FilmService {

    FilmRepository filmsRepository;
    FilmFormToFilm filmFormToFilm;

    @Autowired
    public FilmServiceImpl(FilmRepository filmsRepository, FilmFormToFilm filmFormToFilm) {
        this.filmsRepository = filmsRepository;
        this.filmFormToFilm = filmFormToFilm;
    }

    @Override
    public List<Film> listAll() {
        List<Film> films = new ArrayList<>();
        filmsRepository.findAll().forEach(films::add); //fun with Java 8
        return films;
    }
}
