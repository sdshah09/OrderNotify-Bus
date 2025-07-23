# Use a lightweight OpenJDK 21 image
FROM eclipse-temurin:21-jre-alpine

WORKDIR /app

# Copy the built jar file
COPY target/discovery-service-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8761

ENTRYPOINT ["java", "-jar", "app.jar"] 