FROM java:1.8.0_333

EXPOSE 8080

ADD target/Docker.war Docker.war

ENTRYPOINT ["java","-war","Docker.war"]