package com.gorajski.spring.basics.springinsteps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)     //Get new BinarySearchImpl instance everytime.  Same SortAlgorithm instance will be used tho.
public class BinarySearchImpl {

    @Autowired
    @Qualifier("quick")     //To use @Qualifier, you should NOT have the arg passed/set in a constructor
                            //**OR**
                            //If you do have it in a constructor, add @Qualifier there too as shown below. (Comment it in)
    private SortAlgorithm sortAlgorithm;

//        public BinarySearchImpl(@Qualifier("quick") SortAlgorithm sortAlgorithm) {
//        this.sortAlgorithm = sortAlgorithm;
//    }


    public int binarySearch(int[] numbers, int numberToSearchFor) {

        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm.getClass());

        return 3;
    }
}
