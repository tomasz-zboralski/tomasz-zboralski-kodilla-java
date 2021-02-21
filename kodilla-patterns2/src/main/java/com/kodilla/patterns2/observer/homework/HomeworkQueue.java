package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class HomeworkQueue implements Observable {
    private final List<Observer> observers;
    private final Deque<String> homeworks;
    private final String name;

    public HomeworkQueue(String name) {
        this.observers = new ArrayList<>();
        this.homeworks = new ArrayDeque<>();
        this.name = name;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);

    }

    @Override
    public void notifyObservers() {
        observers.forEach(o -> o.update(this));

    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);

    }

    public void addHomework(String homework) {
        homeworks.add(homework);
        notifyObservers();
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public Deque<String> getHomeworks() {
        return homeworks;
    }

    public String getName() {
        return name;
    }
}
