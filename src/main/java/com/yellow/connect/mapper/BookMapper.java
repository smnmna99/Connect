package com.yellow.connect.mapper;

import com.yellow.connect.dto.BookDTO;
import com.yellow.connect.model.Book;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookMapper {
   Book dtoToEntity(BookDTO dto);
    BookDTO entityToDto(Book entity);
}
