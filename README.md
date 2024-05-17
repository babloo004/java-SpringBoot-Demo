# SpringBoot Application for Demonstrating IoC and DI

This repository contains a simple SpringBoot application that demonstrates the principles of Inversion of Control (IoC) and Dependency Injection (DI). The application uses SpringBoot's capabilities to manage object creation and dependencies, simplifying the development process and promoting best practices in Java development.

## Overview

### Inversion of Control (IoC)
IoC is a design principle that inverts the control of object creation and management from the developer to the Spring framework. Instead of creating and managing objects manually, Spring takes care of these tasks, allowing developers to focus on business logic.

### Dependency Injection (DI)
DI is a design pattern where an object's dependencies are injected by the framework rather than being created internally. This promotes loose coupling and makes the code more modular and testable.

### SpringBoot
SpringBoot is an extension of the Spring framework that simplifies the setup and development of Spring applications. It uses annotations to automate configuration and reduce boilerplate code.

## Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Maven or Gradle build tool
- An IDE that supports SpringBoot (e.g., IntelliJ IDEA, Eclipse)

### Installation
1. Clone the repository:
   ```sh
   git clone https://github.com/yourusername/springboot-ioc-di-demo.git
   cd springboot-ioc-di-demo
   ```

2. Open the project in your IDE.

3. Build the project using Maven or Gradle:
   ```sh
   mvn clean install
   ```
   or
   ```sh
   ./gradlew build
   ```

### Running the Application
Run the main class `SpringbootApplication` to start the application:
```sh
mvn spring-boot:run
```
or
```sh
./gradlew bootRun
```

### Code Explanation

#### SpringbootApplication.java
This is the main class of the SpringBoot application. It contains the `main` method which starts the SpringBoot application using `SpringApplication.run()`. The `ApplicationContext` object returned by this method is used to get the beans managed by Spring.

```java
package com.avinash.Springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication  // Annotation to mark this as a SpringBoot application
public class SpringbootApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringbootApplication.class, args);
        Alien obj = context.getBean(Alien.class);
        obj.code();
    }
}
```

#### IoC and DI Concepts

1. **IoC (Inversion of Control):**
   - Spring manages the lifecycle of beans (objects) in the application, relieving the developer from manually handling object creation and dependency management.

2. **DI (Dependency Injection):**
   - Dependencies between objects are injected by the Spring container, promoting loose coupling and making the application easier to maintain and test.

3. **Annotations:**
   - `@SpringBootApplication`: Marks the main class of a SpringBoot application.
   - `@Component`: Tells Spring to create an instance of the annotated class and manage it as a bean.

## Example Classes

### Alien.java
This class represents a simple bean that is managed by Spring. It is annotated with `@Component` to indicate that it should be managed by Spring.

```java
package com.avinash.Springboot;

import org.springframework.stereotype.Component;

@Component
public class Alien {
    public void code() {
        System.out.println("I am coding...");
    }
}
```

### Running the Application
When you run the application, SpringBoot starts up and the `Alien` bean is created and managed by Spring. The `getBean()` method is used to retrieve the `Alien` bean from the `ApplicationContext`, and the `code()` method is called on the bean.

## Contributing

Feel free to contribute to this project by submitting pull requests. Please ensure that your contributions adhere to the project's coding standards and best practices.

