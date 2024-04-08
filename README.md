# Kotlin Spring Boot Demo

This is a simple Spring Boot application written in Kotlin.

## Getting Started

### Prerequisites
- Java JDK 8 or higher
- Maven

### Installation
1. Clone the repository:
```bash
  git clone https://github.com/abhishekshah2905/spring-kotlin-demo.git
```
2. Navigate to the project directory:
```bash
  cd spring-kotlin-demo
```
3. Build the project:
```bash
  mvn clean install
```
4. Run the application:
```bash
  mvn spring-boot:run
```
5. Access the application at http://localhost:8081

### Usage
- Upon running the application, sample data is initialized in the database.
- Use Swagger UI to view and test the REST endpoints. Open http://localhost:8081/swagger-ui.html in your browser.

### Configuration
- The SwaggerConfig class configures Swagger UI for API documentation. It specifies the base package for scanning controllers and paths for documentation.