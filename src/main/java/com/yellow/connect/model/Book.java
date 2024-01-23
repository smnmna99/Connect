package com.yellow.connect.model;

import com.yellow.connect.model.enums.BookType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Book extends Interest{

    @Id
    @GeneratedValue
    private Long id;
    private String writer;

    private BookType type;

    @OneToOne
    private Interest interest;

}
