
#
# Package stage
#
FROM openjdk:11-jre-slim
COPY app/target/Spring-Cloud-Config-Server-0.0.1-SNAPSHOT.jar /usr/local/lib/Spring-Cloud-Config-Server-0.0.1-SNAPSHOT.jar
#EXPOSE 8080
ENTRYPOINT ["java","-jar","/usr/local/lib/Spring-Cloud-Config-Server-0.0.1-SNAPSHOT.jar"]
