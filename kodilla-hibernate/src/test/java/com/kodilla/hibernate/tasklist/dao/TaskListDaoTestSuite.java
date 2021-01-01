package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;

    @Test
    void testFindByListName() {
        //Given
        TaskList taskList = new TaskList("Test1", "This is test");
        taskListDao.save(taskList);

        //When
        String listName = taskList.getListName();
        List<TaskList> readTask = taskListDao.findByListName("Test1");

        //Then
        assertEquals("Test1", listName);

        //CleanUp
        int id = readTask.get(0).getId();
        taskListDao.deleteById(id);
    }
}
