/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.observer_avatar;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author walla
 */
public class Jornalista {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removerObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String evento) {
        for (Observer observer : observers) {
            observer.atualizar(evento);
        }
    }

 
    public void eventoImportante() {
  
        notifyObservers("Um evento importante ocorreu!");
    }
}

