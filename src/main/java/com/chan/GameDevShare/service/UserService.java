package com.chan.GameDevShare.service;

import com.chan.GameDevShare.messages.UserResponse;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public UserResponse getCurrentUser(String username) {
        return new UserResponse(Long.valueOf(123), "test" , "test");
    }

    public UserResponse updateDisplayName (String fullName , String userName) {
        return new UserResponse(123L, "test" , "test");
    }
}
