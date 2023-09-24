# Welcome to Job Search Portal System README File :wave:


## Framework Used
___
```bash
 Springboot
```

## Language Used
___
```bash
 Java
```

## Tools Used
___
```bash
 Intellij IDEA
 Maven
```
## Database Used
___
```bash
 Hibernate
```

# :office: DataFlow of the program 
<br>

## Client Interaction
___
> The client, such as a web browser or a mobile app, sends HTTP requests to the server for job search operations, including creating, reading, updating, and deleting students and events (CRUD operations).

## Controller Layer
___
> In the Spring Boot application, the incoming HTTP requests are handled by the Controller layer. The Controller receives the requests and delegates them to the appropriate methods in the service layer.

## Service Layer
___
> The Service layer contains the business logic of the application and handles job search operations. When a request is received from the Controller, the Service layer performs the necessary actions. For example, when creating a new job, the Service layer validates the input data, generates a unique identifier, and interacts with the data access layer.

## Data Access Layer
___
> The Data Access layer is responsible for interacting with the underlying database to perform CRUD operations on the data. It uses Hibernate to map Java objects to database tables and execute SQL queries.

## Database
___
> The database stores the job details data. It can be any relational database management system (RDBMS) such as MySQL, PostgreSQL, or H2.

## Response
___
> After the data operation is completed, the response flows back through the layers in the reverse order. The Service layer receives the response from the Data Access layer, performs any necessary post-processing or formatting, and sends it back to the Controller.

## Controller Response
___
> The Controller layer receives the response from the Service layer and returns an appropriate HTTP response to the client, indicating the success or failure of the requested operation.


## Summary
___
This is a README file for explain the details about the project. This is a Job Search Portal System project which is used to manage jobs on a portal. In this project we can perform the following functions given below :-

* Add multiple job.
* Fetch the details of all job.
* Fetch the details of a single job.
* Update the details of the job.
* Delete a job.
* Search job by title.
* Search job by description. 

## Installation and Usage
___
* Clone the repository to your local machine.
* Make sure you have Java and Maven installed.
* Set up the database according to the configuration in the application properties file.
* Run the application using your preferred IDE.
* Access the API endpoints using tools like Postman or your web browser.

## :frowning_man: Author
___
Rahul Chaurasiya
* Github : [@rahul79990](https://github.com/rahul79990/Assignments)


## :handshake: Contributing
___
Contributions, issues & feature requests are  welcome!

Feel free to contact me at the above github link.

## Show your Support
___
Give a :keycap_ten: if you liked this project.

## :memo: License
___
Copyright :copyright: Geekster FS 10 Batch.

This project is licensed for Geekster.

___
This README was generated with :heart: by Rahul Chaurasiya