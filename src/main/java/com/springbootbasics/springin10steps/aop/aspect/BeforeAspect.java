package com.springbootbasics.springin10steps.aop.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//AOP, Configurations
@Aspect
@Configuration
public class BeforeAspect {

    Logger LOGGER = LoggerFactory.getLogger(BeforeAspect.class);

    //What kind of method calls I would intercept
    @Before("execution(* com.springbootbasics.springin10steps.aop.business.*.*(..))")
    public void before(JoinPoint joinPoint){
        //What to do?
        LOGGER.info("Intercepted method calls {}", joinPoint);
    }
}
