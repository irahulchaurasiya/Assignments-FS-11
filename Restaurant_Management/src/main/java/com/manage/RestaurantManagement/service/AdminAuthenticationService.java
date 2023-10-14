package com.manage.RestaurantManagement.service;

import com.manage.RestaurantManagement.model.AdminAuthenticationToken;
import com.manage.RestaurantManagement.model.AuthenticationToken;
import com.manage.RestaurantManagement.repo.IAdminAuthTokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminAuthenticationService {

    @Autowired
    IAdminAuthTokenRepository adminAuthTokenRepository;
    public boolean authenticate(String email, String authTokenValue)
    {
        AdminAuthenticationToken authToken = adminAuthTokenRepository.findFirstByTokenValue(authTokenValue);

        if(authToken == null)
        {
            return false;
        }

        String tokenConnectedEmail = authToken.getAdmin().getAdminEmail();

        return tokenConnectedEmail.equals(email);
    }
}
