package com.mycompany.mavenproject1;

import com.mycompany.mavenproject1.GEmailsender;


public class App {
    public static void main(String[] args) {

        GEmailsender gEmailSender = new GEmailsender();
        String to = "mayank7895bisht@gmail.com";
        String from = "automail23@gmail.com";
        String subject = "Second: Sending email using GMail";
        String text = "This is a example email send using gmail and java program with out less secure app";
        boolean b = gEmailSender.sendEmail(to, from, subject, text);
        if (b) {
            System.out.println("Email is sent successfully");
        } else {
            System.out.println("There is problem in sending email");
        }

    }
}
    
