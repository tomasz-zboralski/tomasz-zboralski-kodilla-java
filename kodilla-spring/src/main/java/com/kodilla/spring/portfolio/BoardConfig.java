package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {

    @Bean
    public Board getBoard() {
        return new Board(getListToDo(), getListInProgress(), getListDone());
    }

    @Bean
    @Scope("prototype")
    public TaskList getListToDo() {
        return new TaskList();
    }

    @Bean
    @Scope("prototype")
    public TaskList getListInProgress() {
        return new TaskList();
    }

    @Bean
    @Scope("prototype")
    public TaskList getListDone() {
        return new TaskList();
    }

}
