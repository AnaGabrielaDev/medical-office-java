FROM ubuntu:latest AS build

RUN apt-get update
RUN apt-get install openjdk-17-jdk -y

COPY . .

RUN apt-get install maven -y

RUN mvn dependency:go-offline
RUN mvn clean install

FROM mysql
FROM openjdk:17-jdk-slim

EXPOSE 8080

COPY --from=build target/api-med-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT [ "java", "-jar", "app.jar" ]
