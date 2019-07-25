#FROM maven:3.5-jdk-8
#ADD target/cgps-reservation-0.0.1-SNAPSHOT.jar cgps-reservation-0.0.1-SNAPSHOT.jar
#ENTRYPOINT [""java"", ""-jar"", ""cgps-reservation-0.0.1-SNAPSHOT.jar""]

# select image
FROM maven:3.5-jdk-8

# copy the project files
COPY ./pom.xml ./pom.xml

# build all dependencies for offline use
RUN mvn dependency:go-offline -B

# copy your other files
COPY ./src ./src

# build for release
RUN mvn package

# set the startup command to run your binary
EXPOSE 8090
CMD ["java", "-jar", "./target/cgps-menu-0.0.1-SNAPSHOT.jar"]