package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");
        Board board = context.getBean(Board.class);

        //When
        board.getToDoList().addTask("ToDo Task");
        board.getInProgressList().addTask("InProgress Task");
        board.getDoneList().addTask("Done Task");

        //Then
        Assertions.assertEquals("ToDo Task", board.getToDoList().getTasks().get(0));
        Assertions.assertEquals("InProgress Task", board.getInProgressList().getTasks().get(0));
        Assertions.assertEquals("Done Task", board.getDoneList().getTasks().get(0));

    }
}
