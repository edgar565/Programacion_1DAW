package Tema4;

import java.util.Scanner;

public class pruebaHero {
    public static Hero leerHeroe(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre: ");
        String name = scanner.nextLine();
        System.out.print("Nivel: ");
        int level = scanner.nextInt();
        System.out.print("Salud: ");
        int health = scanner.nextInt();
        System.out.print("Maxima salud: ");
        int maxHealth = scanner.nextInt();
        System.out.print("Experiencia: ");
        int experience = scanner.nextInt();
        System.out.print("Ataque: ");
        int attack = scanner.nextInt();
        System.out.print("Defensa: ");
        int defense= scanner.nextInt();
        scanner.nextLine();
        return new Hero(name, level, health, maxHealth, experience, attack, defense);
    }
    public static void main(String[] args) {
        System.out.println(" ### HERO 1 ###");
        Hero hero1 = leerHeroe();
        System.out.println(" ### HERO 2 ###");
        Hero hero2 = leerHeroe();

        while (hero1.getHealth() > 0 && hero2.getHealth() > 0){
            hero1.attack(hero2);
            System.out.println("El jugador " + hero1.getName() + " le quita " + hero1.getPotenciaAtaque());
            System.out.println(hero2);
            if (hero1.getDefense() < 30 && hero1.getDefense() > 0){
                hero1.drinkPotion();
                hero1.defense = hero1.getDefense() - 10;
            }else if (hero1.getHealth() >= 30){
                hero1.rest();
                hero1.defense= hero1.defense - 15;
            }
            if (hero1.getDefense() < 0){
                hero1.defense = 0;
            }

            if (hero2.getHealth() > 0) {
                hero2.attack(hero1);
                System.out.println("El jugador " + hero2.getName() + " le quita " + hero2.getPotenciaAtaque());
                System.out.println(hero1);
                if (hero2.getDefense() < 30 && hero2.getDefense() > 0) {
                    hero2.drinkPotion();
                    hero2.defense = hero2.defense - 10;
                } else if (hero2.getDefense() > 30) {
                    hero2.rest();
                    hero2.defense = hero2.defense - 15;
                }
                if (hero2.getDefense() < 0){
                    hero2.defense = 0;
                }
            }
        }
    }
}