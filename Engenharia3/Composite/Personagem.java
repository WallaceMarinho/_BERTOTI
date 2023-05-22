/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.compositeavatar;

/**
 *
 * @author walla
 */
public class Personagem implements Elemento{
     private String nome;

    public Personagem(String nome) {
        this.nome = nome;
    }

    @Override
    public void dobrar() {
         System.out.println(nome + " está dobrando seu elemento.");
        
    }
    
}
