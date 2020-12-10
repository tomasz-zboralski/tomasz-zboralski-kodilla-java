package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case DRIVING:
                return new DrivingTask("Driving", "Home", "Car");
            case PAINTING:
                return new PaintingTask("Painting", "Blue", "Door");
            case SHOPPING:
                return new ShoppingTask("Shopping","Cake", 2.0);
            default:
                return null;
        }
    }
}
