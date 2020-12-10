package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task drivingTask = taskFactory.makeTask(TaskFactory.DRIVING);
        drivingTask.executeTask();

        //Then
        Assertions.assertEquals("Driving", drivingTask.getTaskName());
        Assertions.assertTrue(drivingTask.isTaskExecuted());

    }

    @Test
    void testFactoryPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task paintingTask = taskFactory.makeTask(TaskFactory.PAINTING);
        paintingTask.executeTask();

        //Then
        Assertions.assertEquals("Painting", paintingTask.getTaskName());
        Assertions.assertTrue(paintingTask.isTaskExecuted());

    }

    @Test
    void testFactoryShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task shoppingTask = taskFactory.makeTask(TaskFactory.SHOPPING);
        shoppingTask.executeTask();

        //Then
        Assertions.assertEquals("Shopping", shoppingTask.getTaskName());
        Assertions.assertTrue(shoppingTask.isTaskExecuted());

    }
}
