package model;

import contract.Observer;
import contract.Subject;

import java.util.List;

public class EmailTopic implements Subject {
    private List<Observer> observers;
    private String message;

    public EmailTopic(List<Observer> observers) {
        this.observers = observers;
    }

    public void postMessage(String msg) {
        System.out.println("Message posted in my topic: " + msg);
        this.message = msg;
        notifyObservers();
    }

    @Override
    public void register(Observer observer) {
        if (observer == null)
            throw new NullPointerException("Observer is null");
        if (!this.observers.contains(observer))
            this.observers.add(observer);

    }

    @Override
    public void unregister(Observer observer) {
        if (observer == null)
            throw new NullPointerException("Observer is null");
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : this.observers
        ) {
            observer.update();
        }
    }

    @Override
    public String getUpdate(Observer observer) {
        return this.message;
    }
}
