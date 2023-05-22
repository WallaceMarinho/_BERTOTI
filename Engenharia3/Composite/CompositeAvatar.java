/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.compositeavatar;

/**
 *
 * @author walla
 */
public class CompositeAvatar {

    public static void main(String[] args) {
        Elemento aang = new Personagem("Aang");
        Elemento katara = new Personagem("Katara");
        Elemento toph = new Personagem("Toph");

      
       GrupoElementos PersonagensPrincipais= new GrupoElementos();
       PersonagensPrincipais.addElemento(aang);
       PersonagensPrincipais.addElemento(katara);
       PersonagensPrincipais.addElemento(toph);

  
        PersonagensPrincipais.dobrar();
    }
}
    

