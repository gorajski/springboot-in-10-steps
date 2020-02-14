package com.gorajski.spring.basics.springinsteps.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)     //Get new BinarySearchImpl instance everytime.  Same SortAlgorithm instance will be used tho.
public class BinarySearchImpl {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    @Qualifier("quick")
    private SortAlgorithm sortAlgorithm;

    public int binarySearch(int[] numbers, int numberToSearchFor) {

        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm.getClass());

        return 3;
    }

    @PostConstruct  //As soon as bean is created, this method will be called
    public void postConstruct() {
        logger.info("postConstruct");
    }

    @PreDestroy  //Just before the bean is removed out of the context, this method will be called
    public void preDestroy() {
        logger.info("preDestroy");
    }

}
