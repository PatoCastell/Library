package com.library.library.data.gateways;

import com.library.library.data.repositories.BookRepository;
import com.library.library.domain.book.BookGateway;
import com.library.library.domain.book.BookModel;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DefaultBookGateway implements BookGateway {

    private final BookRepository bookRepository;

    private final ModelMapper mapper;//<== Abstraer a metodos genericos

    public DefaultBookGateway(BookRepository bookRepository, ModelMapper mapper){
        this.bookRepository = bookRepository;
        this.mapper = mapper;
    }

    @Override
    public BookModel save(BookModel bookModel) {
        return null;
    }

    @Override
    public BookModel findById(Long id) {
        return null;
    }

    @Override
    public List<BookModel> findAll() {
        return null;
    }

    @Override
    public BookModel update(BookModel bookModel) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
