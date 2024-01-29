package com.yellow.connect.api;

import com.yellow.connect.dto.SportDTO;
import com.yellow.connect.service.BookService;
import com.yellow.connect.service.SportService;
import jakarta.annotation.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class SportController {

    @Resource
    private SportService sportService;

    @PostMapping("/sports")
    ResponseEntity<SportDTO> newSport(@RequestBody SportDTO sportDTO){
        return new ResponseEntity<>(sportService.saveSport(sportDTO), HttpStatus.OK);
    }
}
