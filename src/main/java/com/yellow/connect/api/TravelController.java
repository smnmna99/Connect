package com.yellow.connect.api;

import com.yellow.connect.dto.TravelDTO;
import com.yellow.connect.service.TravelService;
import jakarta.annotation.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class TravelController {

    @Resource
    private TravelService travelService;

    @PostMapping("/travels")
    ResponseEntity<TravelDTO> newTravel(@RequestBody TravelDTO travelDTO){
        return new ResponseEntity<>(travelService.saveTravel(travelDTO), HttpStatus.OK);
    }
}
