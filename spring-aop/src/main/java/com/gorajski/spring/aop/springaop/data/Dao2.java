package com.gorajski.spring.aop.springaop.data;

import com.gorajski.spring.aop.springaop.aspect.TrackTime;
import org.springframework.stereotype.Repository;

@Repository
public class Dao2 {
    //Using the word "retrieve" conveys that we are getting data from an external source, such
    //as a database or API, and allows you to avoid the word "get" which is saved for getters.
    public String retrieveSomething() {
        return "Dao2";
    }
}
