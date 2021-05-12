package com.company;

public class Boss extends GameEntity{

    Weapon weapon = new Weapon();

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String printInfo(){
        System.out.println();
        return "Жизнь босса = " + getHealth() + ", урон босса = " + getDamage() + ", оружие босса : " + getWeapon().getWeaponName() + ", тип оружие босса : " + getWeapon().getWeaponType();
    }
}
