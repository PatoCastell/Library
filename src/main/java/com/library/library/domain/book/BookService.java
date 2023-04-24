package com.library.library.domain.book;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookGateway bookGateway;

    public BookService(BookGateway bookGateway){
        this.bookGateway = bookGateway;
    }

    public BookModel save(BookModel bookModel){
        return bookGateway.save(bookModel);
    }

    public BookModel findById(Long id){
        return bookGateway.findById(id);
    }

    public List<BookModel> findAll(){
        return bookGateway.findAll();
    }

    public BookModel update(BookModel bookModel){
        return bookGateway.update(bookModel);
    }

    public void delete(Long id){
        bookGateway.delete(id);
    }
}
