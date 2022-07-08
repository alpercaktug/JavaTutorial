package com.alpercaktug.oop.encapsulation;

// This class doesn't use encapsulation

public class Player {

    public String fullName;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if(this.health <=0) {
            System.out.println("Player is dead!");
        }
    }

    public int healthRemaining() {
        return this.health;
    }

}
