FROM openjdk:11
COPY ./target/calculatorDevOps-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "calculator_devops-1.0-SNAPSHOT-jar-with-dependencies.jar"]