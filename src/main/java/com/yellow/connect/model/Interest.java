package com.yellow.connect.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public abstract class Interest {

    @Id
    @GeneratedValue
    private Long id;
}
