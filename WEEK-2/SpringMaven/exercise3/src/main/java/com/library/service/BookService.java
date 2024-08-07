package main.java.com.library.service;

import main.java.com.library.repository.BookRepository;

public class BookService {
    public BookRepository bookRepo;

    public void setBookRepository(BookRepository bookRepo){
        this.bookRepo = bookRepo;
    }

    public void askBookRepo(){
        if (bookRepo.hasBooks()) {
            System.out.println("Books are available in the repository.");
        } else {
            System.out.println("No books found in the repository.");
        }
    }
}
