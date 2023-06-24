FROM openjdk:17-alpine
EXPOSE 8081

COPY target/service-green.jar .

CMD ["java", "-jar", "service-green.jar"]

