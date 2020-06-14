package com.springbootbasics.springin10steps.aop.business;

import com.springbootbasics.springin10steps.aop.data.BusinessDao2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusinessService2 {

    @Autowired
    private BusinessDao2 businessDao2;

    public String calculateSomething(){
        return this.businessDao2.retrieveSomething();
    }
}
