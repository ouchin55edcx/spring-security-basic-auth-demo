![image.svg](image.svg)
# 🔐 Basic Authentication with Spring Boot

A simple authentication system that provides user registration and login functionality using Spring Boot and Spring Security.

## 📝 Description

This project implements basic authentication features including:
- 👤 User registration
- 🔑 User login
- 🛡️ Secure password handling
- 🔒 Basic API security

## 🏗️ Project Structure

The project follows a standard Spring Boot architecture:
```
📂 src/main/java
 ┣ 📂 config          // Security configuration
 ┣ 📂 controller      // REST endpoints
 ┣ 📂 entity         // Data models
 ┣ 📂 repository     // Database access
 ┣ 📂 service        // Business logic
 ┗ 📂 request/response // DTOs
```

## 🛠️ Technologies Used

- 🍃 Spring Boot
- 🛡️ Spring Security
- 💾 Spring Data JPA
- 🗄️ PostgreSQL
- 🔧 Maven

## ⚡ Quick Start

1. 📥 Clone the project
2. ⚙️ Configure database in `application.properties`
3. 🚀 Run `mvn spring-boot:run`
4. 🌐 Access API at `http://localhost:8080`

## 🔌 API Endpoints

- 📮 POST `/v1/api/auth/register` - Register new user
- 🔓 POST `/v1/api/auth/login` - Login user

## 📦 Dependencies
```xml
<dependencies>
    🍃 spring-boot-starter-web
    🛡️ spring-boot-starter-security
    💾 spring-boot-starter-data-jpa
</dependencies>
```

That's it! Your authentication system is ready to secure! 🚀✨