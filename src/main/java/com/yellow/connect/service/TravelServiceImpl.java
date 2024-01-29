package com.yellow.connect.service;

import com.yellow.connect.dto.TravelDTO;
import com.yellow.connect.mapper.TravelMapper;
import com.yellow.connect.repository.TravelRepository;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class TravelServiceImpl implements TravelService{

    @Resource
    TravelRepository travelRepository;

    @Resource
    TravelMapper travelMapper;

    @Override
    public TravelDTO saveTravel(TravelDTO travelDTO) {
        return travelMapper.entityToDto(travelRepository.save(travelMapper.dtoToEntity(travelDTO)));
    }
}
