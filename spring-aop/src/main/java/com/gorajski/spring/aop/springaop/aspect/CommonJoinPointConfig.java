package com.gorajski.spring.aop.springaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {
    @Pointcut("execution(* com.gorajski.spring.aop.springaop.business.*.*(..))")
    public void dataLayerExecution(){}

    @Pointcut("execution(* com.gorajski.spring.aop.springaop.data.*.*(..))")
    public void businessLayerExecution(){}
}
