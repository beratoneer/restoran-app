FROM openjdk:17

WORKDIR /app

COPY ./src ./src

RUN javac -d out src/*.java

CMD ["java", "-cp", "out", "Main"]
