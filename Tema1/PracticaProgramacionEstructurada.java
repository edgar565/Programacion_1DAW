import java.util.Random;
import java.util.Scanner;

public class PracticaProgramacionEstructurada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Random random1 = new Random();
        int aleatorio = random1.nextInt(2, 7);
        int aleatorioDaño = random1.nextInt(-9, -6);
        int aleatorioDaño1 = random1.nextInt(-9, 6);
        int aleatorioHabilidad = random.nextInt(1, 2);
        int aleatorioVelocidad1 = random.nextInt(1, 100);
        int aleatorioAtaque1 = random.nextInt(1, 100);
        int aleatorioDefensa1 = random.nextInt(1, 100);
        int aleatorioVelocidad2 = random.nextInt(1, 100);
        int aleatorioAtaque2 = random.nextInt(1, 100);
        int aleatorioDefensa2 = random.nextInt(1, 100);
        System.out.println("Elige el tipo de personaje=    1: Personalizado    2: Predefinidos ");
        int tipo = scanner.nextInt();
        if (tipo < 1) {
            System.out.println("Porfavor dime uno de estos dos valores para el personaje 1: Personalizado    2: Predefinidos");
            tipo = scanner.nextInt();
        } else {
            if (tipo > 2) {
                System.out.println("Porfavor dime uno de estos dos valores para el personaje 1: Personalizado    2: Predefinidos");
                tipo = scanner.nextInt();
            }
        }
        int velocidad1 = 0;
        int ataque1 = 0;
        int defensa1 = 0;
        int vida1 = 0;
        int velocidad2 = 0;
        int ataque2 = 0;
        int defensa2 = 0;
        int vida2 = 0;
        int habilidad1 = 0;
        int habilidad2 = 0;
        int daño;
        int velocidadaño = 0;
        int dañofinal = 0;
        switch (tipo) {
            case 1:
                System.out.println("Dime la velocidad del primer jugador entre 1 - 200");
                velocidad1 = scanner.nextInt();
                System.out.println("Dime el ataque del primer jugador entre 1 - 200");
                ataque1 = scanner.nextInt();
                System.out.println("Dime la defensa del primer jugador entre 1 - 200");
                defensa1 = scanner.nextInt();
                System.out.println("Dime los puntos de vida del primer jugador entre 1 - 200");
                vida1 = scanner.nextInt();
                System.out.println("Escoge una de estas tres habilidades: 1 FURIA, 2 DOBLE-DEFENSA o 3 AFILAR.");
                habilidad1 = scanner.nextInt();
                while ((velocidad1 + ataque1 + defensa1 + vida1 > 500) || ((velocidad1 > 200) || (velocidad1 < 1)) || ((ataque1 > 200) || (ataque1 < 1)) || ((defensa1 > 200) || (defensa1 < 1)) || ((vida1 > 200) || (vida1 < 1))) {
                    System.out.println("La suma de los valores no puede superar 500 y cada valor no puede superar 200, porfavor vuelva a intertarlo");
                    System.out.println("Dime la velocidad del primer jugador entre 1 - 200");
                    velocidad1 = scanner.nextInt();
                    System.out.println("Dime el ataque del primer jugador entre 1 - 200");
                    ataque1 = scanner.nextInt();
                    System.out.println("Dime la defensa del primer jugador entre 1 - 200");
                    defensa1 = scanner.nextInt();
                    System.out.println("Dime los puntos de vida del primer jugador entre 1 - 200");
                    vida1 = scanner.nextInt();
                    System.out.println("Escoge una de estas tres habilidades: 1 FURIA, 2 DOBLE-DEFENSA o 3 AFILAR.");
                    habilidad1 = scanner.nextInt();
                }
                System.out.println("Dime la velocidad del segundo jugador entre 1 - 200");
                velocidad2 = scanner.nextInt();
                System.out.println("Dime el ataque del segundo jugador entre 1 - 200");
                ataque2 = scanner.nextInt();
                System.out.println("Dime la defensa del segundo jugador entre 1 - 200");
                defensa2 = scanner.nextInt();
                System.out.println("Dime los puntos de vida del segundo jugador entre 1 - 200");
                vida2 = scanner.nextInt();
                System.out.println("Escoge una de estas tres habilidades: 1 FURIA, 2 DEFENSA.");
                habilidad2 = scanner.nextInt();
                while ((velocidad2 + ataque2 + defensa2 + vida2 > 500) || ((velocidad2 > 200) || (velocidad2 < 1)) || ((ataque2 > 200) || (ataque2 < 1)) || ((defensa2 > 200) || (defensa2 < 1)) || ((vida2 > 200) || (vida2 < 1))) {
                    System.out.println("La suma de los valores no puede superar 500 y cada valor no puede superar 200, porfavor vuelva a intertarlo");
                    System.out.println("Dime la velocidad del segundo jugador entre 1 - 200");
                    velocidad2 = scanner.nextInt();
                    System.out.println("Dime el ataque del segundo jugador entre 1 - 200");
                    ataque2 = scanner.nextInt();
                    System.out.println("Dime la defensa del segundo jugador entre 1 - 200");
                    defensa2 = scanner.nextInt();
                    System.out.println("Dime los puntos de vida del segundo jugador entre 1 - 200");
                    vida2 = scanner.nextInt();
                    System.out.println("Escoge una de estas tres habilidades: 1 FURIA, 2 DEFENSA.");
                    habilidad2 = scanner.nextInt();
                }
            case 2:
                System.out.println("El primer jugador tiene estas caracteristicas:");
                velocidad1 = aleatorioVelocidad1;
                System.out.println("La velocidad del primer jugador es de " + velocidad1);
                ataque1 = aleatorioAtaque1;
                System.out.println("El ataque del primer jugador es de " + ataque1);
                defensa1 = aleatorioDefensa1;
                System.out.println("La defensa del primer jugador es de " + defensa1);
                vida1 = 200;
                System.out.println("La vida del primer jugador es de 200");
                habilidad1 = aleatorioHabilidad;
                System.out.println("");
                System.out.println("El segundo jugador tiene estas caracteristicas:");
                velocidad2 = aleatorioVelocidad2;
                System.out.println("La velocidad del segundo jugador es de " + velocidad2);
                ataque2 = aleatorioAtaque2;
                System.out.println("El ataque del segundo jugador es de " + ataque2);
                defensa2 = aleatorioDefensa2;
                System.out.println("La defensa del segundo jugador es de " + defensa2);
                vida2 = 200;
                System.out.println("La vida del segundo jugador es de 200");
                habilidad2 = aleatorioHabilidad;
        }
        System.out.println("RONDA 1");
        if (velocidad1 >= velocidad2) {
            System.out.println("Jugador 1 ataca a jugador 2");
            if (habilidad1 == 1) {
                if (velocidad1 > 15) {
                    velocidadaño = 5;
                } else {
                    if (velocidad1 < 15) {
                        velocidadaño = 2;
                    }
                }
                daño = (((ataque1 * 3) - defensa2) / aleatorio) * velocidadaño;
                if (daño >= 200) {
                    dañofinal = daño / 6;
                } else {
                    if (daño <= 0) {
                        dañofinal = daño * (-aleatorioDaño);
                    }
                }
                vida2 = vida2 - dañofinal;
                System.out.println("Jugador 1 le quita = " + dañofinal + " de vida al jugador 2");
                System.out.println("Jugador 1 = defensa: " + (defensa1 / 2) + " vida: " + vida1);
                System.out.println("Jugador 2 = defensa: " + defensa2 + " vida: " + vida2);

            } else {
                velocidad1 = (velocidad1 / 2);

                if (velocidad1 > 15) {
                    velocidadaño = 5;
                } else {
                    if (velocidad1 < 15) {
                        velocidadaño = 2;
                    }
                }
                daño = ((ataque1 - defensa2) / aleatorio) * velocidadaño;
                if (daño >= 200) {
                    dañofinal = daño / 6;
                } else {
                    if (daño <= 0) {
                        dañofinal = daño * (-aleatorioDaño);
                    }
                }
                vida2 = vida2 - dañofinal;
                System.out.println("Jugador 1 le quita = " + dañofinal + " de vida al jugador 2");
                System.out.println("Jugador 1 = defensa: " + defensa1 + " vida: " + vida1);
                System.out.println("Jugador 2 = defensa: " + defensa2 + " vida: " + vida2);
            }
        } else {
            if (velocidad2 > velocidad1) {
                System.out.println("Jugador 2 ataca a jugador 1");
                if (habilidad2 == 1) {
                    if (velocidad2 > 15) {
                        velocidadaño = 5;
                    } else {
                        if (velocidad2 < 15) {
                            velocidadaño = 2;
                        }
                    }
                    daño = (((ataque2 * 3) - defensa1) / aleatorio) * velocidadaño;
                    if (daño >= 200) {
                        dañofinal = daño / 6;
                    } else {
                        if (daño <= 0) {
                            dañofinal = daño * (-aleatorioDaño);
                        }
                    }
                    vida1 = vida1 - dañofinal;
                    System.out.println("Jugador 2 le quita = " + dañofinal + " de vida al jugador 1");
                    System.out.println("Jugador 1 = defensa: " + defensa1 + " vida: " + vida1);
                    System.out.println("Jugador 2 = defensa: " + (defensa2 / 2) + " vida: " + vida2);
                } else {
                    velocidad2 = (velocidad2 / 2);
                    if (velocidad2 > 15) {
                        velocidadaño = 5;
                    } else {
                        if (velocidad2 < 15) {
                            velocidadaño = 2;
                        }
                    }
                    daño = ((ataque2 - defensa1) / aleatorio) * velocidadaño;
                    if (daño >= 200) {
                        dañofinal = daño / 6;
                    } else {
                        if (daño <= 0) {
                            dañofinal = daño * (-aleatorioDaño);
                        }
                    }
                    vida1 = vida1 - dañofinal;
                    System.out.println("Jugador 2 le quita = " + dañofinal + " de vida al jugador 1");
                    System.out.println("Jugador 1 = defensa: " + defensa1 + " vida: " + vida1);
                    System.out.println("Jugador 2 = defensa: " + defensa2 + " vida: " + vida2);
                }

            }
        }
        if (vida1 <= vida2) {
            System.out.println("Jugador 1 ataca a jugador 2");
            if (habilidad1 == 1) {
                if (velocidad1 > 15) {
                    velocidadaño = 5;
                } else {
                    if (velocidad1 < 15) {
                        velocidadaño = 2;
                    }
                }
                daño = (((ataque1 * 3) - defensa2) / aleatorio) * velocidadaño;
                if (daño >= 200) {
                    dañofinal = daño / 6;
                } else {
                    if (daño <= 0) {
                        dañofinal = daño * (-aleatorioDaño1);
                    }
                }
                vida2 = vida2 - dañofinal;
                System.out.println("Jugador 1 le quita = " + dañofinal + " de vida al jugador 2");
                System.out.println("Jugador 1 = defensa: " + (defensa1 / 2) + " vida: " + vida1);
                System.out.println("Jugador 2 = defensa: " + defensa2 + " vida: " + vida2);
            } else {
                velocidad1 = (velocidad1 / 2);
                if (velocidad1 > 1) {
                    velocidadaño = 5;
                } else {
                    if (velocidad1 < 15) {
                        velocidadaño = 2;
                    }
                }
                daño = ((ataque1 - defensa2) / aleatorio) * velocidadaño;
                if (daño >= 200) {
                    dañofinal = daño / 6;
                } else {
                    if (daño <= 0) {
                        dañofinal = daño * (-aleatorioDaño1);
                    }
                }
                vida2 = vida2 - dañofinal;
                System.out.println("Jugador 1 le quita = " + dañofinal + " de vida al jugador 2");
                System.out.println("Jugador 1 = defensa: " + defensa1 + " vida: " + vida1);
                System.out.println("Jugador 2 = defensa: " + defensa2 + " vida: " + vida2);
            }
        } else {
            if (vida2 < vida1) {
                System.out.println("Jugador 2 ataca a jugador 1");
                if (habilidad2 == 1) {
                    if (velocidad2 > 15) {
                        velocidadaño = 5;
                    } else {
                        if (velocidad2 < 15) {
                            velocidadaño = 2;
                        }
                    }
                    daño = (((ataque2 * 3) - defensa1) / aleatorio) * velocidadaño;
                    if (daño >= 200) {
                        dañofinal = daño / 6;
                    } else {
                        if (daño <= 0) {
                            dañofinal = daño * (-aleatorioDaño1);
                        }
                    }
                    vida1 = vida1 - dañofinal;
                    System.out.println("Jugador 2 le quita = " + dañofinal + " de vida al jugador 1");
                    System.out.println("Jugador 1 = defensa: " + defensa1 + " vida: " + vida1);
                    System.out.println("Jugador 2 = defensa: " + (defensa2 / 2) + " vida: " + vida2);

                } else {
                    velocidad2 = (velocidad2 / 2);
                    if (velocidad2 > 15) {
                        velocidadaño = 5;
                    } else {
                        if (velocidad2 < 15) {
                            velocidadaño = 2;
                        }
                    }
                    daño = ((ataque2 - defensa1) / aleatorio) * velocidadaño;
                    if (daño >= 200) {
                        dañofinal = daño / 6;
                    } else {
                        if (daño <= 0) {
                            dañofinal = daño * (-aleatorioDaño1);
                        }
                    }
                    vida1 = vida1 - dañofinal;
                    System.out.println("Jugador 2 le quita = " + dañofinal + " de vida al jugador 1");
                    System.out.println("Jugador 1 = defensa: " + defensa1 + " vida: " + vida1);
                    System.out.println("Jugador 2 = defensa: " + defensa2 + " vida: " + vida2);
                }
            }
        }
    }
}