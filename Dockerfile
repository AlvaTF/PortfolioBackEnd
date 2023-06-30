FROM amazoncorretto:17

MAINTAINER AlvaroToledo

COPY target/proyectofinal-0.0.1-SNAPSHOT.jar proyectofinal-0.0.1-SNAPSHOT

ENTRYPOINT ["java","-jar","/proyectofinal-0.0.1-SNAPSHOT.jar"]

