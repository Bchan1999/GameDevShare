package com.chan.GameDevShare.service;

import com.chan.GameDevShare.exception.EmailAlreadyUsedException;
import com.chan.GameDevShare.messages.RegisterRequest;
import com.chan.GameDevShare.messages.UserResponse;
import com.chan.GameDevShare.models.User;
import com.chan.GameDevShare.repo.UserRepo;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final UserRepo userRepo;
    private final PasswordEncoder passwordEncoder;

    public AuthService(UserRepo userRepo, PasswordEncoder passwordEncoder) {
        this.userRepo = userRepo;
        this.passwordEncoder = passwordEncoder;
    }

    public UserResponse register (RegisterRequest request) {
        String email = request.email().trim().toLowerCase();

        if (userRepo.existsByEmail(email)) {
            throw new EmailAlreadyUsedException(email);
        }

        User user = new User();
        user.setEmail(email);
        user.setPasswordHash(passwordEncoder.encode(request.password()));
        user.setDisplayName(request.displayName().trim());

        return UserResponse.from(userRepo.save(user));
    }

}
