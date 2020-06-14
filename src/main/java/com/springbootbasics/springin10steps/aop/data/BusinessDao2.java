package com.springbootbasics.springin10steps.aop.data;

import org.springframework.stereotype.Repository;

@Repository
public class BusinessDao2 {

    public String retrieveSomething(){
        return "Hello World! from Dao2";
    }
}
