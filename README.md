# Kotlin-Spring-GrapqhQL Boilerplate

### About
Simple back end boiler plate for a Spring Boot/GraphQL Web server written in Kotlin.

### Todo:
* Add basic tests

### Setup
#### Environment Variables
* Create `application.yml` in the /src/resources dir with following:

#### GraphQL playground
* Interact with GraphQL queries and migrations from `http://localhost:8080/playground`

### DB Migrations
Migrations are handled by flyway.
Simply create a new file in `/resources/migration` like `V1__init.sql` and flyway will apply the migration on application boot.

```
graphql:
  packages:
    - "com.clynch.kotlingql"
spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/kotlingql
    username: <username>
    password: <password>
    driverClassName: "org.postgresql.Driver"
```

### Reference Documentation
* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.2.5.RELEASE/gradle-plugin/reference/html/)
* [GraphQL Kotlin - Expediagroup](https://expediagroup.github.io/graphql-kotlin/docs/getting-started.html)
* [Flyway](https://flywaydb.org)
