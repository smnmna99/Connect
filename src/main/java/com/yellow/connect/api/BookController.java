package com.yellow.connect.api;

import com.yellow.connect.dto.BookDTO;
import com.yellow.connect.service.BookService;
import jakarta.annotation.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class BookController {

    @Resource
    private BookService bookService;

    @PostMapping("/books")
    ResponseEntity<BookDTO> newBook(@RequestBody BookDTO bookDTO) {
        return new ResponseEntity<>(bookService.saveBook(bookDTO), HttpStatus.OK);
    }
}
