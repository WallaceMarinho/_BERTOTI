/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avatarclient;

/**
 *
 * @author walla
 */
public class AvatarFacade {
    private DobrarAr dobrarAr;
    private DobrarAgua dobrarAgua;
    private DobrarFogo dobrarFogo;
    private DobrarTerra dobrarTerra;

    public AvatarFacade() {
        this.dobrarAr = new DobrarAr();
        this.dobrarAgua = new DobrarAgua();
        this.dobrarFogo = new DobrarFogo();
        this.dobrarTerra = new DobrarTerra();
    }

    public void dobrarElementos() {
        dobrarAr.dobrarAr();
        dobrarAgua.dobrarAgua();
        dobrarFogo.dobrarFogo();
        dobrarTerra.dobrarTerra();
    }
}


