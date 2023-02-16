FROM registry.access.redhat.com/ubi8/openjdk-17:latest
USER root
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} /app/app.jar
USER 1001
ENTRYPOINT ["java","-jar","/app/app.jar"]