package com.gorajski.spring.basics.springinsteps;

import com.gorajski.spring.basics.componentscan.ComponentDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication
//@ComponentScan("com.gorajski.spring.basics.componentscan")
@Configuration
@ComponentScan({"com.gorajski.spring.basics.springinsteps"})
public class SpringInStepsComponentScanApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringInStepsComponentScanApplication.class);

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringInStepsCDIApplication.class);
//                SpringApplication.run(SpringInStepsComponentScanApplication.class, args);

        ComponentDAO componentDAO = context.getBean(ComponentDAO.class);

        LOGGER.info("{}", componentDAO);
     }

}
