package com.example.oop;

public class Unit {

    public int hp;
    public String name;
    public String weapon = "sword";

    public Unit(String name, int hp) {
        this.hp = hp;
        this.name = name;
    }
    public void attack(Unit enemy) {
        System.out.println("Я атакую " + enemy.name);
        enemy.hp -= 10;
        if (enemy.hp < 0) {
            System.out.println(enemy.name + " dead");
        }
        enemy.defend();
    }

    public void defend() {
        System.out.println("Игрок защищается");
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
}
