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
    //Weaving and Weaver
    @Before("com.springbootbasics.springin10steps.aop.aspect.CommonJointPoints.dataLayerExecution()")
    public void before(JoinPoint joinPoint){
        //What to do? Advice
        LOGGER.info("Intercepted method calls {}", joinPoint);
    }
}
