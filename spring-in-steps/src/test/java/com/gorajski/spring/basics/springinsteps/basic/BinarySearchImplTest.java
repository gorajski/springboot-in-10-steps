package com.gorajski.spring.basics.springinsteps.basic;

import com.gorajski.spring.basics.springinsteps.SpringInStepsBasicApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@ContextConfiguration(classes = SpringInStepsBasicApplication.class)    //defines the context
@RunWith(SpringRunner.class)    //runs the context
public class BinarySearchImplTest {

    @Autowired
    BinarySearchImpl binarySearch;

    @Test
    public void testBasicScenario() throws Exception {
        int result = binarySearch.binarySearch(new int[]{}, 5);
        assertEquals(3, result);
    }

}