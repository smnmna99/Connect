package com.yellow.connect.dto;

import com.yellow.connect.model.enums.BookType;
import lombok.Data;

@Data
public class BookDTO {
    private String writer;
    private BookType type;
}
