package com.tutorial;

// Player
class Player {
    String name;
    double health;
    int level;

    // Object Member

    Weapon weapon;
    Armor armor;

    Player(String name, double health) {
        this.name = name;
        this.health = health;
    }

    void equipWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    void equipArmor(Armor armor) {
        this.armor = armor;
    }

    void display() {
        System.out.println("\nName : " + this.name);
        System.out.println("Health : " + this.health + " HP");
        this.weapon.display();
        this.armor.display();

    }

}

// Senjata
class Weapon {
    String name;
    double attackPower;

    Weapon(String name, double attackPower) {
        this.name = name;
        this.attackPower = attackPower;
    }

    void display() {
        System.out.println("Weapon : " + this.name + " , power : " + this.attackPower);

    }
}

// Armor
class Armor {
    String name;
    double defencePower;

    Armor(String name, double defencePower) {
        this.name = name;
        this.defencePower = defencePower;
    }

    void display() {
        System.out.println("Armor : " + this.name + " , defence power : " + this.defencePower);
    }

}

public class Main {

    public static void main(String[] args) {

        // Membuat Object Player
        Player player1 = new Player("Ucup", 100);
        Player player2 = new Player("Otong", 50);

        // Membuat Object Weapon
        Weapon pedang = new Weapon("pedang samurai", 15);
        Weapon ketapel = new Weapon("ketapel", 1);

        // Membuat object armor
        Armor bajuBesi = new Armor("Baju Besi", 10);
        Armor kaos = new Armor("Kaos", 0);

        
        // equip senjata dan armor
        
        // Player 1
        player1.equipWeapon(pedang);
        player1.equipArmor(kaos);
        player1.display();



        // Player 1
        player2.equipWeapon(ketapel);
        player2.equipArmor(bajuBesi);
        player2.display();

        
    }
}