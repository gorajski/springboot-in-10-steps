package com.gorajski.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class MethodExecutionCalculationAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Around("execution(* com.gorajski.spring.aop.springaop.business.*.*(..))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        //ProceedingJoinPoint allows us to "do something around" the method

        long startTime = System.currentTimeMillis();    //we do a thing before
        joinPoint.proceed();                            //we tell the method execution to start and finish
        long timeTaken = System.currentTimeMillis() - startTime; //we do a thing after

        logger.info("Time Taken by {} is {} ms", joinPoint, timeTaken);
    }
}
