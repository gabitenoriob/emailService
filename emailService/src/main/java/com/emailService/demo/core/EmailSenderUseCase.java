package com.emailService.demo.core;

public interface EmailSenderUseCase {

    void sendEmail(String to, String subject, String body);
}
