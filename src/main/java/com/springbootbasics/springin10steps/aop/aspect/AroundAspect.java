package com.springbootbasics.springin10steps.aop.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AroundAspect {

    Logger LOGGER = LoggerFactory.getLogger(AroundAspect.class);

    @Around("execution(* com.springbootbasics.springin10steps.aop.business.*.*(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        proceedingJoinPoint.proceed();
        long executionTime = System.currentTimeMillis() - startTime;
        LOGGER.info("AroundAspect: method calls: {}, execTime: {}", proceedingJoinPoint, executionTime);
    }
}
