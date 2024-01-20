package Tema4;

public class Hero {
    public String name;
    public static String DEFAULT_NAME = "Personaje";
    public int level;
    public int health;
    public static int DEFAULT_HEALTH = 50;
    public int maxHealth;
    public static final int DEFAULT_MAXHEALTH = 100;
    public int experience;
    public int attack;
    public static int DEFAULT_ATTACK = 15;
    public int defense;
    public static int DEFAULT_DEFENSE = 25;
    public final int potion = 10;
    public final int rest = 50;
    public int potenciaAtaque;

    public Hero() {
        this.name = DEFAULT_NAME;
        this.level = 0;
        this.health = DEFAULT_HEALTH;
        this.maxHealth = DEFAULT_MAXHEALTH;
        this.experience = 0;
        this.attack = DEFAULT_ATTACK;
        this.defense = DEFAULT_DEFENSE;
    }

    public Hero(String name, int level, int health, int maxHealth, int experience, int attack, int defense) {
        this.name = name;
        this.level = level;
        this.health = health;
        this.maxHealth = maxHealth;
        this.experience = experience;
        this.attack = attack;
        this.defense = defense;
    }
    public void drinkPotion(){
        health = health + potion;
        if (health > maxHealth){
            health = maxHealth;
        }
    }
    public void rest(){
        health = health + rest;
        if (health > maxHealth){
            health = maxHealth;
        }
    }
    public String toString(){
        System.out.println("");
       String informacion= " ### " + name + " ### \n" +
               "\n - Nivel: " + level +
                "\n - Salud: " + health +
                "\n - Experiencia: " + experience +
                "\n - Ataque: " + attack +
                "\n - Defensa: " + defense;
       return informacion;
    }
    public void attack(Hero hero1,Hero hero2){
        potenciaAtaque = Math.max(hero1.attack - hero2.defense, 10);
        hero2.health =  hero2.health - potenciaAtaque;
        hero1.experience = hero1.experience + 10;
        if (hero1.experience >= 50){
            levelUP();
        }
    }
    public void levelUP(){
        health = health + 5;
        attack = attack + 1;
        defense = defense + 1;
    }
}