package com.demo.restservice.services;

import com.demo.restservice.domain.Film;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class FilmDAOService {

    @PersistenceContext
    private EntityManager entityManager;

    public long insert(Film film) {
        entityManager.persist(film);
        return film.getId();
    }
}
