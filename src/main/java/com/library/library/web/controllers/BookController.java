package com.library.library.web.controllers;

import com.library.library.domain.book.BookService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {

    private final BookService bookService;
    private final ModelMapper mapper;

    public BookController(BookService bookService, ModelMapper mapper){
        this.bookService = bookService;
        this.mapper = mapper;
    }
}
