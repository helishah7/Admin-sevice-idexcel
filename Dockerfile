FROM openjdk:8-jdk-alpine

MAINTAINER "heli.shah@idexcel.net"

EXPOSE 8080

WORKDIR /usr/local/bin

COPY ./target/admin-service-0.0.1-SNAPSHOT.jar webapp.jar

ENTRYPOINT ["java","-jar","admin-service-0.0.1-SNAPSHOT.jar"]

