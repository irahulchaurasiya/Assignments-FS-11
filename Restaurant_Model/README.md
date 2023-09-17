# Welcome to Restaurant Model README File :wave:


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

# :office: DataFlow of the program 
<br>

## Model
___
> In the model Package we have given all the entities such as ( restaurantID ,restaurantName , restaurantAddress , restaurantPhoneNumber , restaurantSpeciality , totalStaff ,restaurantHasDeliveryService ,restaurantRating) of the restaurant in an restaurant class.


## Controller
___
> In the controller package we have created a class file RestaurantController to create apis of the functions we have to perform and also created the functions to perform the given tasks but controller takes help of the RestaurantService class to perform the tasks as it reduces high coupling in the code.

    
## Service
___
> In the service package we have created a class file RestaurantService to perform the given tasks and returning the output to controller. Service also takes help of RestaurantRepository class to perform the task and fetch the output from it and it makes it more less coupled.


## Repository
___
> In the repository package we have created a class file RestaurantRepository to perform the given tasks and returning the output to service. Repository have the Data List of Restaurants and its details and it perform all the task and give output to service class.

## Data Structure
___
> ArrayList : This is used for as a DataBase and stores the restaurant details.


## The Restaurant Model follows the following data flow:
___
Client Interaction: The client, such as Postman, sends requests to the Localhost server using url provider.

Model Layer: In the model Package we have given all the entities such as ( restaurantID ,restaurantName , restaurantAddress , restaurantPhoneNumber , restaurantSpeciality , totalStaff ,restaurantHasDeliveryService ,restaurantRating) of the restaurant in an restaurant class.

Controller Layer: In the Spring Boot application, the incoming requests are handled by the Controller layer. The Controller receives the requests and delegates them to the appropriate methods in the service layer.

Service Layer: When a request is received from the Controller, the Service layer call the Repository layer and returns it back to Controller layer.

Repository Layer : The Repository layer contains the business logic of the application and handles all the task which needed to perform. When a request is received from the Service, the Repository layer performs the necessary actions.

Response: After the data operation is completed, the response flows back through the layers in the reverse order. The Service layer receives the response from the Repository layer, performs any necessary post-processing or formatting, and sends it back to the Controller.


## Summary
___
This is a README file for explain the details about the project. This is a Restaurant Model project is used to store details of restaurants. In this project we can perform the following functions given below :-

* Get all the restaurant Details.
* Get a restaurant detail by restaurant id.
* Add multiple restaurants at a time.
* Also can add one restaurant at a time.
* Update a restaurant detail by restaurant id.
* Delete a restaurant by restaurant id.


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