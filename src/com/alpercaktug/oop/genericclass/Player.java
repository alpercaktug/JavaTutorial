package com.alpercaktug.oop.genericclass;

public abstract class Player {

    public String getName() {
        return name;
    }

    private String name;

    public Player(String name) {
        this.name = name;
    }


}
