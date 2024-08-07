package main.java.com.exercise6.service;

import org.springframework.stereotype.Service;

import main.java.com.exercise6.repository.BookRepository;

@Service
public class BookService {
    @SuppressWarnings("unused")
    private BookRepository bookRepository;

    // Setter method for BookRepository
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
}
