package Tema2;

import java.util.Random;
import java.util.Scanner;

public class PracticaCombateFunciones {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random(); static Random random1 = new Random();
    static int velocidad1 = 0; static int velocidad2 = 0;
    static int ataque1 = 0; static int ataque2 = 0;
    static int defensa1 = 0; static int defensa2 = 0;
    static int vida1 = 200; static int vida2 = 200;
    static int habilidad1 = 0; static int habilidad2 = 0;
    static int aleatorioDamage = random1.nextInt(-2, -1);
    static int aleatorioHabilidad1 = random.nextInt(1, 3); static int aleatorioHabilidad2 = random.nextInt(1, 3);
    static int aleatorioVelocidad1 = random.nextInt(1, 100); static int aleatorioVelocidad2 = random.nextInt(1, 100);
    static int aleatorioAtaque1 = random.nextInt(1, 100); static int aleatorioAtaque2 = random.nextInt(1, 100);
    static int aleatorioDefensa1 = random.nextInt(1, 100); static int aleatorioDefensa2 = random.nextInt(1, 100);
    static int damage; static int velocidadDamage = 0; static int damageFinal = 0; static int personajes; static int damageRandom;
    static String continuar; static String critico; static String regeneracion;
    static int contadorRondas = 1; static int aleatorio; static int criticoMenu; static int regeneracionMenu; static int estadoMenu;
    public static void empieza() {
        System.out.println("""
                 ______ __  __ _____ _____ ______ ______           ______ _             _ _    _ ______ _____  ____ \s
                |  ____|  \\/  |  __ \\_   _|  ____|___  /   /\\     |  ____| |           | | |  | |  ____/ ____|/ __ \\\s
                | |__  | \\  / | |__) || | | |__     / /   /  \\    | |__  | |           | | |  | | |__ | |  __| |  | |
                |  __| | |\\/| |  ___/ | | |  __|   / /   / /\\ \\   |  __| | |       _   | | |  | |  __|| | |_ | |  | |
                | |____| |  | | |    _| |_| |____ / /__ / ____ \\  | |____| |____  | |__| | |__| | |___| |__| | |__| |
                |______|_|  |_|_|   |_____|______/_____/_/    \\_\\ |______|______|  \\____/ \\____/|______\\_____|\\____/\s""");
        System.out.println();

    }
    public static void jugador1() {
        System.out.println("""
                ───────────▄▄▄▄▄▄▄▄▄───────────
                ────────▄█████████████▄────────
                █████──█████████████████──█████
                ▐████▌─▀███▄───────▄███▀─▐████▌
                ─█████▄──▀███▄───▄███▀──▄█████─
                ─▐██▀███▄──▀███▄███▀──▄███▀██▌─
                ──███▄▀███▄──▀███▀──▄███▀▄███──
                ──▐█▄▀█▄▀███─▄─▀─▄─███▀▄█▀▄█▌──
                ───███▄▀█▄██─██▄██─██▄█▀▄███───
                ────▀███▄▀██─█████─██▀▄███▀────
                ───█▄─▀█████─█████─█████▀─▄█───
                ───███────────███────────███───
                ───███▄────▄█─███─█▄────▄███───
                ───█████─▄███─███─███▄─█████───
                ───█████─████─███─████─█████───
                ───█████─████─███─████─█████───
                ───█████─████─███─████─█████───
                ───█████─████▄▄▄▄▄████─█████───
                ────▀███─█████████████─███▀────
                ──────▀█─███─▄▄▄▄▄─███─█▀──────
                ─────────▀█▌▐█████▌▐█▀─────────
                ────────────███████────────────
                """);
    }
    public static void jugador2() {
        System.out.println("""
                ____¶¶¶¶_______________________________¶¶¶¶
                __¶¶¶11¶¶¶___________________________¶¶¶11¶¶¶
                _¶¶111111¶¶_________________________¶¶111111¶¶
                _¶¶111111¶¶_________________________¶¶111111¶¶
                __¶¶¶111¶¶___________________________¶¶1111¶¶
                ____¶¶¶11¶¶__________________________¶¶11¶¶¶
                ______¶¶11¶¶_______¶¶¶¶¶¶¶¶¶________¶¶11¶¶
                _______¶¶11¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶11¶¶
                ________¶¶11¶¶11111111111111111111¶¶11¶¶
                ______¶¶¶11111111111111111111111111111¶¶¶
                ____¶¶¶1111111111111111111111111111111111¶¶
                ___¶¶11111111111111111111111111111111111111¶¶
                __¶11111111111111111111111111111111111111111¶¶
                _¶1111111111111111111111111111111111111111111¶¶
                ¶¶1111111111111111111111111111111111111111111¶¶
                ¶¶11111111111111111111111111111111111111111111¶
                _¶11111111111¶¶¶¶¶11111111111¶¶¶¶¶11111111111¶¶
                _¶¶11111111111111111111111111111111111111111¶¶
                __¶¶¶11111111¶¶¶¶¶¶¶¶1111111¶¶¶¶¶¶¶¶1111111¶¶
                ____¶¶11111¶¶¶¶¶¶¶_¶¶¶1111¶¶¶¶¶¶¶__¶¶1111¶¶¶
                _____¶¶111¶¶¶¶¶¶¶____¶¶¶¶¶¶¶¶¶¶¶¶___¶¶11¶¶
                _______¶11¶¶¶¶¶¶¶¶¶_¶¶¶11¶¶¶¶¶¶¶¶¶_¶¶¶1¶¶
                ______¶¶111¶¶¶¶¶¶¶¶¶¶¶1111¶¶¶¶¶¶¶¶¶¶¶111¶
                _____¶¶11111¶¶¶¶¶¶¶¶11111111¶¶¶¶¶¶¶111111¶
                _____¶1111111111111111¶¶1¶111111111111111¶
                _____¶¶111111111111111¶111¶1111111111111¶¶
                ______¶¶1111111111111111111111111111111¶¶
                _______¶¶11111111111111111111111111111¶¶
                _________¶¶¶11111111¶¶¶¶¶¶¶¶¶1111111¶¶¶
                ___________¶¶¶¶1111111¶¶¶¶¶11111¶¶¶¶
                ______________¶¶¶¶1111111111111¶¶¶
                _________________¶¶11111111111¶¶
                __________________¶¶¶¶¶¶¶¶¶¶¶¶¶
                """);
    }
    public static void ganaJugador1() {
        System.out.println("""
                 ______ _            _ _    _  _____          _____   ____  _____   __      _    _            _____          _   _          _____   ____  _ _\s
                |  ____| |          | | |  | |/ ____|   /\\   |  __ \\ / __ \\|  __ \\ /_ |    | |  | |   /\\     / ____|   /\\   | \\ | |   /\\   |  __ \\ / __ \\| | |
                | |__  | |          | | |  | | |  __   /  \\  | |  | | |  | | |__) | | |    | |__| |  /  \\   | |  __   /  \\  |  \\| |  /  \\  | |  | | |  | | | |
                |  __| | |      _   | | |  | | | |_ | / /\\ \\ | |  | | |  | |  _  /  | |    |  __  | / /\\ \\  | | |_ | / /\\ \\ | . ` | / /\\ \\ | |  | | |  | | | |
                | |____| |____ | |__| | |__| | |__| |/ ____ \\| |__| | |__| | | \\ \\  | |    | |  | |/ ____ \\ | |__| |/ ____ \\| |\\  |/ ____ \\| |__| | |__| |_|_|
                |______|______| \\____/ \\____/ \\_____/_/    \\_\\_____/ \\____/|_|  \\_\\ |_|    |_|  |_/_/    \\_\\ \\_____/_/    \\_\\_| \\_/_/    \\_\\_____/ \\____/(_|_)""");
        System.out.println();
    }
    public static void ganaJugador2() {
        System.out.println("""
                 ______ _            _ _    _  _____          _____   ____  _____    ___    _    _            _____          _   _          _____   ____  _ _\s
                |  ____| |          | | |  | |/ ____|   /\\   |  __ \\ / __ \\|  __ \\  |__ \\  | |  | |   /\\     / ____|   /\\   | \\ | |   /\\   |  __ \\ / __ \\| | |
                | |__  | |          | | |  | | |  __   /  \\  | |  | | |  | | |__) |    ) | | |__| |  /  \\   | |  __   /  \\  |  \\| |  /  \\  | |  | | |  | | | |
                |  __| | |      _   | | |  | | | |_ | / /\\ \\ | |  | | |  | |  _  /    / /  |  __  | / /\\ \\  | | |_ | / /\\ \\ | . ` | / /\\ \\ | |  | | |  | | | |
                | |____| |____ | |__| | |__| | |__| |/ ____ \\| |__| | |__| | | \\ \\   / /_  | |  | |/ ____ \\ | |__| |/ ____ \\| |\\  |/ ____ \\| |__| | |__| |_|_|
                |______|______| \\____/ \\____/ \\_____/_/    \\_\\_____/ \\____/|_|  \\_\\ |____| |_|  |_/_/    \\_\\ \\_____/_/    \\_\\_| \\_/_/    \\_\\_____/ \\____/(_|_)""");
        System.out.println();
    }
    public static void gameOver() {
        System.out.println("""

                ┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼
                ███▀▀▀██┼███▀▀▀███┼███▀█▄█▀███┼██▀▀▀
                ██┼┼┼┼██┼██┼┼┼┼┼██┼██┼┼┼█┼┼┼██┼██┼┼┼
                ██┼┼┼▄▄▄┼██▄▄▄▄▄██┼██┼┼┼▀┼┼┼██┼██▀▀▀
                ██┼┼┼┼██┼██┼┼┼┼┼██┼██┼┼┼┼┼┼┼██┼██┼┼┼
                ███▄▄▄██┼██┼┼┼┼┼██┼██┼┼┼┼┼┼┼██┼██▄▄▄
                ┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼
                ███▀▀▀███┼▀███┼┼██▀┼██▀▀▀┼██▀▀▀▀██▄┼
                ██┼┼┼┼┼██┼┼┼██┼┼██┼┼██┼┼┼┼██┼┼┼┼┼██┼
                ██┼┼┼┼┼██┼┼┼██┼┼██┼┼██▀▀▀┼██▄▄▄▄▄▀▀┼
                ██┼┼┼┼┼██┼┼┼██┼┼█▀┼┼██┼┼┼┼██┼┼┼┼┼██┼
                ███▄▄▄███┼┼┼─▀█▀┼┼─┼██▄▄▄┼██┼┼┼┼┼██▄
                ┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼
                ┼┼┼┼┼┼┼┼██┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼██┼┼┼┼┼┼┼┼┼
                ┼┼┼┼┼┼████▄┼┼┼▄▄▄▄▄▄▄┼┼┼▄████┼┼┼┼┼┼┼
                ┼┼┼┼┼┼┼┼┼▀▀█▄█████████▄█▀▀┼┼┼┼┼┼┼┼┼┼
                ┼┼┼┼┼┼┼┼┼┼┼█████████████┼┼┼┼┼┼┼┼┼┼┼┼
                ┼┼┼┼┼┼┼┼┼┼┼██▀▀▀███▀▀▀██┼┼┼┼┼┼┼┼┼┼┼┼
                ┼┼┼┼┼┼┼┼┼┼┼██┼┼┼███┼┼┼██┼┼┼┼┼┼┼┼┼┼┼┼
                ┼┼┼┼┼┼┼┼┼┼┼█████▀▄▀█████┼┼┼┼┼┼┼┼┼┼┼┼
                ┼┼┼┼┼┼┼┼┼┼┼┼███████████┼┼┼┼┼┼┼┼┼┼┼┼┼
                ┼┼┼┼┼┼┼┼▄▄▄██┼┼█▀█▀█┼┼██▄▄▄┼┼┼┼┼┼┼┼┼
                ┼┼┼┼┼┼┼┼▀▀██┼┼┼┼┼┼┼┼┼┼┼██▀▀┼┼┼┼┼┼┼┼┼
                ┼┼┼┼┼┼┼┼┼┼▀▀┼┼┼┼┼┼┼┼┼┼┼▀▀┼┼┼┼┼┼┼┼┼┼┼
                ┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼
                """);
    }
    public static void personajesPersonalizados() {
        while ((velocidad1 + ataque1 + defensa1 + vida1 > 500) || ((velocidad1 > 200) || (velocidad1 < 1)) || ((ataque1 > 200) || (ataque1 < 1)) || ((defensa1 > 200) || (defensa1 < 1)) || ((vida1 > 200) || (vida1 < 1))) {
            System.out.println("La suma de los valores no puede superar 500 y cada valor no puede superar 200, porfavor vuelva a intertarlo");
            System.out.println("Dime la velocidad del primer jugador entre 1 - 200");
            velocidad1 = scanner.nextInt();
            System.out.println("Dime el ataque del primer jugador entre 1 - 200");
            ataque1 = scanner.nextInt();
            System.out.println("Dime la defensa del primer jugador entre 1 - 200");
            defensa1 = scanner.nextInt();
            System.out.println("Los puntos de vida del primer jugador son 200");
            System.out.println("Escoge una de estas dos habilidades: 1 FURIA, 2 AFILAR.");
            habilidad1 = scanner.nextInt();
            System.out.println("");
        }
        while ((velocidad2 + ataque2 + defensa2 + vida2 > 500) || ((velocidad2 > 200) || (velocidad2 < 1)) || ((ataque2 > 200) || (ataque2 < 1)) || ((defensa2 > 200) || (defensa2 < 1)) || ((vida2 > 200) || (vida2 < 1))) {
            System.out.println("La suma de los valores no puede superar 500 y cada valor no puede superar 200, porfavor vuelva a intertarlo");
            System.out.println("Dime la velocidad del segundo jugador entre 1 - 200");
            velocidad2 = scanner.nextInt();
            System.out.println("Dime el ataque del segundo jugador entre 1 - 200");
            ataque2 = scanner.nextInt();
            System.out.println("Dime la defensa del segundo jugador entre 1 - 200");
            defensa2 = scanner.nextInt();
            System.out.println("Los puntos de vida del segundo jugador son 200");
            System.out.println("Escoge una de estas dos habilidades: 1 FURIA, 2 AFILAR.");
            habilidad2 = scanner.nextInt();
            System.out.println("");
        }
    }
        public static void personajesPredefinidos() {
            System.out.println("PRIMER JUGADOR");
            jugador1();
            System.out.println("El primer jugador tiene estas caracteristicas:");
            velocidad1 = aleatorioVelocidad1;
            System.out.println("La velocidad del primer jugador es de " + velocidad1);
            ataque1 = aleatorioAtaque1;
            System.out.println("El ataque del primer jugador es de " + ataque1);
            defensa1 = aleatorioDefensa1;
            System.out.println("La defensa del primer jugador es de " + defensa1);
            System.out.println("La vida del primer jugador es de 200");
            habilidad1 = aleatorioHabilidad1;
            System.out.println("");
            System.out.println("SEGUNDO JUGADOR");
            jugador2();
            System.out.println("El segundo jugador tiene estas caracteristicas:");
            velocidad2 = aleatorioVelocidad2;
            System.out.println("La velocidad del segundo jugador es de " + velocidad2);
            ataque2 = aleatorioAtaque2;
            System.out.println("El ataque del segundo jugador es de " + ataque2);
            defensa2 = aleatorioDefensa2;
            System.out.println("La defensa del segundo jugador es de " + defensa2);
            System.out.println("La vida del segundo jugador es de 200");
            habilidad2 = aleatorioHabilidad2;
            System.out.println("");
        }
    public static void critico(int criticoMenu) {
        boolean result = false;
        if ((criticoMenu == 1 && (vida1 > 35 && velocidad1 > 60 && ataque1 > 45)) || (criticoMenu == 2 && (vida2 > 35 && velocidad2 > 60 && ataque2 > 45))) {
            result = true;
        }
        if (result == true){
        System.out.println("Quieres realizar un crítico ? Escribe SI o NO");
        critico = scanner.next();
            if (critico.equals("SI") || critico.equals("Si") || critico.equals("si")) {
                damageFinal = damageFinal * 2;
            }
        }
    }
    public static void regeneracion(int regeneracionMenu) {
        boolean result = false;
        if ((ataque1 > 50 && vida1 < 200) || (ataque2 > 50 && vida2 < 200)){
            result = true;
        }
        if (result == true) {
            System.out.println("Quieres utilizar regeneración, perderas 50 de ataque? Escribe SI  o NO ");
            regeneracion = scanner.next();
            if (regeneracion.equals("SI") || regeneracion.equals("Si") || regeneracion.equals("si")) {
                switch (regeneracionMenu) {
                    case 1:
                        vida1 = 200;
                        ataque1 = ataque1 - 50;
                        break;
                    case 2:
                        vida2 = 200;
                        ataque2 = ataque2 - 50;
                        break;
                }
            }
        }
    }
    public static void estado() {
        switch (PracticaCombateFunciones.estadoMenu) {
            case 1:
                if (habilidad1 == 1) {
                    System.out.println("La habilidad es FURIA");
                    System.out.println("Jugador 1 le quita = " + damageFinal + " de vida al jugador 2");
                    System.out.println("Jugador 1 = defensa: " + (defensa1 / 2) + " vida: " + Math.max(0, vida1));
                    System.out.println("Jugador 2 = defensa: " + defensa2 + " vida: " + Math.max(0, vida2));
                    System.out.println("");
                } else if (habilidad1 == 2) {
                    System.out.println("La habilidad es AFILAR");
                    System.out.println("Jugador 1 le quita = " + damageFinal + " de vida al jugador 2");
                    System.out.println("Jugador 1 = defensa: " + defensa1 + " vida: " + Math.max(0, vida1));
                    System.out.println("Jugador 2 = defensa: " + defensa2 + " vida: " + Math.max(0, vida2));
                    System.out.println("");
                }
                break;
            case 2:
                if (habilidad2 == 1) {
                    System.out.println("La habilidad es FURIA");
                    System.out.println("Jugador 2 le quita = " + damageFinal + " de vida al jugador 1");
                    System.out.println("Jugador 1 = defensa: " + defensa1 + " vida: " + Math.max(0, vida1));
                    System.out.println("Jugador 2 = defensa: " + (defensa2 / 2) + " vida: " + Math.max(0, vida2));
                    System.out.println("");
                } else if (habilidad2 == 2) {
                    System.out.println("La habilidad es AFILAR");
                    System.out.println("Jugador 2 le quita = " + damageFinal + " de vida al jugador 1");
                    System.out.println("Jugador 1 = defensa: " + defensa1 + " vida: " + Math.max(0, vida1));
                    System.out.println("Jugador 2 = defensa: " + defensa2 + " vida: " + Math.max(0, vida2));
                    System.out.println("");
                }
                break;
        }
    }
    public static void damageRamdom(){
        switch (damageRandom) {
            case 1:
            if (velocidad1 > 15) {
                velocidadDamage = 5;
            } else {
                if (velocidad1 < 15) {
                    velocidadDamage = 2;
                }
            }
            aleatorio = random1.nextInt(2, 7);
            break;
            case 2:
                if (velocidad2 > 15) {
                    velocidadDamage = 5;
                } else {
                    if (velocidad2 < 15) {
                        velocidadDamage = 2;
                    }
                }
                aleatorio = random1.nextInt(2, 7);
        }
    }
    public static int damage() {
        if (habilidad1 == 1) {
            damageRandom = 1;
            damageRamdom();
            damage = (((ataque1 * 3) - defensa2) / aleatorio) * velocidadDamage;
        } else {
            velocidad1 = (velocidad1 / 2);
            damageRandom = 1;
            damageRamdom();
            damage = ((ataque1 - defensa2) / aleatorio) * velocidadDamage;
        }
        if (habilidad2 == 1) {
            damageRandom = 2;
            damageRamdom();
            damage = (((ataque2 * 3) - defensa1) / aleatorio) * velocidadDamage;
        } else {
            velocidad2 = (velocidad2 / 2);
            damageRandom = 2;
            damageRamdom();
            damage = ((ataque2 - defensa1) / aleatorio) * velocidadDamage;
        }
        if (damage <= 0) {
            damageFinal = damage * aleatorioDamage;
        } else {
            if (damage >= 100) {
                damageFinal = damage / 6;
            } else {
                damageFinal = damage;
            }
        }
        return damageFinal;
    }
    public static void rondas() {
        while (vida1 > 0 && vida2 > 0) {
            System.out.println("RONDA " + contadorRondas);
            if (velocidad1 >= velocidad2 || vida1 <= vida2) {
                System.out.println("Jugador 1 ataca a jugador 2");
                damage();
                criticoMenu = 1;
                critico(criticoMenu);
                regeneracionMenu = 1;
                regeneracion(regeneracionMenu);
                vida2 = vida2 - (damageFinal);
                estadoMenu = 1;
                estado();
            }else if (velocidad2 > velocidad1 || vida1 > vida2) {
                System.out.println("Jugador 2 ataca a jugador 1");
                damage();
                criticoMenu = 2;
                critico(criticoMenu);
                regeneracionMenu = 2;
                regeneracion(regeneracionMenu);
                vida1 = vida1 - (damageFinal);
                estadoMenu = 2;
                estado();
            }
        System.out.println("Toca cualquier caracter para continuar");
        continuar = scanner.next();
        contadorRondas++;
    }
}
    public static void personaje(){
        System.out.println("Porfavor dime uno de estos dos valores para el personaje 1: Personalizado    2: Predefinidos");
        personajes = scanner.nextInt();
        while ((personajes < 1) || (personajes > 2)){
            System.out.println("Porfavor dime uno de estos dos valores para el personaje 1: Personalizado    2: Predefinidos");
            personajes = scanner.nextInt();
        }
        if (personajes == 1){
            personajesPersonalizados();
        } else {
            personajesPredefinidos();
        }
    }
    public static void finalJuego(){
        if (vida2 <= 0) {
            ganaJugador1();
            gameOver();
        } else if (vida1 <= 0) {
            ganaJugador2();
            gameOver();
        }
    }
    public static void main(String[] args){
        empieza();
        personaje();
        rondas();
        finalJuego();
    }
}