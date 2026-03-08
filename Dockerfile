# Stage 1: Build the application
# Maven 3.9.6 aur Java 21 ka use karke .jar file build karenge
FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /app

# Sabse pehle pom.xml copy karke dependencies download karte hain (Caching ke liye)
COPY pom.xml .
RUN mvn dependency:go-offline

# Baaki saara source code copy karke build run karte hain
COPY src ./src
RUN mvn clean package -DskipTests

# Stage 2: Run the application
# Sirf JRE (Java Runtime) use karenge taaki image size chhota rahe
FROM eclipse-temurin:21-jre-alpine
WORKDIR /app

# Build stage se .jar file ko copy karna
COPY --from=build /app/target/*.jar app.jar

# Render default mein 8080 port use karta hai
EXPOSE 8080

# Application start karne ki command
ENTRYPOINT ["java", "-jar", "app.jar"]