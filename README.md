## Device-Classification
The Devices Price Classification System is designed to predict the price range of mobile devices based on their specifications


The system includes two main components:

Python Project: Predicts the price range using a machine learning model.
Spring Boot Project: Provides a RESTful API to manage devices and communicate with the Python service for price prediction.
Project Structure
# Python Project:
Contains the machine learning model and necessary scripts for training and prediction.
# Spring Boot Project:
Manages the device entities and exposes RESTful endpoints for CRUD operations and price predictions.

#Requirements
* Python:

1) Python 3.7+
2) Required libraries: pandas, numpy,matplotlib, scikit-learn,import joblib
, fastapi,pyngrok, Flask,, ydata-profiling,pydantic-settings.

* SpringBoot:
  We need here JDK 17+ with  Maven 3.6 or higher, and here is dpendencies used in springboot:
  *Dependencies Used in SpringBoot Project
    -Spring Boot Version: 2.7.0
    
    -Spring Boot Starters:
    
      spring-boot-starter-data-jpa
      spring-boot-starter-web
      spring-boot-devtools
      spring-boot-starter-test
    -Database Connectivity:
    
      mysql-connector-java:8.0.33
      com.h2database
      (runtime scope)
   -Other Libraries:
    
      org.projectlombok
      (optional)
      org.json:json:20090211
      javax.persistence
      .persistence-api:2.2
  
#How to run the project:
  *In python section:
  You should get your ngroj authentication key and put them in the part here:
      '''python
        ngrok.set_auth_token("Your Authentication key"). '''
  After run you have to copy the url for NgrokTunnel and past it in file appication.properaties in SPRINGBOOT section like here:
    '''java
        python.service.url=https://NgrokTunnel URL
    '''

*In sprinboot section:
    After put python.service.url you can run the appication as a java application


#Testing A
#Note:
  You have to put your database information in file applicatoin.properaties in section boot section
  
