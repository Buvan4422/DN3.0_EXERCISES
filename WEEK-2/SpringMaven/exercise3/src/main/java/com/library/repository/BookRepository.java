package main.java.com.library.repository;

import java.util.Random;

public class BookRepository {
    public Boolean hasBooks(){
        Random random = new Random();
        return random.nextBoolean();
    }
}
