# Todo App

A REST API using Spring Boot for handling categories and items. This application is built using the following software: PostgreSQL for data storage and Spring Security with JWT authentication for API security.

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Spring Security
- JWT
- Postman
- GitHub

## GitHub Repository

https://github.com/thajbakmohamed-ctrl/todoApp.git

## Design Decisions

There is a three-tier application design which splits the project into three layers: Controller, Service, and Repository. This will help in keeping the code organized and make the responsibilities of each layer clear.

- PostgreSQL was used to store the application data.
- It was made easier to work with the database using Spring Data JPA.
- Spring Security with JWT authentication was used to secure the API endpoints.
- JWT was chosen because it can be used to authenticate each request in a stateless way.

## What Went Right

- CRUD operations for Category and Item have been successfully implemented.
- Successfully connected to the PostgreSQL database.
- User registration and login were successful.
- Passwords were hashed with BCrypt.
- JWT authentication was implemented successfully.
- Protected endpoints return an error if no token is provided, and work correctly when a valid Bearer Token is provided.
- Tests were conducted on the API endpoints using Postman.

## Challenges

- Properly setting up the PostgreSQL database connection.
- Solving issues related to dependency injection in the Spring Boot application.
- Changing the security configuration to suit the newer release of Spring Boot.
- Implementing JWT authentication and testing protected endpoints.

## Favorite Part

The most enjoyable aspect of this project was integrating JWT authentication, which provided me with insights into the interaction between login, tokens, and secured API endpoints in Spring Boot.
