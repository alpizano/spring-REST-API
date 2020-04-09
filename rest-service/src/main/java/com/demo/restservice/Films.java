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
    private final long date;
    private final int score;

    public Films(long id, String title, String description, String director, String producer, long date, int score) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.director = director;
        this.producer = producer;
        this.date = date;
        this.score = score;
    }

}
