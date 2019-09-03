package com.springlearn.project.services;

import com.springlearn.project.security.UserSS;
import org.springframework.security.core.context.SecurityContextHolder;

public class UserService {

    public static UserSS authenticated(){
        try {
            return (UserSS) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
}
