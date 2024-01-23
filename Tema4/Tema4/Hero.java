package Tema4;

public class Hero {
    private String name;
    private static String DEFAULT_NAME = "Personaje";
    private int level;
    private int health;
    private static int DEFAULT_HEALTH = 50;
    private int maxHealth;
    private static final int DEFAULT_MAXHEALTH = 100;
    private int experience;
    private int attack;
    private static int DEFAULT_ATTACK = 15;
    public int defense;
    private static int DEFAULT_DEFENSE = 25;
    private final int potion = 10;
    private final int rest = 50;
    private int potenciaAtaque;

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

    public String getName() {
        return name;
    }

    public int getPotenciaAtaque() {
        return potenciaAtaque;
    }

    public int getHealth() {
        return health;
    }

    public int getDefense() {
        return defense;
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
        //System.out.println("");
       String informacion= "\n\n ### " + name + " ### \n" +
               "\n - Nivel: " + level +
                "\n - Salud: " + health +
                "\n - Experiencia: " + experience +
                "\n - Ataque: " + attack +
                "\n - Defensa: " + defense;
       return informacion;
    }
    public void attack(Hero otroHeroe){
        potenciaAtaque = Math.max(attack - otroHeroe.defense, 10 );
        otroHeroe.receiveDamage(potenciaAtaque);
        experience = experience + 10;
        if (experience >= 50){
            levelUP();
        }
    }
    public void receiveDamage(int damage) {
        health =  health - potenciaAtaque;
    }
    public void levelUP(){
        maxHealth = maxHealth + 5;
        attack = attack + 1;
        defense = defense + 1;
    }
}