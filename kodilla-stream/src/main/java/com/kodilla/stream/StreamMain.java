package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum theForum = new Forum();
        Map<Integer, ForumUser> theMapOfUsers = theForum.getUserList().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> LocalDate.now().getYear() - user.getDateOfBirth().getYear() >= 20)
                .filter(user -> user.getPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getUserId, user -> user));


        System.out.println("# elements: " + theMapOfUsers.size());

        theMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}