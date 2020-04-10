package com.demo.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class FilmController {
    private final AtomicLong counter = new AtomicLong();
    private FilmService filmsService;
    private FilmToFilmForm filmToFilmForm;


    @Autowired
    private FilmRepository filmRepository;

    @Autowired
    public void setFilmToFilmForm(FilmToFilmForm filmToFilmForm) {
this.filmToFilmForm = filmToFilmForm;
    }

    // Setter based dependency injection
    @Autowired
    public void setFilmsService(FilmService filmsService) {
        this.filmsService=filmsService;
    }

    @GetMapping("/api/films")
    public List<Film> listFilms() {
        // PostgreSQL to return JSON films

        //model.addAttribute("films", filmsService.listAll());
        return filmsService.listAll();
    }
}
