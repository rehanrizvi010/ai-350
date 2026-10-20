# hello-service

Spring Boot Hello World microservice.

## Requirements
- Java 17+
- Maven 3.6+

## Run
    mvn spring-boot:run

Then in another terminal:

    curl http://localhost:8080/hello
    # Hello, World!

## Test
    mvn test

## Build a jar
    mvn clean package
    java -jar target/hello-service-0.0.1-SNAPSHOT.jar
