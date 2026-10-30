package com.chan.GameDevShare.messages;

import com.chan.GameDevShare.models.User;

public record UpdateUserRequest(Long userId, String userEmail, String displayName) {
    public static UpdateUserRequest from(User user) {
        return new UpdateUserRequest(user.getId(), user.getEmail(), user.getDisplayName());
    }
}
