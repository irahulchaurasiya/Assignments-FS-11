package com.manage.RestaurantManagement.service;

import com.manage.RestaurantManagement.model.Admin;
import com.manage.RestaurantManagement.model.AdminAuthenticationToken;
import com.manage.RestaurantManagement.model.dto.AdminSignInInput;
import com.manage.RestaurantManagement.model.dto.SignUpOutput;
import com.manage.RestaurantManagement.repo.IAdminAuthTokenRepository;
import com.manage.RestaurantManagement.repo.IAdminRepo;
import com.manage.RestaurantManagement.service.utility.emailUtility.EmailHandler;
import com.manage.RestaurantManagement.service.utility.hashingUtility.PasswordEncrypter;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    IAdminRepo adminRepo;

    @Autowired
    IAdminAuthTokenRepository adminAuthTokenRepository;
    public SignUpOutput signUpAdmin(Admin admin) {
        boolean signUpStatus = true;
        String signUpStatusMessage = null;

        String newEmail = admin.getAdminEmail();

        if(newEmail == null)
        {
            signUpStatusMessage = "Invalid email";
            signUpStatus = false;
            return new SignUpOutput(false,signUpStatusMessage);
        }

        //check if this admin email already exists ??
        Admin existingAdmin = adminRepo.findFirstByAdminEmail(newEmail);

        if(existingAdmin != null)
        {
            signUpStatusMessage = "Email already registered!!!";
            signUpStatus = false;
            return new SignUpOutput(false,signUpStatusMessage);
        }

        //hash the password: encrypt the password
        try {
            String encryptedPassword = PasswordEncrypter.encryptPassword(admin.getAdminPassword());

            //save the admin with the new encrypted password

            admin.setAdminPassword(encryptedPassword);
            adminRepo.save(admin);

            return new SignUpOutput(true, "Admin registered successfully!!!");
        }
        catch(Exception e)
        {
            signUpStatusMessage = "Internal error occurred during sign up";
            signUpStatus = false;
            return new SignUpOutput(false,signUpStatusMessage);
        }
    }

    public String signInAdmin(@Valid AdminSignInInput adminSignInInput) {

        String signInStatusMessage = null;

        String signInEmail = adminSignInInput.getEmail();

        if(signInEmail == null)
        {
            signInStatusMessage = "Invalid email";
            return signInStatusMessage;


        }

        //check if this admin email already exists ??
        Admin existingAdmin = adminRepo.findFirstByAdminEmail(signInEmail);

        if(existingAdmin == null)
        {
            signInStatusMessage = "Email not registered!!!";
            return signInStatusMessage;

        }

        //match passwords :

        //hash the password: encrypt the password
        try {
            String encryptedPassword = PasswordEncrypter.encryptPassword(adminSignInInput.getPassword());
            if(existingAdmin.getAdminPassword().equals(encryptedPassword))
            {
                //session should be created since password matched and admin id is valid
                AdminAuthenticationToken authToken  = new AdminAuthenticationToken(existingAdmin);
                adminAuthTokenRepository.save(authToken);

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

    public String signOutAdmin(String email) {

        Admin admin = adminRepo.findFirstByAdminEmail(email);
        adminAuthTokenRepository.delete(adminAuthTokenRepository.findFirstByAdmin(admin));
        return "Admin Signed out successfully";
    }
}
