package com.demo.restservice;

import com.demo.restservice.domain.Film;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class FilmToFilmForm implements Converter<Film,FilmForm> {
    @Override
    public FilmForm convert(Film film) {
        FilmForm filmForm = new FilmForm();

        filmForm.setId(film.getId());
        filmForm.setTitle(film.getDescription());
        filmForm.setDescription(film.getDescription());
        filmForm.setDirector(film.getDirector());
        filmForm.setProducer(film.getProducer());
        filmForm.setRelease_date(film.getRelease_date());
        filmForm.setRt_score(film.getRt_score());

        return filmForm;
    }
}
