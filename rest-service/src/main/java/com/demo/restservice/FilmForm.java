package com.demo.restservice;

import lombok.Getter;
import lombok.Setter;

/***
 * Data class for Film object
 */
@Getter
@Setter
public class FilmForm {
    private long id;
    private String title;
    private String description;
    private String director;
    private String producer;
    private long release_date;
    private int rt_score;
//    private final String people;
//    private final String species;
//    private final String locations;
//    private final String url;

//    public FilmForm(long id, String title, String description, String director, String producer, long release_date, int rt_score) {
//            //, String people, String species, String locations, String url) {
//        this.id = id;
//        this.title = title;
//        this.description = description;
//        this.director = director;
//        this.producer = producer;
//        this.release_date = release_date;
//        this.rt_score = rt_score;
//        this.people = people;
//        this.species = species;
//        this.locations = locations;
//        this.url = url;
//    }

}
