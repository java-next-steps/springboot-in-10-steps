package com.springbootbasics.springin10steps.aop.data;

import com.springbootbasics.springin10steps.aop.aspect.TrackTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BusinessDao1 {

    @TrackTime
    public String retrieveSomething(){
        return "Hello World! from Dao1";
    }
}
