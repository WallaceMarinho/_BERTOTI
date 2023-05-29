/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avatarmvc;

/**
 *
 * @author walla
 */
public class AvatarController {
    private AvatarModel model;
    private AvatarView view;
    private AttackStrategy attackStrategy;

    public AvatarController(AvatarModel model, AvatarView view) {
        this.model = model;
        this.view = view;
        this.attackStrategy = new AirBendingAttackStrategy();
    }

    public void enterAvatarState() {
        model.enterAvatarState();
    }

    public void exitAvatarState() {
        model.exitAvatarState();
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void performAttack() {
        attackStrategy.attack();
    }
}

