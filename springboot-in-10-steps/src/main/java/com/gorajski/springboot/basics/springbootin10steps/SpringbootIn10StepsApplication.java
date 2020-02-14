package com.gorajski.springboot.basics.springbootin10steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
//1. Indicates that this file is a Spring context file.  (@SpringBootConfiguration)
//		Spring will automatically identify this class as having Bean Definitions
//2. Enables Auto-Configuration
//3. Enables a Component Scan
public class SpringbootIn10StepsApplication {


	//WHAT IS AUTO CONFIGURATION?  Spring Boot looks at
	//a) Frameworks available on the CLASSPATH, and
	//b) Existing Beans configured for the application.
	//Based on these, Spring Boot provides basic configuration
	//needed to configure the application with these frameworks.
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootIn10StepsApplication.class, args);
		//**SpringApplication.run(...)**
		//Used to run a Spring Context.  Also, "run" returns an ApplicationContext.


		for (String name : context.getBeanDefinitionNames()) {
			System.out.println(name);
		}	// We can see from this that the auto-configuration wires in 120+ beans!!
	}

}
