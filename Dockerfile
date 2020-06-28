FROM java:8
COPY /usr/src/number.java /
RUN ls
RUN javac number.java
RUN java number
