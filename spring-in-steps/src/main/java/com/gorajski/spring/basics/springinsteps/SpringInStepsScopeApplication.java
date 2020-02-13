package com.gorajski.spring.basics.springinsteps;

import com.gorajski.spring.basics.springinsteps.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringInStepsScopeApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringInStepsScopeApplication.class);

    public static void main(String[] args) {

        ApplicationContext context =
                SpringApplication.run(SpringInStepsScopeApplication.class, args);

        PersonDAO personDAO = context.getBean(PersonDAO.class);
        PersonDAO personDAO2 = context.getBean(PersonDAO.class);

        LOGGER.info("{}", personDAO);
        LOGGER.info("{}", personDAO.getJdbcConnection());   // this is one JdbcConnection instance
        LOGGER.info("{}", personDAO.getJdbcConnection());   // this is another JdbcConnection instance
        LOGGER.info("{}", personDAO2);
        LOGGER.info("{}", personDAO2.getJdbcConnection());  // yet another
    }

}
