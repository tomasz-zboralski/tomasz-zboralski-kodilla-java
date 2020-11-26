package com.kodilla.good.patterns.challenges;

public class User {

    private final String NAME;
    private final String SURNAME;
    private final String NICKNAME;

    public User(String name, String surname, String nickname) {
        this.NAME = name;
        this.SURNAME = surname;
        this.NICKNAME = nickname;
    }

    public String getNAME() {
        return NAME;
    }

    public String getSURNAME() {
        return SURNAME;
    }

    public String getNICKNAME() {
        return NICKNAME;
    }
}
