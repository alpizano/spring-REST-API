package com.demo.restservice.controllers;

import com.demo.restservice.domain.Film;
import com.demo.restservice.services.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FilmController {
    private FilmService filmsService;


    // Setter based dependency injection
    @Autowired
    public void setFilmsService(FilmService filmsService) {
        this.filmsService = filmsService;
    }

    @RequestMapping("/")
    public String redirToList(){
        return "redirect:/api/films";
    }

    @GetMapping("/api/films")
    public List<Film> listFilms() {
        return filmsService.listAll();
        //return service.findAll();
    }
}
