FROM gradle:4.2.1-jdk8-alpine

ENV GRADLE_HOME /opt/gradle
ENV GRADLE_VERSION 4.2.1

COPY / /app
USER root
RUN chown -R gradle /app
USER gradle

VOLUME "/home/gradle/.gradle"
WORKDIR /home/gradle

CMD cd /app && gradle build --stacktrace


