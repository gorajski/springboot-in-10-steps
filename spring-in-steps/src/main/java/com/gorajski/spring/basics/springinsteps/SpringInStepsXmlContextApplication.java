package com.gorajski.spring.basics.springinsteps;

import com.gorajski.spring.basics.springinsteps.xml.XmlPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.List;

public class SpringInStepsXmlContextApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringInStepsXmlContextApplication.class);

    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {

            LOGGER.info("BEANS LOADED -> {}", (Object) context.getBeanDefinitionNames());

            XmlPersonDAO personDAO = context.getBean(XmlPersonDAO.class);

            LOGGER.info("{} {}", personDAO, personDAO.getXMLJdbcConnection());

        }
    }

}
