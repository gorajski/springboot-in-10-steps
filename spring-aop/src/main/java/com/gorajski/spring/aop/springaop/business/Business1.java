package com.gorajski.spring.aop.springaop.business;

import com.gorajski.spring.aop.springaop.data.Dao1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business1 {

    @Autowired
    private Dao1 dao1;

    public String calculateSomething() {

        //Some Business logic...

        return dao1.retrieveSomething();
    }
}
