package com.company;

public class Skeleton extends Boss{
    private int numberArrows;

    public void setNumberArrows(int numberArrows) {
        this.numberArrows = numberArrows;
    }

    public int getNumberArrows() {
        return numberArrows;
    }

    @Override
    public String printInfo() {
        return super.getHealth() + " = жизнь скелета, " + "урон скелета = " + getDamage() + ",  оружие скелета = " + getWeapon().getWeaponName() + ", тип оружие скелета = " + getWeapon().getWeaponType() + ", количество стрел = " + getNumberArrows();
    }
}
