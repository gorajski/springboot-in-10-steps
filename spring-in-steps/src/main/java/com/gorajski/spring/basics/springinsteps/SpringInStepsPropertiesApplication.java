package com.gorajski.spring.basics.springinsteps;

import com.gorajski.spring.basics.springinsteps.basic.BinarySearchImpl;
import com.gorajski.spring.basics.springinsteps.properties.SomeExternalService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class SpringInStepsPropertiesApplication {



	public static void main(String[] args) {

		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(
						SpringInStepsPropertiesApplication.class);
//				SpringApplication.run(SpringInStepsBasicApplication.class, args);

		SomeExternalService someExternalService = context.getBean(SomeExternalService.class);

		System.out.println(someExternalService.returnServiceURL());

		context.close();
	}

}
