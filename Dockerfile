#LABEL authors="mr1n8l"
# Use a base image with OpenJDK 21
FROM openjdk:21-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the build output JAR file to the container
COPY build/libs/*.jar app.jar

# Expose the port on which your Spring Boot application runs
EXPOSE 8080

# Run the Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]
