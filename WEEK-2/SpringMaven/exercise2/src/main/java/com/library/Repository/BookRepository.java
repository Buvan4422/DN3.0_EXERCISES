package main.java.com.library.Repository;

import java.util.Random;

public class BookRepository {

    //This method randomly generates true or false boolean values
    public Boolean hasBooks(){
        Random random = new Random();
        return random.nextBoolean();
    }
}
