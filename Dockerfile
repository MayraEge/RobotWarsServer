FROM amazoncorretto:17
ARG JAR_FILE=target/RobotWarsServer-1.0-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app.jar"]