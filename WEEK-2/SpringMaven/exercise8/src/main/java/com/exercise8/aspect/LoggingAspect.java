package main.java.com.exercise8.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* main.java.com.exercise8.service.BookService.*(..))")
    public void logBefore() {
        System.out.println("LoggingAspect: Before method execution.");
    }

    @After("execution(* main.java.com.exercise8.service.BookService.*(..))")
    public void logAfter() {
        System.out.println("LoggingAspect: After method execution.");
    }
}