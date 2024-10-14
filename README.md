# RESTful Web Service

## Overview

This is a RESTful web service developed using Java and Spring Boot. The service provides a robust API for interacting with your application, allowing for seamless data exchange and management.
##### This repository contains a robust and scalable RESTful Web Service built using Spring Boot. It showcases the implementation of key features and best practices that are essential for building modern microservices. With support for validation, versioning, filtering, Spring Security, HAL (Hypertext Application Language), Swagger API documentation, and many more features, this project provides a solid foundation for developing production-ready microservices.

## Features

- **Find All Users**: Retrieve a list of all users in the system.
- **Find User by ID**: Get detailed information for a specific user using their unique identifier.
- **Add Post**: Users can create and add new posts to the service.
- **Delete Post**: Users can delete their posts.
- **Versioning**: The API supports versioning to ensure backward compatibility.
- **Spring Security**: Integrated security features to protect endpoints and manage authentication.
- **CSRF Protection Disabled**: CSRF protection is disabled for easier testing and development (consider enabling it in production).

## Prerequisites

- Java 11 or higher
- Maven
- An IDE (e.g., IntelliJ IDEA, Eclipse)
- Git

## Cloning the Repository

To get started, clone the repository using the following command:

```bash
git clone <repository-url>
```

Replace `[<repository-url>`](https://github.com/SinghTanmay024/restful-web-service.git) with the actual URL of the repository.

## Setting Up the Project

1. **Navigate to the Project Directory**:

   ```bash
   cd <project-directory>
   ```

2. **Install Dependencies**:

   Make sure you have Maven installed. Run the following command to install the necessary dependencies:

   ```bash
   mvn install
   ```

3. **Refresh `pom.xml`**:

   If you're using an IDE, refresh the `pom.xml` file to ensure all dependencies are properly configured. This can usually be done by right-clicking on the `pom.xml` file and selecting "Maven" > "Reload Project".

4. **Configure `android.properties`**:

   Locate the `android.properties` file in the project. Update the following properties with your username and password:

   ```properties
   user.name=your_username
   user.password=your_password
   ```

5. **Run the Application**:

   You can run the application as a Spring Boot application by executing:

   ```bash
   mvn spring-boot:run
   ```

   Alternatively, you can run the application from your IDE.

## Accessing the API

Once the application is running, you can access the API endpoints at:

```
http://localhost:8080/api
```

(Adjust the base URL and port if you have configured them differently.)

## Testing the API

You can test the API using tools like Postman or Curl. Refer to the API documentation for the available endpoints and their usage.

## Contributing

If you would like to contribute to this project, please fork the repository and submit a pull request with your changes.

## License

This project is licensed under the MIT License. See the LICENSE file for more details.

## Contact

For any questions or issues, please contact [Your Name](mailto:sttanmay17@gmail.com).
