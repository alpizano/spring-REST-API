package com.demo.restservice.controllers;

import com.demo.restservice.domain.Film;
import com.demo.restservice.repositories.FilmRepository;
import com.demo.restservice.services.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.Optional;

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

    // Returns JSON response List of films
    @GetMapping({"/film/list", "/film"})
    public List<Film> listFilms() {
        // Using CRUD repository override of findAll()
       // return filmsService.listAll();
        return filmRepository.findAll();
    }

    // Returns JSON response of Film with specific id
    @GetMapping("/film/show/{id}")
    public Film getFilmById(@PathVariable String id) {
        // Error handling if not found?
        Optional<Film> var = filmRepository.findById(Long.valueOf(id));
        return var.get();
    }

    @PostMapping("/film/new")
    public ResponseEntity<Object> insertFilm(@Valid @RequestBody Film film) {
        Film savedFilm = filmRepository.save(film);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedFilm.getId()).toUri();

        return ResponseEntity.created(location).build();
    }

    @DeleteMapping("/film/delete/{id}")
        public void deleteFilmById(@PathVariable String id) {
            filmRepository.deleteById(Long.valueOf(id));
    }
}
