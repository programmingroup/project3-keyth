
FROM eclipse-temurin:21-jdk-alpine

WORKDIR /project3-keyth

COPY . ./

RUN ./mvnw -DoutputFile=target/mvn-dependency-list.log -B -DskipTests clean dependency:list install

CMD ["sh", "-c", "java -jar target/*.jar"]