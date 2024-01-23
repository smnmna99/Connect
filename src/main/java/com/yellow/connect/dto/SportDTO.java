package com.yellow.connect.dto;

import com.yellow.connect.model.enums.SportType;
import lombok.Data;

@Data
public class SportDTO {
    private String name;
    private SportType type;
}
