package main.java.com.exercise5.service;

import main.java.com.exercise5.repository.BookRepository;

public class BookService {
    public BookRepository bookRepo;

    public void setBookRepository(BookRepository bookRepo){
        this.bookRepo = bookRepo;
    }
}
