package com.springbootbasics.springin10steps.aop.business;

import com.springbootbasics.springin10steps.aop.data.BusinessDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusinessService1 {

    @Autowired
    private BusinessDao businessDao1;

    public String calculateSomething(){
        return this.businessDao1.retrieveSomething();
    }
}
