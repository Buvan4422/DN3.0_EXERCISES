package main.java.com.exercise8.service;

import org.springframework.stereotype.Service;

import main.java.com.exercise8.repository.BookRepository;

@Service
public class BookService {
    public BookRepository bookRepo,br;

    public BookService(BookRepository bookRepo){
        this.br = bookRepo;
    }

    public void setBookRepository(BookRepository bookRepo){
        this.bookRepo = bookRepo;
    }

    public int getBookCount() {
        return bookRepo.getBookCount();
    }
    public String getAns(){
        return br.gotAns();
    }

}

