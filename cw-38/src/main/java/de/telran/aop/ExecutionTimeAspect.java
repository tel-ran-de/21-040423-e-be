package de.telran.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class ExecutionTimeAspect {
    @Pointcut("execution(* *.getAll(..))")
    public void doSmth(){

    }

    @Before("doSmth()")
    public void before(){
        System.out.println("test");
    }


    @Pointcut("execution(* *.OrderController.getAll(..))")
    public void execute(){

    }
    @Around("execute()")
    public void around(ProceedingJoinPoint jp) {
        System.out.println("transaction started");
        try {
            jp.proceed();
            System.out.println("transaction finished");
        } catch (Throwable e) {
            System.out.println("transaction rollback");
            throw new RuntimeException(e);
        }
    }

}
