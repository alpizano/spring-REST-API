package com.demo.restservice;

import lombok.Getter;
import lombok.Setter;

/***
 * Data class for Film object
 */
@Getter
@Setter
public class Films {
    private final long id;
    private final String title;
    private final String description;
    private final String director;
    private final String producer;
    private final long release_date;
    private final int rt_score;
//    private final String people;
//    private final String species;
//    private final String locations;
//    private final String url;

    public Films(long id, String title, String description, String director, String producer, long release_date, int rt_score) {
            //, String people, String species, String locations, String url) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.director = director;
        this.producer = producer;
        this.release_date = release_date;
        this.rt_score = rt_score;
//        this.people = people;
//        this.species = species;
//        this.locations = locations;
//        this.url = url;
    }

}
