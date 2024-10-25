## SPRING FRAMEWORK

This application is a basic User Management System 
built using Spring Core without Spring Boot, 
Spring MVC, and Spring Data JPA. It allows users to perform CRUD operations 
such as creating, viewing, updating, and deleting users through a web interface.

## Table of Contents
- [Project Structure](#project-structure)
- [Dependency Injection (DI)](#dependency-injection-di)
- [Inversion of Control (IoC)](#inversion-of-control-ioc)
- [Spring Beans](#spring-beans)
- [Bean Scopes](#bean-scopes)
- [ApplicationContext](#applicationcontext)
- [Component Scanning and Stereotype Annotations](#component-scanning-and-stereotype-annotations)
- [Spring Data JPA](#spring-data-jpa)
- [Spring MVC](#spring-mvc)
- [Installation and Setup](#installation-and-setup)

### Overview of Spring Framework
Spring is a powerful framework for building Java applications, especially web apps. It simplifies development by providing tools like dependency injection, aspect-oriented programming (AOP), and a flexible architecture, making it easier to manage code and improve efficiency.
### Project Structure
```sh
.
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── MBAREK0/
│   │   │           └── web/
│   │   │               ├── controller/
│   │   │               │   └── MembreController.java
│   │   │               ├── entity/
│   │   │               │   └── Membre.java
│   │   │               ├── repository/
│   │   │               │   └── MembreRepository.java
│   │   │               ├── services/
│   │   │               │   └── MembreService.java
│   │   │               └── Main.java
│   │   ├── webapp/
│   │   │   └── WEB-INF/
│   │   │       └── views/
│   │   │           └── index.jsp
│   │   │       ├── applicationContext.xml
│   │   │       ├── dispatcher-servlet.xml
│   │   │       └── web.xml
├── pom.xml
└── README.md
```

## Dependency Injection (DI)
**What It Is**: Dependency Injection is a way to provide an object with its needed parts (dependencies) from outside rather than having the object create them itself.

**Benefits**:
- **Easier to Change**: You can easily swap one part for another.
- **Simpler Testing**: It makes testing easier because you can replace parts with mock versions.

**Types of DI**:
1. **Constructor Injection**: You provide dependencies when creating the object.
2. **Setter Injection**: You set dependencies using special methods after the object is created.
3. **Field Injection**: You directly inject dependencies into fields using annotations.

---

## Inversion of Control (IoC)
**What It Is**: Inversion of Control means that instead of your code controlling the flow of the program, the framework (like Spring) takes charge. This makes your code cleaner and easier to manage.

**How It Works**: The Spring container creates and manages the objects (beans) you need in your application.

---

## Spring Beans
**What They Are**: A Spring bean is an object that Spring manages for you. It’s created, set up, and destroyed by the Spring container.

**How to Define**:
- **XML**: You can define beans in a configuration file.
- **Java Annotations**: You can use annotations directly in your classes.

---

## Bean Scopes
Bean scopes determine how long a bean lives and how many instances exist. The main types are:

1. **Singleton**: Only one instance for the whole application.
2. **Prototype**: A new instance is created each time it’s requested.
3. **Request**: A new instance for each HTTP request (web apps).
4. **Session**: One instance for each user session in a web app.

---

## ApplicationContext
**What It Is**: `ApplicationContext` is an interface in Spring that helps with configuring and managing beans. It provides more features than a basic container.

**Main Features**:
- Handles events.
- Supports internationalization (translations).
- Allows you to manage beans in a more advanced way.

---

## Component Scanning and Stereotype Annotations
**What It Is**: Component scanning allows Spring to automatically find and register your beans.

**Key Annotations**:
- **@Component**: A general component.
- **@Service**: Used for service classes.
- **@Repository**: Used for data access classes.
- **@Controller**: Used for web controllers.

---

## Spring Data JPA
**What It Is**: Spring Data JPA makes it easier to work with databases by providing ready-to-use methods for common tasks.

**Benefits**:
- You can create data access classes without writing much code.
- Supports complex queries with simple method names.

---

## Spring MVC
**What It Is**: Spring MVC is a framework for building web applications using the Model-View-Controller pattern.

**Main Parts**:
- **Controller**: Handles user requests.
- **Model**: Represents data.
- **View**: Displays the data to the user.

**Key Annotations**:
- **@Controller**: Marks a class as a controller.
- **@RequestMapping**: Links web requests to methods.

---

## Installation and Setup
To set up a Spring project:

1. **Choose a Tool**: Use Maven or Gradle to manage libraries.
2. **Add Spring Libraries**: Include Spring in your project file (like `pom.xml` for Maven).
3. **Configure Your Application**: Use XML or Java classes to define beans.
4. **Write Your Code**: Create your classes for business logic and data access.
5. **Run Your Application**: Start the application using a main method or a server.
