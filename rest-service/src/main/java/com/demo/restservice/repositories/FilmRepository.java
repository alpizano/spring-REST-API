package com.demo.restservice.repositories;

import com.demo.restservice.domain.Film;
import org.springframework.data.repository.CrudRepository;

public interface FilmRepository extends CrudRepository<Film,Long> {


}
