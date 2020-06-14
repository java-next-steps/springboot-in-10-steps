package com.springbootbasics.springin10steps.aop.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BusinessDao {

    public String retrieveSomething(){
        return "Hello World! from Dao1";
    }
}
