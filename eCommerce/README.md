# Welcome to Ecommerce Api README File :wave:


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
> The client, such as a web browser or a mobile app, sends HTTP requests to the server for ecommerce operations, including browsing products, adding items to the cart, placing orders, etc. (CRUD operations).

## Controller Layer
___
> In the Spring Boot application, the incoming HTTP requests are handled by the Controller layer. The Controller receives the requests and delegates them to the appropriate methods in the service layer.

## Service Layer
___
> The Service layer contains the business logic of the application and handles eCommerce operations. When a request is received from the Controller, the Service layer performs the necessary actions. For example, when creating a new product or address etc. The Service layer validates the input data, generates a unique identifier, and interacts with the data access layer.

## Data Access Layer
___
> The Data Access layer is responsible for interacting with the MySQL database to perform CRUD operations on the data. It uses SQL to map Java objects to database tables and execute SQL queries.

## Database
___
> The MySQL database stores ecommerce data, including product information, user details, orders, etc.

## Response
___
> After the data operation is completed, the response flows back through the layers in the reverse ordersEntity. The Service layer receives the response from the Data Access layer, performs any necessary post-processing or formatting, and sends it back to the Controller.

## Controller Response
___
> The Controller layer receives the response from the Service layer and returns an appropriate HTTP response to the client, indicating the success or failure of the requested operation.




# Data Structure

## Product Model
> The Product model represents the data structure for storing product information. It typically includes attributes such as ID, name, description, price, etc.

## Order Model
> The Order model represents the data structure for storing ordersEntity information. It typically includes attributes such as ID, user details, product details, total amount, etc.

## User Model
> The User model represents the data structure for storing user information. It typically includes attributes such as ID, name, email, address, etc.

## Address Model
> The Address model represents the data structure for storing address information. It typically includes attributes such as ID, street, city, state, postal code, etc.


## Summary
___
This is a README file for explain the details about the project. This is a Ecommerce project which is used to manage Address , User , Product etc. In this project we can perform the following functions given below :-

* Create users.
* Create products.
* Create Address.
* Place an ordersEntity (Create Order) using userId, productId,addressId.
* Get ordersEntity by ordersEntity id.
* Get user by userid.
* Get all products.
* Get products based on category.
* Delete products based on product id.

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