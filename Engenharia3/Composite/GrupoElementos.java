/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.compositeavatar;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author walla
 */
public class GrupoElementos implements Elemento {
    private List<Elemento> elementos = new ArrayList<>();

    public void addElemento(Elemento elemento) {
        elementos.add(elemento);
    }

    public void removeElemento(Elemento elemento) {
        elementos.remove(elemento);
    }

    @Override
    public void dobrar() {
        for (Elemento elemento : elementos) {
            elemento.dobrar();
    
        }
    }
}
    

