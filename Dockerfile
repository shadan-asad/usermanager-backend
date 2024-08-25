# Use OpenJDK 11 as the base image
FROM openjdk:11-jre-slim

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file from the target directory to the container
COPY target/*.jar app.jar

# Command to run the application
ENTRYPOINT ["java", "-jar", "/app/app.jar"]