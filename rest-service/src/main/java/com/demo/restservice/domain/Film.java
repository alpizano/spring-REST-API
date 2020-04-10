package com.demo.restservice.domain;

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



@Getter
@Setter
@Entity
public class Film {

    @Id
    // @Id signifies id is primary key
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


    // Need constructor for JPA entity?
}

