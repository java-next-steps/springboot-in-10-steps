package com.springbootbasics.springin10steps.aop.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//AOP, Configurations
@Aspect
@Configuration
public class AfterAspect {

    Logger LOGGER = LoggerFactory.getLogger(AfterAspect.class);

    //What kind of method calls I would intercept
    //Weaving and Weaver
    @AfterReturning(
            value="execution(* com.springbootbasics.springin10steps.aop.business.*.*(..))",
            returning = "result")
    public void after(JoinPoint joinPoint, Object result){
        //What to do? Advice
        LOGGER.info("After returning from the intercepted method calls {}", joinPoint);
        LOGGER.info("Return value: {}", result);
    }

    @AfterThrowing(
            value="execution(* com.springbootbasics.springin10steps.aop.business.*.*(..))",
            throwing = "exception")
    public void after(JoinPoint joinPoint, Exception exception){
        //What to do? Advice
        LOGGER.info("After returning from the intercepted method calls {}", joinPoint);
        LOGGER.info("Return value: {}", exception);
    }

    @After(value="com.springbootbasics.springin10steps.aop.aspect.CommonJointPoints.businessLayerExecution()")
    public void after(JoinPoint joinPoint){
        //What to do? Advice
        LOGGER.info("After execution of the jointpoint: {}", joinPoint);
    }
}
