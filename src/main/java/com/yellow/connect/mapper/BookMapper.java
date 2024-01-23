package com.yellow.connect.mapper;

import com.yellow.connect.dto.BookDTO;
import com.yellow.connect.model.Book;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface BookMapper {
    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

   Book dtoToEntity(BookDTO dto);
    BookDTO entityToDto(Book entity);
}
