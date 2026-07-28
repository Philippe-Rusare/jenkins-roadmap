FROM eclipse-temurin:21-jre

WORKDIR /app

COPY hello-jenkins-app/target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","app.jar"]