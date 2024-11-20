package com.example2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


//@SpringBootApplication 
//it adds @Configuration, @EnableAutoConfiguration, @ComponentScan

// @Configuration- register extra beans in class or allows custom configurations

// @ComponentScan i.e.(@Component, @Service, @Repository, @Controller, custom @Configuration classes.)

// @EnableAutoConfiguration- automatically configure your application bases on dependencies you have
//on the classpath. For example if the dependency is spring-boot-starter-data-jpa then it will
// configure a JPA 'EntityManager', 'DataSource' , 'TransactionManager'.

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })

@SpringBootApplication
public class SpringbootDataJpaDemoApplication 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(SpringbootDataJpaDemoApplication.class, args); 
		/* SpringbootDataJpaDemoApplication.class enable where the spring boot start scanning 
			for components, configurations and beans because  this class is annotted with
			@SpringBootApplication and hence serves as the central configuration point for the
			entire application */
		
//	SpringApplication.run() method launches the application
		
//	 Spring Boot creates an ApplicationContext, which is a container that holds all the Spring-managed
	// beans. It scans for components (like @Component, @Service,
	
	// @Repository, etc.) and configurations within the package of the main class and its sub-packages.

		//Spring Boot starts an embedded web server (like Tomcat) to serve the application.
	// The application begins to run, with the Spring framework handling requests, managing transactions, and
	///interacting with the database as per the application's configuration.
	//G8_RESTfulWebService_Postman
	}

}







