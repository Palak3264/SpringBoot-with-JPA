FROM openjdk:8-jdk-alpine
LABEL "com.interview"="Interview Demo Code Snippet"
LABEL version="1.0"
LABEL maintainer="Palak Arora"
EXPOSE 9000
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} PalakEntityExample-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/PalakEntityExample-0.0.1-SNAPSHOT.jar"]