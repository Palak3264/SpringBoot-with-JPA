---
tags: [CustomerAPI]
---

# Customer-API-Execution

This is a sample API created using Spring Boot and Spring Data JPA to demonstrate REST API access using entity framework provided by Spring JPA.

Checkout the code in to your local environment to test out the features

## Ways to run this application

#### 1. Using Maven
Assuming maven is pre installed and JAVA_HOME is set up already, run the command below by navigating to project home directory

**mvn spring-boot:run**

#### 2. Using Spring Tool Suite

Assuming you already have a java project editor such as Spring Tool Suite already available

1. Open your STS setup
2. If already cloned code in local repo using Git checkout, import this as existing project
3. Run it as a Spring boot Application

#### 3. As a Maven Project

Assuming you already have a java project editor such as Spring Tool Suite already available

1. Open your STS setup
2. If downloaded as a Zip file, extract the zip file
3. Import project as existing maven project using Project import wizard
4. Run the project with below option

    **mvn spring-boot:run**

#### 4. Run as a Docker image

Assuming you already have 

1. JDK installed and JAVA_HOME set
2. Docker installed
3. Docker up and runing with docker deamon running with linux kernel

Follow the steps as below

1. Navigate to downloaded code repo
2. Navigate to folder containing Dockerfile
3. Execute command below to create a docker image

    **docker build -f Dockerfile -t "palak/palak"**
    
    This step should generate a Docker image, verify the same using command below

    **docker images**

4. Run docker container using command below

    **docker run -p 9000:9000 palak/palak**
    or 
    **docker run -p 9000:9000 image-id**

## Ways to access application

Once application launched using one of the options above Open Browser and navigate to URI below
http://localhost:9000/swagger-ui.html

