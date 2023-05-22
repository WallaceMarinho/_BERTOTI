/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.singleton;

/**
 *
 * @author walla
 */
public class Singleton {

    public static void main(String[] args) {
        AvatarState avatarState = AvatarState.getInstance();
        avatarState.enterAvatarState();
        
        if (avatarState.isInAvatarState()) {
            System.out.println("Aang está no Estado Avatar!");
        } else {
            System.out.println("Aang não está no Estado Avatar.");
        }
        
        avatarState.exitAvatarState();
    }
    }

