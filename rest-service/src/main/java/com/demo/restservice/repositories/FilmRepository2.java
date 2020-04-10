package com.demo.restservice.repositories;

import com.demo.restservice.domain.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository2 extends JpaRepository<Film,Long> {
    
}
