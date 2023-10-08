# Welcome to Mapping System README File :wave:


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
 MySQL
```

# :office: DataFlow of the program 
<br>

## Client Interaction
___
> The client, such as a web browser or a mobile app, sends HTTP requests to the server for Mapping operations, including browsing student , course , book etc. (CRUD operations).

## Controller Layer
___
> In the Spring Boot application, the incoming HTTP requests are handled by the Controller layer. The Controller receives the requests and delegates them to the appropriate methods in the service layer.

## Service Layer
___
> The Service layer contains the business logic of the application and handles Mapping operations. When a request is received from the Controller, the Service layer performs the necessary actions. For example, when creating a new student , course , book etc. The Service layer validates the input data, generates a unique identifier, and interacts with the data access layer.

## Data Access Layer
___
> The Data Access layer is responsible for interacting with the MySQL database to perform CRUD operations on the data. It uses SQL to map Java objects to database tables and execute SQL queries.

## Database
___
> The MySQL database stores Restaturant Management data, including student , course , book etc.

## Response
___
> After the data operation is completed, the response flows back through the layers in the reverse ordersEntity. The Service layer receives the response from the Data Access layer, performs any necessary post-processing or formatting, and sends it back to the Controller.

## Controller Response
___
> The Controller layer receives the response from the Service layer and returns an appropriate HTTP response to the client, indicating the success or failure of the requested operation.



## Summary
___
This is a sample Spring Boot application that demonstrates the usage of Lombok, and MySQL in a Spring Boot project. The application showcases the relationships between various entities, such as Student, Laptop, Course, Book, and Address, and how they can be managed using Spring Boot and MySQL. In this project we can perform the following functions given below :-

> Student
* Retrieves a list of all students.
* Retrieves a student by ID.
* Creates a new student.
* Updates an existing student.
* Deletes a student by ID.

> Laptop
* Retrieves a list of all laptops.
* Retrieves a laptop by ID.
* Creates a new laptop.
* Updates an existing laptop.
* Deletes a laptop by ID.

> Course
* Retrieves a list of all courses.
* Retrieves a course by ID.
* Creates a new course.
* Updates an existing course.
* Deletes a course by ID.

> Book
* Retrieves a list of all books.
* Retrieves a book by ID.
* Creates a new book.
* Updates an existing book.
* Deletes a book by ID.

## Installation and Usage
___
* Clone the repository to your local machine.
* Make sure you have Java and Maven installed.
* Make sure you have MySQL workbench installed.
* Set up the database according to the configuration in the application properties file.
* Run the application using your preferred IDE.
* Access the API endpoints using tools like Postman , Swagger or your web browser.

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