package main.java.com.library;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import main.java.com.library.Service.BookService;

public class LibraryManagementApp {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService =  (BookService) context.getBean("bookService");

        bookService.askBookRepo();
    }
}