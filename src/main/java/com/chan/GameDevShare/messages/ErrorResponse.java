package com.chan.GameDevShare.messages;

import java.time.Instant;

public record ErrorResponse(int status, String message, Instant timestamp) {}