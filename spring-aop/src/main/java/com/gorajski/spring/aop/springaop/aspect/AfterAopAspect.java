package com.gorajski.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAopAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    // What kind of method calls would I want to intercept:


    @AfterReturning(
            value="execution(* com.gorajski.spring.aop.springaop.business.*.*(..))",
            returning="result"      //this should match name of the method's second argument
    )
    public void afterReturning(JoinPoint joinPoint, Object result) {
        //What to do?
        logger.info("{} returned with value {}", joinPoint, result);
    }

    @After(
            value="execution(* com.gorajski.spring.aop.springaop.business.*.*(..))"
    )
    public void after(JoinPoint joinPoint) {
        logger.info("after execution of {}", joinPoint);
    }

//ALTERNATIVE TO @After, which is a catch-all for happy and sad paths
//    @AfterThrowing(
//            value="execution(* com.gorajski.spring.aop.springaop.business.*.*(..))",
//            throwing = "exception"
//    )
//    public void afterThrowing(JoinPoint joinPoint, Exception exception) {
//        //What to do?
//        logger.info("{} returned with value {}", joinPoint, exception);
//    }
}
