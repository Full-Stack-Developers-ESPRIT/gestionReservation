FROM openjdk:11
EXPOSE 8085
ADD target/ProjetOussema1-0.0.1-SNAPSHOT.jar ProjetOussema1.jar
ENTRYPOINT ["java", "-jar", "ProjetOussema1.jar"]