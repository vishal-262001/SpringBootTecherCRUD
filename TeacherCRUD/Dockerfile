FROM openjdk:17-jdk

COPY target/TeacherCRUD-0.0.1-SNAPSHOT.jar /app/TeacherCRUD.jar

WORKDIR /app

EXPOSE 8080

CMD ["java", "-jar", "TeacherCRUD.jar"]