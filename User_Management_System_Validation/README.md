# Welcome to User Management System with Validation README File :wave:


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
 MySql Driver
```

# :office: DataFlow of the program 
<br>

## Model
___
> In the model Package we have defined the UserEntity class with validation anotation, which has the following attributes:
1. userId : @Id and unique identifier for each user.
2. userName : @NotBlank for name of the user.
3. userDOB : @NotNull for user Date Of Birth.
4. userEmail : @Email type used.
5. userPhoneNumber : @Pattern(regexp = "\\d{2}-\\d{10}") used for first 2 numbers for country and last 10 for phone number.
6. userDateTime : LocalDateTime used.

## Controller
___
> In the controller package we have created a class file userController to create apis of the functions we have to perform and also created the functions to perform the given tasks but controller takes help of the userService class to perform the tasks as it reduces high coupling in the code.

    
## Service
___
> In the service package we have created a class file userService to perform the given tasks and returning the output to controller. Service also takes help of userRepository class by fetching the list of users and then  perform the task and giving the output to controller and it makes it more less coupled.


## Repository
___
> In the repository package we have created a class file userRepository and in which we have created a List which is used to store the details of the user.


## Summary
___
This is a README file for explain the details about the project. This is a User Management System project which is used to manage user of a organization. In this project we can perform the following functions given below :-

* Add a User.
* Fetch the details of all users.
* Fetch the details of a single user.
* Update the details of the user.
* Delete a user.


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