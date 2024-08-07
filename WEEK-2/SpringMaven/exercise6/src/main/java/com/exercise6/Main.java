package main.java.com.exercise6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import main.java.com.exercise6.service.BookService;

public class Main {
    @SuppressWarnings({ "unused", "resource" })
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService bookService = context.getBean(BookService.class);

        System.out.println("Successfully verified annotation-based configuration.");

    }
}