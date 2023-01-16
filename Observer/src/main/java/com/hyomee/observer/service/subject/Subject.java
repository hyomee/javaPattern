package com.hyomee.observer.service.subject;


import com.hyomee.observer.service.observers.Observer;

public interface Subject{
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}
