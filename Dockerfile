FROM java:8
COPY . /usr/src/javaapp
WORKDIR /usr/src/javaapp/src/programs
RUN ls
RUN javac number.java
WORKDIR /usr/src/javaapp/bin
RUN java programs.number
