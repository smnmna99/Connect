package com.yellow.connect.model;

import com.yellow.connect.model.enums.SportType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Sport extends Interest{

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private SportType type;

    @OneToOne
    private Interest interest;
}
