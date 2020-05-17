# Run SpringBoot Docker image

step 1 - Create simple SpringBoot project.

step 2 - Create Dockerfile in project path.

step 3 - Build Project using "gradle clean build"

step 4 - Then build docker file using "docker build -t --name ."

step 5 - show docker images "docker images".

step 6 - Run Docker images "docker run -p 8080:8080 --name"
