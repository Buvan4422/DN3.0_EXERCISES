package main.java.com.exercise8.repository;

import java.util.Random;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {

    public int getBookCount(){
        Random r= new Random() ;
        return r.nextInt(1000);
    }
    public String gotAns(){
        return "BookService bean retrieved successfully through constructor injection.";
    }
}

