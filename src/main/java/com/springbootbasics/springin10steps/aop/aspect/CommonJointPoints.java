package com.springbootbasics.springin10steps.aop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJointPoints {

    @Pointcut("execution(* com.springbootbasics.springin10steps.aop.data.*.*(..))")
    public void dataLayerExecution(){}

    @Pointcut("execution(* com.springbootbasics.springin10steps.aop.business.*.*(..))")
    public void businessLayerExecution(){}

    @Pointcut("com.springbootbasics.springin10steps.aop.aspect.CommonJointPoints.dataLayerExecution() && " +
            "com.springbootbasics.springin10steps.aop.aspect.CommonJointPoints.businessLayerExecution()")
    public void allLayerExecution(){}

    @Pointcut("bean(*dao*)")
    public void beanContainingWithDao(){}

    @Pointcut("within(com.springbootbasics.springin10steps.aop.data..*)")
    public void dataLayerExecutionWithin(){}

    @Pointcut("@annotation(com.springbootbasics.springin10steps.aop.aspect.TrackTime)")
    public void trackTimeAnnotation(){}
}
