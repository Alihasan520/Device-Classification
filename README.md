### Device-Classification
The Devices Price Classification System is designed to predict the price range of mobile devices based on their specifications

##Project Structure
  The system includes two main components:
  
 - Python Project: Contains the machine learning model and necessary scripts for training and prediction..
 - Spring Boot Project: Manages device entities and exposes RESTful endpoints for CRUD operations and price predictions.
 
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
      1) Obtain your Ngrok authentication key and set it in your Python script:
      '''python
        ngrok.set_auth_token("Your Authentication key"). '''
     2) After running Ngrok, copy the generated tunnel URL.
     
#Spring Boot Section:
    1) Paste the Ngrok tunnel URL into the application.properties file under the Spring Boot section:
        '''java
            python.service.url=https://NgrokTunnel URL
        '''
    2) Ensure you have configured your database information in the application.properties file under the Spring Boot section.
    3) Run the Spring Boot application as a Java application.

##Note:
    Ensure all dependencies are installed and configurations are correctly set before running both Python and Spring Boot components.
    Adjust database configurations and Ngrok settings as per your environment setup.
    
##Testing
  API Testing: Use tools like Postman or curl to send requests to the RESTful endpoints provided by the Spring Boot application for     
  device management and price prediction.

#Testing APIs
    The Spring Boot application exposes four main APIs for managing device data and predicting device prices:
    
    Retrieve All Devices
    
    Method: GET
    Endpoint: /api/devices
    Description: Retrieves a list of all devices stored in the database.
    Usage: Send a GET request to the endpoint to fetch all devices.
    Retrieve Device by ID
    
    Method: GET
    Endpoint: /api/devices/{id}
    Description: Retrieves a specific device by its ID from the database.
    Usage: Replace {id} in the endpoint with the ID of the device you want to retrieve.
    Create New Device
    
    Method: POST
    Endpoint: /api/devices
    Description: Creates a new device entry in the database.
    Payload: Send a JSON object representing the device details in the request body.
    Usage: Send a POST request to the endpoint with JSON data containing device details.
    Predict Device Price
    
    Method: POST
    Endpoint: /api/devices/predict/{deviceId}
    Description: Predicts the price range of a device using the Python machine learning service.
    Usage: Replace {deviceId} in the endpoint with the ID of the device for which you want to predict the price.
    Response: Returns the updated device object with the predicted price range.

##Example Usage
  1)Retrieve All Devices:
        '''curl -X  GET http://localhost:8080/api/devices'''
  2)Retrieve Device by ID:
        '''curl -X GET http://localhost:8080/api/devices/1'''
  3)Create New Device:
        '''curl -X POST \
        http://localhost:8080/api/devices \
        -H 'Content-Type: application/json' \
        -d '{
          "batteryPower": 3000,
          "blue": true,
          "clockSpeed": 2.3,
          "dualSim": false,
          "fc": 12,
          "fourG": true,
          "intMemory": 64,
          "mDep": 0.4,
          "mobileWt": 150,
          "nCores": 8,
          "pc": 16,
          "pxHeight": 1920,
          "pxWidth": 1080,
          "ram": 4,
          "scH": 5,
          "scW": 3,
          "talkTime": 20,
          "threeG": true,
          "touchScreen": true,
          "wifi": true,
          "priceRange": null
        }'
      '''

  4)Predict Device Price:
      '''curl -X POST http://localhost:8080/api/devices/predict/1'''
              



    
