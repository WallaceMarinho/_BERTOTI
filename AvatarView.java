/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avatarmvc;

/**
 *
 * @author walla
 */
public class AvatarView implements Observer {

 
      public void displayAvatarState(boolean inAvatarState) {
        if (inAvatarState) {
            System.out.println("Aang está no Estado Avatar.");
        } else {
            System.out.println("Aang não está no Estado Avatar.");
        }
    }

    @Override
    public void update(boolean inAvatarState) {
        displayAvatarState(inAvatarState);
    }
}
    
    

