package com.yellow.connect.mapper;

import com.yellow.connect.dto.SportDTO;
import com.yellow.connect.model.Sport;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface SportMapper {

    SportDTO entityToDto(Sport entity);

    Sport dtoToEntity(SportDTO dto);

}
