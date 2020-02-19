package com.gorajski.spring.aop.springaop.business;

import com.gorajski.spring.aop.springaop.data.Dao2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business2 {

    @Autowired
    private Dao2 dao2;

    public String calculateSomething() {

        //Some Business logic...

        return dao2.retrieveSomething();
    }
}
