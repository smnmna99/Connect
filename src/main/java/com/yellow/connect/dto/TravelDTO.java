package com.yellow.connect.dto;

import com.yellow.connect.model.enums.TravelType;
import lombok.Data;

@Data
public class TravelDTO {
    private String place;
    private TravelType type;
}
