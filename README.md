# CRUD Operations 

## Introduction
- The CRUD Operations Application is a Spring Boot-based service that facilitates fundamental CRUD `(Create, Read, Update, Delete)` operations on student records. This application offers a set of RESTful APIs for managing student data efficiently.

## Features

- `Create:` Add new student records to the database.
- `Read:` Retrieve all student records or fetch a specific record by ID.
- `Update:` Modify existing student records based on their ID.
- `Delete:` Remove student records from the database by ID.

## Technologies

- Java
- Spring Boot
- Spring Data JPA
- Maven
- H2 Database (for development)
- MySQL (for production)

## Prerequisites

- Java 11 or higher
- Maven 3.6.5 or higher
- MySQL database (for production)

## Setup

1. **Clone the repository:**

   ```bash
   git clone https://github.com/Anusree-Ravindran5/CRUD-Operation.git
   cd CRUD-Operation
##### Build the project:

* __`mvn clean install`__
##### Run the application:

* __`mvn spring-boot:run`__
## Configuration
##### Application Properties
Configure your email and database settings in `src/main/resources/application.properties`.

### properties
```java
# Database configuration (H2 for development)
spring.datasource.url=jdbc:h2:mem:Your DB
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
```
# MySQL Configuration
#### For production, configure MySQL settings:

#### properties

```java
spring.datasource.url=jdbc:mysql://localhost:3306/YourDB
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect
```
## Endpoints
##### CRUD Operations

##### 1.Get All Records
* **URL:**`/Studentlist`
* **Method:**` GET`
* **Description:** Retrieves a list of all student records.

****Response:****
* **Status Code:**` 200 OK`
* **Body:** A list of Student_list objects

****Response Body:****
~~~json
[
  {
    "id": 1,
    "name": "Anu",
    "classd": "10",
    "email": "test@example.com",
    "SGroups": "Group A"
  },
  ...
]
~~~
##### 2.Get Record by ID
* **URL:**`/Studentlist/{id}`
* **Method:**` GET`
* **Description:** Retrieves a specific student record by its ID.
* **Path Parameter:** id (Long): The ID of the student record to retrieve.

****Response:****
* **Status Code:**` 200 OK`
* **Body:** The `Student_list` object with the specified ID.

****Response Body:****
~~~json
{
  "id": 2,
  "name": "Anuu",
  "classd": "10",
  "email": "test@example.com",
  "SGroups": "Group A"
}
~~~
##### 3.Create Record
* **URL:**`/Studentlist`
* **Method:**` POST`
* **Description:** Creates a new student record..

****Request Body:****
* **Content-Type:**` application/json`

~~~json
{
  "name": "test",
  "classd": "10",
  "email": "test@example.com",
  "SGroups": "Group A"
}
~~~
****Response****
* **Status Code:**`201 Created`
* **Body:** The created Student_list object.
****Response Body:****
~~~json
{
  "id": 1,
  "name": "test",
  "classd": "10",
  "email": "test@example.com",
  "SGroups": "Group A"
}
~~~
##### 4.Update Record
* **URL:**`/Studentlist/{id}`
* **Method:**` PUT`
* **Description:**  Updates an existing student record..
* **Path Parameter:** id (Long): The ID of the student record to update.

****Request Body:****
* **Content-Type:**` application/json`

~~~json
{
  "name": "Test Updated",
  "classd": "11",
  "email": "updated@example.com",
  "SGroups": "Group B"
}

~~~
****Response****
* **Status Code:**`200 OK`
* **Body:** The Updated Student_list object.
****Response Body:****
~~~json
{
  "id": 1,
  "name": "Test Updated",
  "classd": "11",
  "email": "updated@example.com",
  "SGroups": "Group B"
}
~~~
##### 5.Delete Record
* **URL:**`/Studentlist/{id}`
* **Method:**` DELETE`
* **Description:** Deletes a student record by its ID.
* **Path Parameter:** id (Long):  The ID of the student record to delete.

****Response:****
* **Status Code:**` 204 No Content`
* **Body:** No content

## Usage
- Use the provided endpoints to perform CRUD operations on student records. Access `/Studentlist` with a GET request to retrieve all student records, or specify an ID with /Studentlist/{id} to get a specific student record. To add a new student record, send a POST request to /Studentlist with the required details in the request body. For updating an existing record, use a PUT request to /Studentlist/{id} with the updated information. Finally, to delete a record, issue a DELETE request to   `/Studentlist/{id}`.

## Contributing:
- Fork the repository.
- **Create a feature branch:** `git checkout -b` feature-name
- **Commit your changes:** `git commit -m` 'Add feature'
- **Push to the branch:** `git push origin` feature-name
- Open a pull request.

### Notes:
- Replace `your-username` and `your-repo-name` with your actual GitHub username and repository name.
- Ensure all configurations, such as the `application.properties`, match your actual setup.
- Update the sections to better reflect any additional features or specific instructions for your project.
