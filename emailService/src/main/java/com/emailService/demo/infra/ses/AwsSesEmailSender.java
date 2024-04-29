/*
package com.emailService.demo.infra.ses;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.amazonaws.services.simpleemail.model.*;
import com.emailService.demo.adapters.EmailSenderGateway;
import com.emailService.demo.core.exceptions.EmailServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//tirei o implemets gateway pq vou usar o provider do send grid
public class AwsSesEmailSender  {

    private final AmazonSimpleEmailService amazonSimpleEmailService;

    @Autowired
    public AwsSesEmailSender(AmazonSimpleEmailService amazonSimpleEmailService) {
        this.amazonSimpleEmailService = amazonSimpleEmailService;
    }

    //@Override
    public void sendEmail(String to, String subject, String body) {

        SendEmailRequest request = new SendEmailRequest()
                .withSource("gabitenoriob@gmail.com")
                .withDestination(new Destination().withToAddresses(to))
                .withMessage(new Message()
                        .withSubject(new Content(subject))
                        .withBody(new Body().withText(new Content(body)))
                );

        try {
            this.amazonSimpleEmailService.sendEmail(request);
        } catch (AmazonServiceException ex) {
            throw new EmailServiceException("Email sending failed", ex);
        }
    }
    }

*/
