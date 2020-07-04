# JavaDocker
Practice docker use for testing
FROM java:8
with this line we tell Docker that our image will be based on another image that is available on public repository (Docker Hub). This image was prepared by someone else and contains all necessary dependencies that we would need to run any Java application.
COPY ./src/number.java /usr/src/  
First argument after COPY is a path of an application that we want to put into container. I have created one simple program number.java in src package. The second parameter, /usr/src/ , is a directory in a container where we put the app. (usr is one location in container - can be checked with Run ls command, so we are placing number.java in usr/src)
RUN ls
WORKDIR /usr/src/
here we instruct Docker to use /usr/app folder as a root, otherwise in each following command we would need to provide the full path to the resource.
RUN javac number.java
RUN java number
