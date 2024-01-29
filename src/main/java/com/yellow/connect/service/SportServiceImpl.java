package com.yellow.connect.service;

import com.yellow.connect.dto.SportDTO;
import com.yellow.connect.mapper.SportMapper;
import com.yellow.connect.repository.SportRepository;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class SportServiceImpl implements SportService{

    @Resource
    private SportMapper sportMapper;

    @Resource
    private SportRepository repository;

    @Override
    public SportDTO saveSport(SportDTO dto) {
        return sportMapper.entityToDto(repository.save(sportMapper.dtoToEntity(dto)));
    }
}
