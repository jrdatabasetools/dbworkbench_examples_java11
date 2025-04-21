FROM openjdk:11
WORKDIR /app
COPY target/rmi_springapi_server_java11-jar-with-dependencies.jar /app
EXPOSE 1098 1099
CMD ["java", "-Djava.rmi.server.hostname=0.0.0.0", "-jar", "rmi_springapi_server_java11-jar-with-dependencies.jar"]
