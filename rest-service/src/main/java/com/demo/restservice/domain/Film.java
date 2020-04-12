package com.demo.restservice.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/***
 * Entity class
 * Should map to Film table
 */

@Getter
@Setter
@Entity
public class Film {
    // Final variable throws "might not have been initialized error
    @Id
    // @Id signifies id is primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    // @Lob throws DataException
    @Column(columnDefinition = "TEXT")
    private String description;
    private String director;
    private String producer;
    private String release_date;
    private String rt_score;
//    private final String people;
//    private final String species;
//    private final String locations;
//    private final String url;


    // Need constructor for JPA entity?
}

