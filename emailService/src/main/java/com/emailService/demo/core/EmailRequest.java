package com.emailService.demo.core;

public record EmailRequest(String to, String subject, String body) {
}
