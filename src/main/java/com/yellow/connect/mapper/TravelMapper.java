package com.yellow.connect.mapper;


import com.yellow.connect.dto.TravelDTO;
import com.yellow.connect.model.Travel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface TravelMapper {
    Travel dtoToEntity(TravelDTO dto);

    TravelDTO entityToDto(Travel entity);
}
