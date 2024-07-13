package com.api.book.bookrestbook.Sevices;

import com.api.book.bookrestbook.Entitties.Book;
import java.util.List;
import java.util.Optional;

public interface BookService {
    List<Book> getAllBooks();
    Optional<Book> getBookById(int id);
    Book saveBook(Book book);
    void deleteBook(int id);
}
