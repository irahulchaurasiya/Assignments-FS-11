# Welcome to Restaurant Management System README File :wave:


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
> The client, such as a web browser or a mobile app, sends HTTP requests to the server for Restaturant Management operations, including browsing foodItem, adding foodItems, placing orders, etc. (CRUD operations).

## Controller Layer
___
> In the Spring Boot application, the incoming HTTP requests are handled by the Controller layer. The Controller receives the requests and delegates them to the appropriate methods in the service layer.

## Service Layer
___
> The Service layer contains the business logic of the application and handles Restaturant Management operations. When a request is received from the Controller, the Service layer performs the necessary actions. For example, when creating a new foodItem , User , Admin etc. The Service layer validates the input data, generates a unique identifier, and interacts with the data access layer.

## Data Access Layer
___
> The Data Access layer is responsible for interacting with the MySQL database to perform CRUD operations on the data. It uses SQL to map Java objects to database tables and execute SQL queries.

## Database
___
> The MySQL database stores Restaturant Management data, including foodItem information, user details, orders, etc.

## Response
___
> After the data operation is completed, the response flows back through the layers in the reverse ordersEntity. The Service layer receives the response from the Data Access layer, performs any necessary post-processing or formatting, and sends it back to the Controller.

## Controller Response
___
> The Controller layer receives the response from the Service layer and returns an appropriate HTTP response to the client, indicating the success or failure of the requested operation.




# Data Structure

## FoodItem Model
> The Product model represents the data structure for storing product information. It typically includes attributes such as ID, name, description, price, etc.

## Order Model
> The Order model represents the data structure for storing ordersEntity information. It typically includes attributes such as ID, Order Quantity etc.

## Admin Model
> The Admin model represents the data structure for storing admin information. It typically includes attributes such as ID, name, email, password.

## User Model
> The User model represents the data structure for storing user information. It typically includes attributes such as ID, name, email, address, etc.


## Summary
___
This is a README file for explain the details about the project. This is a Restaurant Management project which is used to manage Address , User , Product etc. In this project we can perform the following functions given below :-
>User Functions :-
* SignUp user.
* SignIn user.
* SignOut user.
* Place Order.
* Cancel Order.

>Admin Functions
* Create foodItems
* SignUp admin.
* SignIn admin.
* SignOut admin.
* Get all user Details.
* Delete foodItems.
* Get all order details.

>Visitor Functions
* See all food items.

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