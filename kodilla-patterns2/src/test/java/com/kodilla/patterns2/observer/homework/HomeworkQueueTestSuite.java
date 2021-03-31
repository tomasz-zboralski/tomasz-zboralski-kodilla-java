package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeworkQueueTestSuite {

    @Test
    void testUpdate() {
        //Given
        StudentAHomeworkQueue studentAHomeworkQueue = new StudentAHomeworkQueue();
        StudentBHomeworkQueue studentBHomeworkQueue = new StudentBHomeworkQueue();
        StudentCHomeworkQueue studentCHomeworkQueue = new StudentCHomeworkQueue();

        Mentor mentorA = new Mentor("Mentor A");
        Mentor mentorB = new Mentor("Mentor B");

        studentAHomeworkQueue.registerObserver(mentorA);
        studentBHomeworkQueue.registerObserver(mentorA);

        studentCHomeworkQueue.registerObserver(mentorB);

        studentAHomeworkQueue.addHomework("Homework1");
        studentAHomeworkQueue.addHomework("Homework2");
        studentAHomeworkQueue.addHomework("Homework3");

        studentBHomeworkQueue.addHomework("Homework1");
        studentBHomeworkQueue.addHomework("Homework2");

        studentCHomeworkQueue.addHomework("Homework1");

        //When
        int mentorANotifies = mentorA.getHomeworkCount();
        int mentorBNotifies = mentorB.getHomeworkCount();

        //Then
        assertEquals(5, mentorANotifies);
        assertEquals(1, mentorBNotifies);
    }

    @Test
    void testQueuePoll() {
        //Given
        StudentAHomeworkQueue studentAHomeworkQueue = new StudentAHomeworkQueue();

        studentAHomeworkQueue.addHomework("Homework1");
        studentAHomeworkQueue.addHomework("Homework2");
        studentAHomeworkQueue.addHomework("Homework3");
        studentAHomeworkQueue.addHomework("Homework4");

        //When
        studentAHomeworkQueue.getHomeworks().poll();
        String homework2 = studentAHomeworkQueue.getHomeworks().peek();
        int homeworks = studentAHomeworkQueue.getHomeworks().size();

        //Then
        assertEquals("Homework2", homework2);
        assertEquals(3, homeworks);
    }
}
