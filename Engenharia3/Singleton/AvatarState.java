/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.singleton;

/**
 *
 * @author walla
 */
public class AvatarState {
        private static AvatarState instance;
    private boolean inAvatarState;

    private AvatarState() {
        // Construtor privado para evitar criação externa de instâncias
        inAvatarState = false;
    }

    public static AvatarState getInstance() {
        if (instance == null) {
            instance = new AvatarState();
        }
        return instance;
    }

    public void enterAvatarState() {
        inAvatarState = true;
        System.out.println("Aang entrou no Estado Avatar!");
    }

    public void exitAvatarState() {
        inAvatarState = false;
        System.out.println("Aang saiu do Estado Avatar.");
    }

    public boolean isInAvatarState() {
        return inAvatarState;
    }
}

