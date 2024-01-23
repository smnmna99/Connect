# Use the official maven/Java 8 image to create a build artifact.
# This is based on Debian and sets the MAVEN_HOME environment variable to /usr/share/maven
FROM maven:3.9.6-amazoncorretto-17-debian as builder

# Copy local code to the container image.
WORKDIR /app
COPY . .

# Build a release artifact.
RUN mvn package -DskipTests

# Use AdoptOpenJDK for base image.
FROM openjdk:17-jdk

# Copy the jar to the production image from the builder stage.
COPY --from=builder /app/target/*.jar /app.jar

# Run the web service on container startup.
CMD ["java", "-jar", "/app.jar"]