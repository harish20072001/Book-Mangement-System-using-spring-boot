package com.api.book.bookrestbook.Repository;

import com.api.book.bookrestbook.Entitties.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {

}

