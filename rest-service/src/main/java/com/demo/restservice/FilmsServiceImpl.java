package com.demo.restservice;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class FilmsServiceImpl implements FilmsService{

    FilmsRepository filmsRepository;

    @Autowired
    public FilmsServiceImpl(FilmsRepository filmsRepository) {
        this.filmsRepository = filmsRepository;
    }

    @Override
    public List<Films> listAll() {
        List<Films> films = new ArrayList<>();
        filmsRepository.findAll().forEach(films::add); //fun with Java 8
        return films;
    }
}
