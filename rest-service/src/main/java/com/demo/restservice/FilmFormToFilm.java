package com.demo.restservice;

import com.demo.restservice.domain.Film;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class FilmFormToFilm implements Converter<FilmForm, Film> {

    @Override
    public Film convert(FilmForm filmForm) {
        Film film = new Film();
//        if (productForm.getId() != null  && !StringUtils.isEmpty(productForm.getId())) {
//            product.setId(new Long(productForm.getId()));
//        }
        film.setId(filmForm.getId());
        film.setTitle(filmForm.getDescription());
        film.setDescription(filmForm.getDescription());
        film.setDirector(filmForm.getDirector());
        film.setProducer(filmForm.getProducer());
        film.setRelease_date(filmForm.getRelease_date());
        film.setRt_score(filmForm.getRt_score());


        return film;
    }
}
