/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.avatarmvc;

/**
 *
 * @author walla
 */
public class AvatarMVC {

    public static void main(String[] args) {
        AvatarModel model = new AvatarModel();
        AvatarView view = new AvatarView();
        AvatarController controller = new AvatarController(model, view);

        // Adicionando a view como observer do model
        model.addObserver(view);

        // Simulação de interações do usuário
        controller.enterAvatarState();
        controller.exitAvatarState();

        // Alterando a estratégia de ataque para Dobra de Fogo
        controller.setAttackStrategy(new FireBendingAttackStrategy());
        controller.performAttack();
    }
    }

