package com.gorajski.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class UserAccessAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    // What kind of method calls would I want to intercept:


    @Before("execution(* com.gorajski.spring.aop.springaop.data.*.*(..))")
    // execution(* PACKAGE.*.*(..))
    //         execution(*      <- here * means any method irrespective of return type
    //         PACKAGE..*       <- any class of any SUBPACKAGE within the specified PACKAGE
    //         .*               <- all of that classes methods
    //         (..)             <- irrespective of their arguments

    // POINT CUT - the expression which defines what kind of methods you want to intercept.
    // ADVICE - what you should do when the action is intercepted.
    // POINT CUT + ADVICE = Aspect.
    // JOIN POINT - a specific execution instance of an interception.
    // WEAVING - the action of the AOP framework inserting your Aspect is being executed.
    // WEAVER - the AOP framework.

    public void before(JoinPoint joinPoint) {
        //What to do?
        logger.info("Check for user access ");
        logger.info("Intercepted Method Call - {}", joinPoint);
    }
}
