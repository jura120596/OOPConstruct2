package com.example.oop;

public class Wizard extends Unit{
    private int mana;

    public Wizard(String name, int hp, int mana) {
        super(name, hp);
        this.mana = mana;
    }


    @Override
    public void defend() {
        System.out.println(
                "Я защищаюсь маной"
        );
    }
}
