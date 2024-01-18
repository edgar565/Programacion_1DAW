package Tema4;

import java.util.Scanner;

public class pruebaHero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ### HERO 1 ###");
        System.out.print("Nombre: ");
        String name1 = scanner.nextLine();
        System.out.print("Nivel: ");
        int level1 = scanner.nextInt();
        System.out.print("Salud: ");
        int health1 = scanner.nextInt();
        System.out.print("Maxima salud: ");
        int maxHealth1 = scanner.nextInt();
        System.out.print("Experiencia: ");
        int experience1 = scanner.nextInt();
        System.out.print("Ataque: ");
        int attack1 = scanner.nextInt();
        System.out.print("Defensa: ");
        int defense1= scanner.nextInt();
        scanner.nextLine();
        Hero hero1 = new Hero(name1, level1, health1, maxHealth1, experience1, attack1, defense1);
        System.out.println(" ### HERO 2 ###");
        System.out.print("Nombre: ");
        String name2 = scanner.nextLine();
        System.out.print("Nivel: ");
        int level2 = scanner.nextInt();
        System.out.print("Salud: ");
        int health2 = scanner.nextInt();
        System.out.print("Maxima salud: ");
        int maxHealth2 = scanner.nextInt();
        System.out.print("Experiencia: ");
        int experience2 = scanner.nextInt();
        System.out.print("Ataque: ");
        int attack2 = scanner.nextInt();
        System.out.print("Defensa: ");
        int defense2 = scanner.nextInt();
        Hero hero2 = new Hero(name2, level2, health2, maxHealth2, experience2, attack2, defense2);
        while (hero1.health > 0 && hero2.health > 0){
            hero1.attack(hero2);
            System.out.println("El jugador " + hero1.name + " le quita " + hero1.potenciaAtaque);
            System.out.println(hero2);
            if (hero2.defense < 15){
                hero2.rest();
            }else if (hero2.defense < 30){
                hero2.drinkPotion();
            }
            hero2.attack(hero1);
            System.out.println("El jugador " + hero2.name + " le quita " + hero2.potenciaAtaque);
            System.out.println(hero1);
            if (hero1.defense < 15){
                hero1.rest();
            }else if (hero1.defense < 30){
                hero1.drinkPotion();
            }
        }
    }
}
