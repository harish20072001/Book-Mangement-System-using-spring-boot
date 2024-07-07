package com.api.book.bookrestbook.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.book.bookrestbook.Entitties.Book;
import com.api.book.bookrestbook.Sevices.BookService;


@RestController
public class BookController {

    @Autowired
    private BookService bookService;


    @GetMapping("/books")
    public ResponseEntity<List<Book>> getBooks() {
        List<Book> list = bookService.getAllBooks();
        if (list.size() <= 0) {
            return ResponseEntity.status (HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(list);
        

    
    
}
    
    // @GetMapping("/books/{id}")
    // public Book getBookbyId(@PathVariable("id")int id) {
    //     return bookService.getBookbyid(id);
    // }
    

    @PostMapping("/books")
    public Book setBook(@RequestBody Book book) {
        
        Book b = bookService.addBook(book);
        return b;
    }

    @DeleteMapping("/books/{id}")
    public void deleteBook(@PathVariable ("id") int id){
        bookService.deleteBookbyId(id);

    }

    @PutMapping("/books/{id}")
    public void updateBook(@RequestBody Book book,@PathVariable int id) {
        
        this.bookService.updateBookbyId(book,id);
    }
    

}
