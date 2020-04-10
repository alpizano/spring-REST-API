package com.demo.restservice;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/***
 * Entity class
 * Should map to Films table
 */


@Entity
@Getter
@Setter
public class Films {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    // Final variable throws "might not have been initialized error
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
}

