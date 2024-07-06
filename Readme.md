# KeyIn Server

## Description

The KeyIn Server is a Java-based application designed to manage aircraft, airports, cities, and passengers. It utilizes Spring Boot for its framework, making it robust for enterprise-level applications. This server allows for the addition, retrieval, and management of aircraft and their associated entities such as passengers and airports.

## Installation

To run this project, you will need Java and Maven installed on your system.

1. Clone the repository to your local machine.
2. Navigate to the project directory.
3. Run `mvn spring-boot:run` to start the server.

## Usage
### Adding an Aircraft

4. **Adding an Aircraft**

    - Method: `POST`
    - URL: `{{baseUrl}}/aircrafts/add`
    - Body (raw, JSON):
        ```json
        {
          "id": 3,
          "type": "Boeing 777",
          "airlineName": "United Airlines",
          "numberOfPassengers": 300,
          "passengers": [],
          "airports": []
        }
        ```
    - Send the request and observe the response.

5. **Retrieving All Aircraft**

    - Method: `GET`
    - URL: `{{baseUrl}}/aircrafts/all`
    - Send the request to retrieve a list of all aircraft.

6. **Finding an Aircraft by ID**

    - Method: `GET`
    - URL: `{{baseUrl}}/aircrafts/{id}`
    - Replace `{id}` with the actual ID of the aircraft you wish to retrieve.
    - Send the request to get the details of the specified aircraft.

### Additional Endpoints
Repeat this to test the other endpoints for cities, passengers, and airports.
