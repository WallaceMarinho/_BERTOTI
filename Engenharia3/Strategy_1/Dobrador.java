/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.strategy_dobrador_1;

/**
 *
 * @author walla
 */
public class Dobrador {
    private DobrarElemento dobrarElemento;

    public void setDobrarElemento(DobrarElemento dobrarElemento) {
        this.dobrarElemento = dobrarElemento;
    }

    public void dobrarElemento() {
        dobrarElemento.dobrar();
    }
}
