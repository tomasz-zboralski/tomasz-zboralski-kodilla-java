package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String name;
    private int homeworkCount;

    public Mentor(String name) {
        this.name = name;
    }

    public void update(HomeworkQueue homeworkQueue) {
        homeworkCount++;
        int homeworkNumber = homeworkQueue.getHomeworks().size();
        System.out.println(
                "Hello " + name + " you've got " + homeworkNumber +
                        " homework" + (homeworkNumber == 1 ? " ":"s ") + "to check from " + homeworkQueue.getName() +
                        ", total [" + homeworkCount + "]"
        );
    }

    public String getName() {
        return name;
    }

    public int getHomeworkCount() {
        return homeworkCount;
    }
}
