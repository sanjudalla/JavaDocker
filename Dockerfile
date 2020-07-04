FROM java:8
COPY ./src/number.java /usr/src/
RUN ls
WORKDIR /usr/src/
RUN ls
RUN javac number.java
RUN java number
