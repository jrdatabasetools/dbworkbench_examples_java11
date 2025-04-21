FROM openjdk:11
WORKDIR /app
COPY target/rmi_factoryapi_server_java11-jar-with-dependencies.jar /app/rmi_factoryapi_server_java11-jar-with-dependencies.jar
EXPOSE 1098 1099
CMD ["java", "-Djava.rmi.server.hostname=0.0.0.0", "-jar", "rmi_factoryapi_server_java11-jar-with-dependencies.jar"]
