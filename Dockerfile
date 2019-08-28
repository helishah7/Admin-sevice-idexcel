FROM openjdk:8-jdk-alpine

MAINTAINER "heli.shah@idexcel.net"

EXPOSE 8080

WORKDIR /usr/local/bin

COPY ./target/admin-service-0.0.1-SNAPSHOT.jar webapp.jar

CMD ["JAVA", "-Dspring.profiles.active=docker-demo", "-war", "webapp.jar"]