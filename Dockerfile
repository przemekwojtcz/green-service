FROM openjdk:17-alpine
EXPOSE 8080

COPY target/service-green.jar .

CMD ["java", "-jar", "service-green.jar"]

