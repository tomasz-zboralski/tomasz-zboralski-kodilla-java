package com.kodilla.good.patterns.challenges;

public class MailService implements InformationService{

    public void inform(User user) {
        System.out.println("E-mail with information about your order has been sent to user " + user.getNICKNAME());
    }
}
