package com.geekster.Api_and_Mail_Integration;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

@Component
public class MailHandler {
    @Bean
    public void sendMail() {
        Properties sysProperties = System.getProperties(); //this gives me a hash-map/ hash-table

        System.out.println(sysProperties);

        sysProperties.put("mail.smtp.host", MailMetaData.HostServer);
        sysProperties.put("mail.smtp.port", MailMetaData.port);
        sysProperties.put(MailMetaData.sslProperty, "true");
        sysProperties.put(MailMetaData.authPerm, "true");


        //create a session using sender-email and password
        Authenticator mailAuthenticator = new CustomizedMailAuthentication();
        Session mailSession = Session.getInstance(sysProperties, mailAuthenticator);

        //mime message build

        MimeMessage mailMessage = new MimeMessage(mailSession);

        try {
            mailMessage.setFrom(MailMetaData.myUserMail);
            mailMessage.setSubject("This is my java code testing");
            mailMessage.setText("Hey this is Rahul who is trying to send mail using java");

            //set the receiver

            Address receiverEmail = new InternetAddress(MailMetaData.receiverMail);
            mailMessage.setRecipient(Message.RecipientType.TO, receiverEmail);

            Transport.send(mailMessage);

        } catch (Exception mailException) {
            System.out.println(mailException.toString());
        }
    }
}
