FROM maven as maven
RUN mkdir /usr/src/nokia-meal-app
WORKDIR /usr/src/nokia-meal-app
COPY . .
RUN mvn install -DskipTests

FROM adoptopenjdk/openjdk11:alpine-jre
COPY --from=maven /usr/src/nokia-meal-app/target/nokia-meal-app-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

