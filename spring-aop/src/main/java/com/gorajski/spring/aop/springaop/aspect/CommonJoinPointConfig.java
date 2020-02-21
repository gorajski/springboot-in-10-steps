package com.gorajski.spring.aop.springaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {
    @Pointcut("execution(* com.gorajski.spring.aop.springaop.business.*.*(..))")
    public void dataLayerExecution(){}

    @Pointcut("execution(* com.gorajski.spring.aop.springaop.data.*.*(..))")
    public void businessLayerExecution(){}

    @Pointcut("com.gorajski.spring.aop.springaop.aspect.CommonJoinPointConfig.dataLayerExecution() && com.gorajski.spring.aop.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()")
    public void allLayerExecution(){}

    @Pointcut("bean(dao*)")
    public void beanStartingWithDao(){}

    @Pointcut("bean(*dao*)")
    public void beanContainingDao(){}

    //Intercept all the calls within the data layer.  Similar to dataLayerExecution(){}, just implemented with "within"
    @Pointcut("within(com.gorajski.spring.aop.springaop.data..*)")
    public void dataLayerExecutionUtilizingWithinKeyword(){}

    @Pointcut("@annotation(com.gorajski.spring.aop.springaop.aspect.TrackTime)")
    public void trackTimeAnnotation(){}
}
