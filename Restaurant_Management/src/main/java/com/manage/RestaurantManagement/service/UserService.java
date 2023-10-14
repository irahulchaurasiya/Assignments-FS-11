package com.manage.RestaurantManagement.service;

import com.manage.RestaurantManagement.model.AuthenticationToken;
import com.manage.RestaurantManagement.model.Order;
import com.manage.RestaurantManagement.model.User;
import com.manage.RestaurantManagement.model.dto.SignInInput;
import com.manage.RestaurantManagement.model.dto.SignUpOutput;
import com.manage.RestaurantManagement.repo.IAuthTokenRepository;
import com.manage.RestaurantManagement.repo.IFoodItemRepo;
import com.manage.RestaurantManagement.repo.IOrderRepo;
import com.manage.RestaurantManagement.repo.IUserRepo;
import com.manage.RestaurantManagement.service.utility.emailUtility.EmailHandler;
import com.manage.RestaurantManagement.service.utility.hashingUtility.PasswordEncrypter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    IUserRepo userRepo;

    @Autowired
    IAuthTokenRepository authTokenRepository;

    @Autowired
    OrderService orderService;

    @Autowired
    IFoodItemRepo foodItemRepo;

    public SignUpOutput signUpUser(User user) {

        boolean signUpStatus = true;
        String signUpStatusMessage = null;

        String newEmail = user.getUserEmail();

        if(newEmail == null)
        {
            signUpStatusMessage = "Invalid email";
            signUpStatus = false;
            return new SignUpOutput(false,signUpStatusMessage);
        }

        //check if this User email already exists ??
        User existingUser = userRepo.findFirstByUserEmail(newEmail);

        if(existingUser != null)
        {
            signUpStatusMessage = "Email already registered!!!";
            signUpStatus = false;
            return new SignUpOutput(false,signUpStatusMessage);
        }

        //hash the password: encrypt the password
        try {
            String encryptedPassword = PasswordEncrypter.encryptPassword(user.getUserPassword());

            //saveAppointment the User with the new encrypted password

            user.setUserPassword(encryptedPassword);
            userRepo.save(user);

            return new SignUpOutput(true, "User registered successfully!!!");
        }
        catch(Exception e)
        {
            signUpStatusMessage = "Internal error occurred during sign up";
            signUpStatus = false;
            return new SignUpOutput(false,signUpStatusMessage);
        }
    }

    public List<User> getAllUsers() {
        return userRepo.findAll();
    }


    public String signInUser(SignInInput signInInput) {


        String signInStatusMessage = null;

        String signInEmail = signInInput.getEmail();

        if(signInEmail == null)
        {
            signInStatusMessage = "Invalid email";
            return signInStatusMessage;


        }

        //check if this User email already exists ??
        User existingUser = userRepo.findFirstByUserEmail(signInEmail);

        if(existingUser == null)
        {
            signInStatusMessage = "Email not registered!!!";
            return signInStatusMessage;

        }

        //match passwords :

        //hash the password: encrypt the password
        try {
            String encryptedPassword = PasswordEncrypter.encryptPassword(signInInput.getPassword());
            if(existingUser.getUserPassword().equals(encryptedPassword))
            {
                //session should be created since password matched and user id is valid
                AuthenticationToken authToken  = new AuthenticationToken(existingUser);
                authTokenRepository.save(authToken);

                EmailHandler.sendEmail(signInEmail,"email testing",authToken.getTokenValue());
                return "Token sent to your email";
            }
            else {
                signInStatusMessage = "Invalid credentials!!!";
                return signInStatusMessage;
            }
        }
        catch(Exception e)
        {
            signInStatusMessage = "Internal error occurred during sign in";
            return signInStatusMessage;
        }

    }


    public String signOutUser(String email) {

        User user = userRepo.findFirstByUserEmail(email);
        authTokenRepository.delete(authTokenRepository.findFirstByUser(user));
        return "User Signed out successfully";
    }

    public boolean giveOrder(Order order) {
        Long foodItemId = order.getFoodItem().getFoodItemId();
        boolean isFoodItemValid = foodItemRepo.existsById(foodItemId);

        //id of patient
        Long userId = order.getUser().getUserId();
        boolean isUserValid = userRepo.existsById(userId);

        if(isFoodItemValid && isUserValid)
        {
            orderService.saveOrder(order);
            return true;
        }
        else {
            return false;
        }
    }

    public void cancelOrder(String email) {

        User user = userRepo.findFirstByUserEmail(email);

        Order order = orderService.getOrderForUser(user);

        orderService.cancelOrder(order);
    }
}
