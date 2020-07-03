FROM java:8
COPY . /usr/src/number.java
RUN ls
WORKDIR /usr/src/src
RUN ls
RUN javac number.java
RUN java number
