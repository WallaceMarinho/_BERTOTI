/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.observer_avatar;

/**
 *
 * @author walla
 */
public class Sokka implements Observer {

    @Override
    public void atualizar(String evento) {
       System.out.println("Sokka está ciente que: " + evento);
    
    }
}
