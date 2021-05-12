package com.company;

public class Main {

    public static void main(String[] args) {
        Weapon sword = new Weapon();
        sword.setWeaponName("Топор");
        sword.setWeaponType("холодное оружие");

        Boss boss = new Boss();
        boss.setHealth(200);
        boss.setDamage(350);
        boss.setWeapon(sword);

        System.out.println("Жизнь босса = " + boss.getHealth() + ", урон босса = " + boss.getDamage() + ", оружие босса : " + boss.getWeapon().getWeaponType() + ", тип оружие : " + boss.getWeapon().getWeaponName());

        System.out.println("____________ дз на сооброзительность ____________");
        System.out.println(boss.printInfo());

        Skeleton skeleton = new Skeleton();
        Skeleton skeleton2 = new Skeleton();
        skeleton.setHealth(120);
        skeleton.setDamage(50);
        skeleton.weapon.setWeaponName("Лук");
        skeleton.weapon.setWeaponType("Дальный");
        skeleton.setNumberArrows(70);
        skeleton2.setHealth(100);
        skeleton2.setDamage(60);
        skeleton2.weapon.setWeaponName("Меч");
        skeleton2.weapon.setWeaponType("Холодное оружие");
        skeleton2.setNumberArrows(25);

        System.out.println(skeleton.printInfo() + "\n" + skeleton2.printInfo());


    }
}
