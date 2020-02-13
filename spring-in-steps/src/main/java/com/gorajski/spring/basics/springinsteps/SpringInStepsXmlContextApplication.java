package com.gorajski.spring.basics.springinsteps;

import com.gorajski.spring.basics.springinsteps.xml.XmlPersonDAO;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan
public class SpringInStepsXmlContextApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        XmlPersonDAO personDAO = context.getBean(XmlPersonDAO.class);

        System.out.println(personDAO);
        System.out.println(personDAO.getXMLJdbcConnection());

        context.close();
    }

}
