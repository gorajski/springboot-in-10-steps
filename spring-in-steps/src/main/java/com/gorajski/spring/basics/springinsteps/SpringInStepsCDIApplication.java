package com.gorajski.spring.basics.springinsteps;

import com.gorajski.spring.basics.springinsteps.cdi.SomeCDIBusiness;
import com.gorajski.spring.basics.springinsteps.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringInStepsCDIApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringInStepsCDIApplication.class);

    public static void main(String[] args) {

        ApplicationContext context =
                SpringApplication.run(SpringInStepsCDIApplication.class, args);

        SomeCDIBusiness business = context.getBean(SomeCDIBusiness.class);

        LOGGER.info("{} dao-{} ", business, business.getSomeCDIDAO());
    }

}
