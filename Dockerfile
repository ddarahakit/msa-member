FROM openjdk:11
VOLUME /tmp
ADD ./build/libs/msa-member-0.0.1-SNAPSHOT.jar app.jar
ENV JAVA_OPTS=""
ENTRYPOINT ["java","-jar","/app.jar"]