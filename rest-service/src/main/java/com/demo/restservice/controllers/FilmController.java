package com.demo.restservice.controllers;

import com.demo.restservice.domain.Film;
import com.demo.restservice.repositories.FilmRepository;
import com.demo.restservice.services.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FilmController {
    private FilmService filmsService;
    private FilmRepository filmRepository;

    // Setter based dependency injection
    @Autowired
    public void setFilmsService(FilmService filmsService) {
        this.filmsService = filmsService;
    }

    // Inject the JpaRepository
    @Autowired
    public FilmController(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }


    @RequestMapping("/")
    public String redirToList(){
        return "redirect:/api/films";
    }

    @GetMapping("/api/films")
    public List<Film> listFilms() {
        // Using CRUD repository override of findAll()
       // return filmsService.listAll();
        return filmRepository.findAll();
    }

    @GetMapping("/api/films/{id}")
    public Film getFilmById(@PathVariable String id) {
        
    }

    @PostMapping("/api/")
    public void insertFilm() {

    }
}
