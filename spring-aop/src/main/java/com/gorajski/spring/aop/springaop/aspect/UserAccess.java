package com.gorajski.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class UserAccess {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    // What kind of method calls would I want to intercept:
    // execution(* PACKAGE.*.*(..))
    //         execution(*      <- here * means any method irrespective of return type
    //         PACKAGE.*        <- any class within the specified PACKAGE
    //         .*               <- all of that classes methods
    //         (..)             <- irrespective of their arguments

    @Before("execution(* com.gorajski.spring.aop.springaop.business.*.*(..))")
    public void before(JoinPoint joinPoint) {
        //What to do?
        logger.info("Check for user access ");
        logger.info("Intercepted Method Call - {}", joinPoint);
    }
}
