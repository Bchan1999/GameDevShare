package com.chan.GameDevShare.controller;

import com.chan.GameDevShare.messages.UpdateUserRequest;
import com.chan.GameDevShare.messages.UserResponse;
import com.chan.GameDevShare.service.UserService;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/me")
    public UserResponse me(Authentication authentication) {
        return userService.getCurrentUser(authentication.getName());
    }

    // optional, add later if you want it
    @PatchMapping("/me")
    public UserResponse updateMe(Authentication authentication,
                                 @RequestBody UpdateUserRequest request) {
        return userService.updateDisplayName(authentication.getName(), request.displayName());
    }
}
