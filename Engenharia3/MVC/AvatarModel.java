/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avatarmvc;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author walla
 */
public class AvatarModel implements Subject {
    private boolean inAvatarState;
    private List<Observer> observers = new ArrayList<>();

    public void enterAvatarState() {
        inAvatarState = true;
        notifyObservers();
    }

    public void exitAvatarState() {
        inAvatarState = false;
        notifyObservers();
    }

    public boolean isInAvatarState() {
        return inAvatarState;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(inAvatarState);
        }
    }
}


