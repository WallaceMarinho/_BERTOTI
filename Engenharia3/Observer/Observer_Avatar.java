/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.observer_avatar;

/**
 *
 * @author walla
 */
public class Observer_Avatar {

    public static void main(String[] args) {
      Jornalista wallace = new Jornalista();


        Observer aang = new Aang();
        Observer katara = new Katara();
        Observer sokka = new Sokka();

       
        wallace.addObserver(aang);
        wallace.addObserver(katara);
        wallace.addObserver(sokka);
        
        
        wallace.eventoImportante();
    }
}
