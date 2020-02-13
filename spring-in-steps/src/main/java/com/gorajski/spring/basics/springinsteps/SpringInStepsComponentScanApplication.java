package com.gorajski.spring.basics.springinsteps;

import com.gorajski.spring.basics.componentscan.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.gorajski.spring.basics.componentscan")
public class SpringInStepsComponentScanApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringInStepsComponentScanApplication.class);

    public static void main(String[] args) {

        ApplicationContext context =
                SpringApplication.run(SpringInStepsComponentScanApplication.class, args);

        ComponentDAO componentDAO = context.getBean(ComponentDAO.class);

        LOGGER.info("{}", componentDAO);
     }

}
