package com.yellow.connect.service;

import com.yellow.connect.dto.BookDTO;
import com.yellow.connect.mapper.BookMapper;
import com.yellow.connect.model.Book;
import com.yellow.connect.repository.BookRepository;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    @Resource
    private BookRepository repository;

    @Resource
    private BookMapper mapper;

    public BookDTO saveBook(BookDTO bookDTO){
        return mapper.entityToDto(repository.save(mapper.dtoToEntity(bookDTO)));
    }
}
