FROM eclipse-temurin:17-jre-alpine as build
MAINTAINER Pavel Kazhukov <sanpavkaz@gmail.com>

FROM build
EXPOSE 8075
COPY target/identity-provider-0.0.1-SNAPSHOT.jar /identity-provider-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-Xmn30m", "-Xms60m", "-Xmx64m", "-Xss256k", "-jar", "identity-provider-0.0.1-SNAPSHOT.jar"]