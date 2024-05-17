//Importing required packages
//Automatically imported by IDE

package com.avinash.Springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

//SpringBoot works on top of Spring framework
//Actually it is out job to create, manage and destroy the objects
//other than maintaining the objects the main responsibility of developers is to focus on business logic of application
//actually we control the process of maintaining the objects, but in we will take the help of Spring and give the control to spring
//This principle is known as Inversion of Control (IoC)
//IoC means we will give the control of maintaining the objects to the Spring
//The objects which are maintained by Spring are known as "Beans"

//DI stands for Dependency Injection
//In our code, an object may depend on other Object
//for example Mobile object will depend upon sim object to make call
//these dependencies are injected using Spring
//Dependency Injection is a Design Pattern

//@SpringBootApplication is an annotation
//this annotation helps IDE to differentiate between Spring project and SpringBoot project
//In SpringBoot projects we will use this Annotation

@SpringBootApplication  //Annotation

public class SpringbootApplication {

	public static void main(String[] args) {

		//SpringApplication is a class
		//run() method will start our SpringBoot Application
		//run method will return us "ConfigurableApplicationContext" object
		//"ConfigurableApplicationContext" implements "ApplicationContext" interface
		//as we have discussed above that, in SpringBoot the objects are created and maintained by Spring
		//to create object we need to tell the SpringBoot to create that object by annotation
		//we will use "@Component" annotation, which tells the SpringBoot to create the specified object
		//to get the created object we will use "getBean()" method on the ApplicationContext object
		//"getBean()" method will accept one parameter in SpringBoot
		//it accepts  class name, for which we want object

		//in normal java we will create the object by new key word, but in SpringBoot we will use IoC principle
		ApplicationContext context =  SpringApplication.run(SpringbootApplication.class, args);
		//refer to Alien.java file
		Alien obj = context.getBean(Alien.class);
		obj.code();
	}
}
