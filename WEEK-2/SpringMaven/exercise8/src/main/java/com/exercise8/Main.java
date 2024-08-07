package main.java.com.exercise8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import main.java.com.exercise8.service.BookService;

public class Main {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService bookService = context.getBean(BookService.class);
        System.out.println(bookService.getAns());

        int bookCount = bookService.getBookCount();
        System.out.println("Number of books: " + bookCount);
    }
}