package com.api.book.bookrestbook.Sevices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.book.bookrestbook.DAO.BookRepository;
import com.api.book.bookrestbook.Entitties.Book;

@Component
public class BookService {

    @Autowired
    private BookRepository bookrepository;
    // private static List<Book> list = new ArrayList<>();

    // static {
    //     // list.add(new Book(7, "java", "Harish"));
    //     // list.add(new Book(25, "Python", "Yogesh"));
    //     // list.add(new Book(2, "Rust", "Darshan"));
    // }

    //get all books
    public List<Book> getAllBooks() {

        List<Book> list = (List<Book>)bookrepository.findAll();

        return list;

        // return list;

    }
    








    //get book by Id
    // public Book getBookbyid(int id){
    
    //     Book book=null;
    //     try {
    //         book = bookrepository.findById(id);
    //     } catch (Exception e) {
    //         e.printStackTrace();
    //     }
    //     // book = list.stream().filter(t -> t.getId()==id).findFirst().get();
    //     return book;
    // }
    // Adding a book
    @SuppressWarnings("null")
    public Book addBook(Book b){
        
        Book result = bookrepository.save(b);
        return result;
    }


    public void deleteBookbyId(int id){
        // list = list.stream().filter(t -> t.getId()!=id? true:false).collect(Collectors.toList());
        bookrepository.deleteById(id);
    }

    public void updateBookbyId(Book book,int id){

    //     list = list.stream().map(b ->{
    //         if(b.getId()==id){
    //             b.setTitle(book.getTitle());
    //             b.setAuthor(book.getAuthor());
    //         }
    //         return b;
        
    //     }).collect(Collectors.toList());
        book.setId(id);
        bookrepository.save(book);

    }
    
}
