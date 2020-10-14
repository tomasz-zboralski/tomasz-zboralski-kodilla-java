package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> UserList = new ArrayList<>();

    public Forum() {
        UserList.add(new ForumUser(001, "Mozg", 'F', LocalDate.of(1995, 1, 7), 4));
        UserList.add(new ForumUser(002, "Cukrowy", 'M', LocalDate.of(2001, 2, 5), 0));
        UserList.add(new ForumUser(003, "Brama", 'M', LocalDate.of(1995, 5, 2), 0));
        UserList.add(new ForumUser(004, "Praca", 'M', LocalDate.of(1999, 12, 4), 4));
        UserList.add(new ForumUser(005, "Bebzon", 'M', LocalDate.of(1998, 11, 8), 1));
    }

    public final List<ForumUser> getUserList() {
        return UserList;
    }
}
