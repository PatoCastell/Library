package com.library.library.domain.book;

import java.util.List;

public interface BookGateway {

    BookModel save(BookModel bookModel);
    BookModel findById(Long id);
    List<BookModel> findAll();
    BookModel update(BookModel bookModel);
    void delete(Long id);

}
