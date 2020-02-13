package com.gorajski.spring.basics.springinsteps;

import com.gorajski.spring.basics.springinsteps.cdi.SomeCDIBusiness;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//import com.gorajski.spring.basics.springinsteps.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

//@SpringBootApplication
@Configuration
@ComponentScan
public class SpringInStepsCDIApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringInStepsCDIApplication.class);

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringInStepsCDIApplication.class);
//                SpringApplication.run(SpringInStepsCDIApplication.class, args);

        SomeCDIBusiness business = context.getBean(SomeCDIBusiness.class);

        LOGGER.info("{} dao-{} ", business, business.getSomeCDIDAO());
    }

}
