package main.java.com.library.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Around("execution(* com.library..*(..))")
    public Object logExecutionTimes(ProceedingJoinPoint pjp) throws Throwable{
        long startTime = System.currentTimeMillis();
        Object proceed = pjp.proceed();
        Long endTime = System.currentTimeMillis();

        System.out.println(pjp.getSignature().toShortString() + " executed in " + (endTime-startTime) + "ms");
        return proceed;
    }
}
