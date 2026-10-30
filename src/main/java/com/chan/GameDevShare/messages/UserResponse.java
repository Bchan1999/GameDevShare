package com.chan.GameDevShare.messages;

import com.chan.GameDevShare.models.User;

public record UserResponse(Long id, String email, String displayName) {
    public static UserResponse from(User user) {
        return new UserResponse(user.getId(), user.getEmail(), user.getDisplayName());
    }
}
