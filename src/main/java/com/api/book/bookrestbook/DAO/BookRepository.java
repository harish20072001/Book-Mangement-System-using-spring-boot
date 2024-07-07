package com.api.book.bookrestbook.DAO;

import org.springframework.data.repository.CrudRepository;

import com.api.book.bookrestbook.Entitties.Book;




public interface BookRepository extends CrudRepository<Book,Integer>{

}
