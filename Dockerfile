FROM openjdk:8-jre-alpine

COPY libs/weather*.jar app.jar

CMD java -jar app.jar
