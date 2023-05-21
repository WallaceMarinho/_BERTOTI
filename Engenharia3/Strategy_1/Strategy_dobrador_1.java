/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.strategy_dobrador_1;

/**
 *
 * @author walla
 */
public class Strategy_dobrador_1 {

    public static void main(String[] args) {
       Dobrador wallace = new Dobrador();

      
        wallace.setDobrarElemento(new DobrarFogo());
        wallace.dobrarElemento();
     

    }
}
