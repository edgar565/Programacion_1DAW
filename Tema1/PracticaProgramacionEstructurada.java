import java.util.Random;
import java.util.Scanner;

public class PracticaProgramacionEstructurada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Random random1 = new Random();
        int aleatorio = random1.nextInt(2, 7);
        int aleatorioDaño = random1.nextInt(-2, -1);
        int aleatorioHabilidad1 = random.nextInt(1, 3);
        int aleatorioHabilidad2 = random.nextInt(1, 3);
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
        String continuar;
        String critico;
        String regeneracion;
        int contadorRondas = 1;
        switch (tipo) {
            case 1:
                System.out.println("Dime la velocidad del primer jugador entre 1 - 200");
                velocidad1 = scanner.nextInt();
                System.out.println("Dime el ataque del primer jugador entre 1 - 200");
                ataque1 = scanner.nextInt();
                System.out.println("Dime la defensa del primer jugador entre 1 - 200");
                defensa1 = scanner.nextInt();
                System.out.println("Los puntos de vida del primer jugador son 200");
                vida1 = 200;
                System.out.println("Escoge una de estas tres habilidades: 1 FURIA, 2 AFILAR.");
                habilidad1 = scanner.nextInt();
                while ((velocidad1 + ataque1 + defensa1 + vida1 > 500) || ((velocidad1 > 200) || (velocidad1 < 1)) || ((ataque1 > 200) || (ataque1 < 1)) || ((defensa1 > 200) || (defensa1 < 1)) || ((vida1 > 200) || (vida1 < 1))) {
                    System.out.println("La suma de los valores no puede superar 500 y cada valor no puede superar 200, porfavor vuelva a intertarlo");
                    System.out.println("Dime la velocidad del primer jugador entre 1 - 200");
                    velocidad1 = scanner.nextInt();
                    System.out.println("Dime el ataque del primer jugador entre 1 - 200");
                    ataque1 = scanner.nextInt();
                    System.out.println("Dime la defensa del primer jugador entre 1 - 200");
                    defensa1 = scanner.nextInt();
                    System.out.println("Los puntos de vida del primer jugador son 200");
                    vida1 = 200;
                    System.out.println("Escoge una de estas tres habilidades: 1 FURIA, 2 AFILAR.");
                    habilidad1 = scanner.nextInt();
                }
                System.out.println("Dime la velocidad del segundo jugador entre 1 - 200");
                velocidad2 = scanner.nextInt();
                System.out.println("Dime el ataque del segundo jugador entre 1 - 200");
                ataque2 = scanner.nextInt();
                System.out.println("Dime la defensa del segundo jugador entre 1 - 200");
                defensa2 = scanner.nextInt();
                System.out.println("Los puntos de vida del segundo jugador son 200");
                vida2 = 200;
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
                    System.out.println("Los puntos de vida del segundo jugador son 200");
                    vida2 = 200;
                    System.out.println("Escoge una de estas tres habilidades: 1 FURIA, 2 DEFENSA.");
                    habilidad2 = scanner.nextInt();
                }
            case 2:
                System.out.println("PRIMER JUGADOR");
                System.out.println("\n" +
                        "───────────▄▄▄▄▄▄▄▄▄───────────\n" +
                        "────────▄█████████████▄────────\n" +
                        "█████──█████████████████──█████\n" +
                        "▐████▌─▀███▄───────▄███▀─▐████▌\n" +
                        "─█████▄──▀███▄───▄███▀──▄█████─\n" +
                        "─▐██▀███▄──▀███▄███▀──▄███▀██▌─\n" +
                        "──███▄▀███▄──▀███▀──▄███▀▄███──\n" +
                        "──▐█▄▀█▄▀███─▄─▀─▄─███▀▄█▀▄█▌──\n" +
                        "───███▄▀█▄██─██▄██─██▄█▀▄███───\n" +
                        "────▀███▄▀██─█████─██▀▄███▀────\n" +
                        "───█▄─▀█████─█████─█████▀─▄█───\n" +
                        "───███────────███────────███───\n" +
                        "───███▄────▄█─███─█▄────▄███───\n" +
                        "───█████─▄███─███─███▄─█████───\n" +
                        "───█████─████─███─████─█████───\n" +
                        "───█████─████─███─████─█████───\n" +
                        "───█████─████─███─████─█████───\n" +
                        "───█████─████▄▄▄▄▄████─█████───\n" +
                        "────▀███─█████████████─███▀────\n" +
                        "──────▀█─███─▄▄▄▄▄─███─█▀──────\n" +
                        "─────────▀█▌▐█████▌▐█▀─────────\n" +
                        "────────────███████────────────\n");
                System.out.println("El primer jugador tiene estas caracteristicas:");
                velocidad1 = aleatorioVelocidad1;
                System.out.println("La velocidad del primer jugador es de " + velocidad1);
                ataque1 = aleatorioAtaque1;
                System.out.println("El ataque del primer jugador es de " + ataque1);
                defensa1 = aleatorioDefensa1;
                System.out.println("La defensa del primer jugador es de " + defensa1);
                vida1 = 200;
                System.out.println("La vida del primer jugador es de 200");
                habilidad1 = aleatorioHabilidad1;
                System.out.println("");
                System.out.println("SEGUNDO JUGADOR");
                System.out.println("\n" +
                        "____¶¶¶¶_______________________________¶¶¶¶\n" +
                        "__¶¶¶11¶¶¶___________________________¶¶¶11¶¶¶\n" +
                        "_¶¶111111¶¶_________________________¶¶111111¶¶\n" +
                        "_¶¶111111¶¶_________________________¶¶111111¶¶\n" +
                        "__¶¶¶111¶¶___________________________¶¶1111¶¶\n" +
                        "____¶¶¶11¶¶__________________________¶¶11¶¶¶\n" +
                        "______¶¶11¶¶_______¶¶¶¶¶¶¶¶¶________¶¶11¶¶\n" +
                        "_______¶¶11¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶11¶¶\n" +
                        "________¶¶11¶¶11111111111111111111¶¶11¶¶\n" +
                        "______¶¶¶11111111111111111111111111111¶¶¶\n" +
                        "____¶¶¶1111111111111111111111111111111111¶¶\n" +
                        "___¶¶11111111111111111111111111111111111111¶¶\n" +
                        "__¶11111111111111111111111111111111111111111¶¶\n" +
                        "_¶1111111111111111111111111111111111111111111¶¶\n" +
                        "¶¶1111111111111111111111111111111111111111111¶¶\n" +
                        "¶¶11111111111111111111111111111111111111111111¶\n" +
                        "_¶11111111111¶¶¶¶¶11111111111¶¶¶¶¶11111111111¶¶\n" +
                        "_¶¶11111111111111111111111111111111111111111¶¶\n" +
                        "__¶¶¶11111111¶¶¶¶¶¶¶¶1111111¶¶¶¶¶¶¶¶1111111¶¶\n" +
                        "____¶¶11111¶¶¶¶¶¶¶_¶¶¶1111¶¶¶¶¶¶¶__¶¶1111¶¶¶\n" +
                        "_____¶¶111¶¶¶¶¶¶¶____¶¶¶¶¶¶¶¶¶¶¶¶___¶¶11¶¶\n" +
                        "_______¶11¶¶¶¶¶¶¶¶¶_¶¶¶11¶¶¶¶¶¶¶¶¶_¶¶¶1¶¶\n" +
                        "______¶¶111¶¶¶¶¶¶¶¶¶¶¶1111¶¶¶¶¶¶¶¶¶¶¶111¶\n" +
                        "_____¶¶11111¶¶¶¶¶¶¶¶11111111¶¶¶¶¶¶¶111111¶\n" +
                        "_____¶1111111111111111¶¶1¶111111111111111¶\n" +
                        "_____¶¶111111111111111¶111¶1111111111111¶¶\n" +
                        "______¶¶1111111111111111111111111111111¶¶\n" +
                        "_______¶¶11111111111111111111111111111¶¶\n" +
                        "_________¶¶¶11111111¶¶¶¶¶¶¶¶¶1111111¶¶¶\n" +
                        "___________¶¶¶¶1111111¶¶¶¶¶11111¶¶¶¶\n" +
                        "______________¶¶¶¶1111111111111¶¶¶\n" +
                        "_________________¶¶11111111111¶¶\n" +
                        "__________________¶¶¶¶¶¶¶¶¶¶¶¶¶\n");
                System.out.println("El segundo jugador tiene estas caracteristicas:");
                velocidad2 = aleatorioVelocidad2;
                System.out.println("La velocidad del segundo jugador es de " + velocidad2);
                ataque2 = aleatorioAtaque2;
                System.out.println("El ataque del segundo jugador es de " + ataque2);
                defensa2 = aleatorioDefensa2;
                System.out.println("La defensa del segundo jugador es de " + defensa2);
                vida2 = 200;
                System.out.println("La vida del segundo jugador es de 200");
                habilidad2 = aleatorioHabilidad2;
        }
        System.out.println("");
        while (vida1 > 0 && vida2 > 0) {
            System.out.println("RONDA " + contadorRondas);
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
                    aleatorio = random1.nextInt(2, 7);
                    daño = (((ataque1 * 3) - defensa2) / aleatorio) * velocidadaño;
                    if (daño <= 0) {
                        dañofinal = daño * aleatorioDaño;
                    } else {
                        if (daño >= 100) {
                            dañofinal = daño / 6;
                        } else {
                            dañofinal = daño;
                        }
                        if (vida1 > 35 && velocidad1 > 60 && ataque1 > 45) {
                            System.out.println("Quieres realizar un crítico ? Escribe SI o NO");
                            critico = scanner.next();
                            if (critico.equals("SI") || critico.equals("Si")) {
                                dañofinal = dañofinal * 2;
                            }
                        }
                        if (ataque1 > 50 && vida1 < 200) {
                            System.out.println("Quieres utilizar regeneración, perderas 50 de ataque? Escribe SI  o NO ");
                            regeneracion = scanner.next();
                            if (regeneracion.equals("SI") || regeneracion.equals("Si") || regeneracion.equals("si")) {
                                vida1 = 200;
                                ataque1 = ataque1 - 50;
                            }
                        }
                        vida2 = vida2 - (dañofinal);
                        System.out.println("La habilidad es FURIA");
                        System.out.println("Jugador 1 le quita = " + dañofinal + " de vida al jugador 2");
                        System.out.println("Jugador 1 = defensa: " + (defensa1 / 2) + " vida: " + vida1);
                        System.out.println("Jugador 2 = defensa: " + defensa2 + " vida: " + vida2);
                        System.out.println("");
                    }
                } else {
                    velocidad1 = (velocidad1 / 2);

                    if (velocidad1 > 15) {
                        velocidadaño = 5;
                    } else {
                        if (velocidad1 < 15) {
                            velocidadaño = 2;
                        }
                    }
                    aleatorio = random1.nextInt(2, 7);
                    daño = ((ataque1 - defensa2) / aleatorio) * velocidadaño;
                    if (daño <= 0) {
                        dañofinal = daño * aleatorioDaño;
                    } else {
                        if (daño >= 100) {
                            dañofinal = daño / 6;
                        } else {
                            dañofinal = daño;
                        }
                    }
                    if (vida1 > 35 && velocidad1 > 60 && ataque1 > 45) {
                        System.out.println("Quieres realizar un crítico ? Escribe SI o NO");
                        critico = scanner.next();
                        if (critico.equals("SI") || critico.equals("Si")) {
                            dañofinal = dañofinal * 2;
                        }
                    }
                    if (ataque1 > 50 && vida1 < 200) {
                        System.out.println("Quieres utilizar regeneración, perderas 50 de ataque? Escribe SI  o NO ");
                        regeneracion = scanner.next();
                        if (regeneracion.equals("SI") || regeneracion.equals("Si") || regeneracion.equals("si")) {
                            vida1 = 200;
                            ataque1 = ataque1 - 50;
                        }
                    }
                    vida2 = vida2 - (dañofinal);
                    System.out.println("La habilidad es AFILAR");
                    System.out.println("Jugador 1 le quita = " + dañofinal + " de vida al jugador 2");
                    System.out.println("Jugador 1 = defensa: " + defensa1 + " vida: " + vida1);
                    System.out.println("Jugador 2 = defensa: " + defensa2 + " vida: " + vida2);
                    System.out.println("");
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
                    }
                    aleatorio = random1.nextInt(2, 7);
                    daño = (((ataque2 * 3) - defensa1) / aleatorio) * velocidadaño;
                    if (daño <= 0) {
                        dañofinal = daño * aleatorioDaño;
                    } else {
                        if (daño >= 100) {
                            dañofinal = daño / 6;
                        } else {
                            dañofinal = daño;
                        }
                    }
                    if (vida2 > 35 && velocidad2 > 60 && ataque2 > 45) {
                        System.out.println("Quieres realizar un crítico ? Escribe SI o NO");
                        critico = scanner.next();
                        if (critico.equals("SI") || critico.equals("Si") || critico.equals("si")) {
                            dañofinal = dañofinal * 2;
                        }
                    }
                    if (ataque2 > 50 && vida2 < 200) {
                        System.out.println("Quieres utilizar regeneración, perderas 50 de ataque? Escribe SI  o NO ");
                        regeneracion = scanner.next();
                        if (regeneracion.equals("SI") || regeneracion.equals("Si") || regeneracion.equals("si")) {
                            vida2 = 200;
                            ataque2 = ataque2 - 50;
                        }
                    }
                    vida1 = vida1 - (dañofinal);
                    System.out.println("La habilidad es FURIA");
                    System.out.println("Jugador 2 le quita = " + dañofinal + " de vida al jugador 1");
                    System.out.println("Jugador 1 = defensa: " + defensa1 + " vida: " + vida1);
                    System.out.println("Jugador 2 = defensa: " + (defensa2 / 2) + " vida: " + vida2);
                    System.out.println("");
                } else {
                    velocidad2 = (velocidad2 / 2);
                    if (velocidad2 > 15) {
                        velocidadaño = 5;
                    } else {
                        if (velocidad2 < 15) {
                            velocidadaño = 2;
                        }
                    }
                    aleatorio = random1.nextInt(2, 7);
                    daño = ((ataque2 - defensa1) / aleatorio) * velocidadaño;
                    if (daño <= 0) {
                        dañofinal = daño * aleatorioDaño;
                    } else {
                        if (daño >= 100) {
                            dañofinal = daño / 6;
                        } else {
                            dañofinal = daño;
                        }
                    }
                    if (vida2 > 35 && velocidad2 > 60 && ataque2 > 45) {
                        System.out.println("Quieres realizar un crítico ? Escribe SI o NO");
                        critico = scanner.next();
                        if (critico.equals("SI") || critico.equals("Si") || critico.equals("si")) {
                            dañofinal = dañofinal * 2;
                        }
                    }
                    if (ataque2 > 50 && vida2 < 200) {
                        System.out.println("Quieres utilizar regeneración, perderas 50 de ataque? Escribe SI  o NO ");
                        regeneracion = scanner.next();
                        if (regeneracion.equals("SI") || regeneracion.equals("Si") || regeneracion.equals("si")) {
                            vida2 = 200;
                            ataque2 = ataque2 - 50;
                        }
                    }
                    vida1 = vida1 - (dañofinal);
                    System.out.println("La habilidad es AFILAR");
                    System.out.println("Jugador 2 le quita = " + dañofinal + " de vida al jugador 1");
                    System.out.println("Jugador 1 = defensa: " + defensa1 + " vida: " + vida1);
                    System.out.println("Jugador 2 = defensa: " + defensa2 + " vida: " + vida2);
                    System.out.println("");
                }

            }
            contadorRondas++;
            System.out.println("Toca cualquier caracter para continuar");
            continuar = scanner.next();
            while (vida1 > 0 && vida2 > 0) {
                System.out.println("RONDA " + contadorRondas);
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
                        aleatorio = random1.nextInt(2, 7);
                        daño = (((ataque1 * 3) - defensa2) / aleatorio) * velocidadaño;
                        if (daño <= 0) {
                            dañofinal = daño * aleatorioDaño;
                        } else {
                            if (daño >= 100) {
                                dañofinal = daño / 6;
                            } else {
                                dañofinal = daño;
                            }
                        }
                        if (vida1 > 35 && velocidad1 > 60 && ataque1 > 45) {
                            System.out.println("Quieres realizar un crítico ? Escribe SI o NO");
                            critico = scanner.next();
                            if (critico.equals("SI") || critico.equals("Si") || critico.equals("si")) {
                                dañofinal = dañofinal * 2;
                            }
                        }
                        if (ataque1 > 50 && vida1 < 200) {
                            System.out.println("Quieres utilizar regeneración, perderas 50 de ataque? Escribe SI  o NO ");
                            regeneracion = scanner.next();
                            if (regeneracion.equals("SI") || regeneracion.equals("Si") || regeneracion.equals("si")) {
                                vida1 = 200;
                                ataque1 = ataque1 - 50;
                            }
                        }
                        vida2 = vida2 - (dañofinal);
                        System.out.println("La habilidad es FURIA");
                        System.out.println("Jugador 1 le quita = " + dañofinal + " de vida al jugador 2");
                        System.out.println("Jugador 1 = defensa: " + (defensa1 / 2) + " vida: " + vida1);
                        System.out.println("Jugador 2 = defensa: " + defensa2 + " vida: " + vida2);
                        System.out.println("");
                    } else {
                        velocidad1 = (velocidad1 / 2);
                        if (velocidad1 > 15) {
                            velocidadaño = 5;
                        } else {
                            if (velocidad1 < 15) {
                                velocidadaño = 2;
                            }
                        }
                        aleatorio = random1.nextInt(2, 7);
                        daño = ((ataque1 - defensa2) / aleatorio) * velocidadaño;
                        if (daño <= 0) {
                            dañofinal = daño * aleatorioDaño;
                        } else {
                            if (daño >= 100) {
                                dañofinal = daño / 6;
                            } else {
                                dañofinal = daño;
                            }
                        }
                        if (vida1 > 35 && velocidad1 > 60 && ataque1 > 45) {
                            System.out.println("Quieres realizar un crítico ? Escribe SI o NO");
                            critico = scanner.next();
                            if (critico.equals("SI") || critico.equals("Si") || critico.equals("si")) {
                                dañofinal = dañofinal * 2;
                            }
                        }
                        if (ataque1 > 50 && vida1 < 200) {
                            System.out.println("Quieres utilizar regeneración, perderas 50 de ataque? Escribe SI  o NO ");
                            regeneracion = scanner.next();
                            if (regeneracion.equals("SI") || regeneracion.equals("Si") || regeneracion.equals("si")) {
                                vida1 = 200;
                                ataque1 = ataque1 - 50;
                            }
                        }
                        vida2 = vida2 - (dañofinal);
                        System.out.println("La habilidad es AFILAR");
                        System.out.println("Jugador 1 le quita = " + dañofinal + " de vida al jugador 2");
                        System.out.println("Jugador 1 = defensa: " + defensa1 + " vida: " + vida1);
                        System.out.println("Jugador 2 = defensa: " + defensa2 + " vida: " + vida2);
                        System.out.println("");
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
                            aleatorio = random1.nextInt(2, 7);
                            daño = (((ataque2 * 3) - defensa1) / aleatorio) * velocidadaño;
                            if (daño <= 0) {
                                dañofinal = daño * aleatorioDaño;
                            } else {
                                if (daño >= 100) {
                                    dañofinal = daño / 6;
                                } else {
                                    dañofinal = daño;
                                }
                                if (vida2 > 35 && velocidad2 > 60 && ataque2 > 45) {
                                    System.out.println("Quieres realizar un crítico ? Escribe SI o NO");
                                    critico = scanner.next();
                                    if (critico.equals("SI") || critico.equals("Si") || critico.equals("si")) {
                                        dañofinal = dañofinal * 2;
                                    }
                                }
                                if (ataque2 > 50 && vida2 < 200) {
                                    System.out.println("Quieres utilizar regeneración, perderas 50 de ataque? Escribe SI  o NO ");
                                    regeneracion = scanner.next();
                                    if (regeneracion.equals("SI") || regeneracion.equals("Si") || regeneracion.equals("si")) {
                                        vida2 = 200;
                                        ataque2 = ataque2 - 50;
                                    }
                                }
                                vida1 = vida1 - (dañofinal);
                                System.out.println("La habilidad es FURIA");
                                System.out.println("Jugador 2 le quita = " + dañofinal + " de vida al jugador 1");
                                System.out.println("Jugador 1 = defensa: " + defensa1 + " vida: " + vida1);
                                System.out.println("Jugador 2 = defensa: " + (defensa2 / 2) + " vida: " + vida2);
                                System.out.println("");
                            }
                        } else {
                            velocidad2 = (velocidad2 / 2);
                            if (velocidad2 > 15) {
                                velocidadaño = 5;
                            } else {
                                if (velocidad2 < 15) {
                                    velocidadaño = 2;
                                }
                            }
                            aleatorio = random1.nextInt(2, 7);
                            daño = ((ataque2 - defensa1) / aleatorio) * velocidadaño;
                            if (daño <= 0) {
                                dañofinal = daño * aleatorioDaño;
                            } else {
                                if (daño >= 100) {
                                    dañofinal = daño / 6;
                                } else {
                                    dañofinal = daño;
                                }
                            }
                            if (vida2 > 35 && velocidad2 > 60 && ataque2 > 45) {
                                System.out.println("Quieres realizar un crítico ? Escribe SI o NO");
                                critico = scanner.next();
                                if (critico.equals("SI") || critico.equals("Si") || critico.equals("si")) {
                                    dañofinal = dañofinal * 2;
                                }
                            }
                            if (ataque2 > 50 && vida2 < 200) {
                                System.out.println("Quieres utilizar regeneración, perderas 50 de ataque? Escribe SI  o NO ");
                                regeneracion = scanner.next();
                                if (regeneracion.equals("SI") || regeneracion.equals("Si") || regeneracion.equals("si")) {
                                    vida2 = 200;
                                    ataque2 = ataque2 - 50;
                                }
                            }
                            vida1 = vida1 - (dañofinal);
                            System.out.println("La habilidad es AFILAR");
                            System.out.println("Jugador 2 le quita = " + dañofinal + " de vida al jugador 1");
                            System.out.println("Jugador 1 = defensa: " + defensa1 + " vida: " + vida1);
                            System.out.println("Jugador 2 = defensa: " + defensa2 + " vida: " + vida2);
                            System.out.println("");
                        }
                    }
                }
                System.out.println("Toca cualquier caracter para continuar");
                continuar = scanner.next();
                contadorRondas++;
            }
            if (vida2 <= 0) {
                System.out.println("¡¡ EL JUGADOR 1 HA GANADO !!");
                System.out.println("EL JUGADOR 2 HA PERDIDO");
                System.out.println("\n" +
                        "┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼\n" +
                        "███▀▀▀██┼███▀▀▀███┼███▀█▄█▀███┼██▀▀▀\n" +
                        "██┼┼┼┼██┼██┼┼┼┼┼██┼██┼┼┼█┼┼┼██┼██┼┼┼\n" +
                        "██┼┼┼▄▄▄┼██▄▄▄▄▄██┼██┼┼┼▀┼┼┼██┼██▀▀▀\n" +
                        "██┼┼┼┼██┼██┼┼┼┼┼██┼██┼┼┼┼┼┼┼██┼██┼┼┼\n" +
                        "███▄▄▄██┼██┼┼┼┼┼██┼██┼┼┼┼┼┼┼██┼██▄▄▄\n" +
                        "┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼\n" +
                        "███▀▀▀███┼▀███┼┼██▀┼██▀▀▀┼██▀▀▀▀██▄┼\n" +
                        "██┼┼┼┼┼██┼┼┼██┼┼██┼┼██┼┼┼┼██┼┼┼┼┼██┼\n" +
                        "██┼┼┼┼┼██┼┼┼██┼┼██┼┼██▀▀▀┼██▄▄▄▄▄▀▀┼\n" +
                        "██┼┼┼┼┼██┼┼┼██┼┼█▀┼┼██┼┼┼┼██┼┼┼┼┼██┼\n" +
                        "███▄▄▄███┼┼┼─▀█▀┼┼─┼██▄▄▄┼██┼┼┼┼┼██▄\n" +
                        "┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼\n" +
                        "┼┼┼┼┼┼┼┼██┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼██┼┼┼┼┼┼┼┼┼\n" +
                        "┼┼┼┼┼┼████▄┼┼┼▄▄▄▄▄▄▄┼┼┼▄████┼┼┼┼┼┼┼\n" +
                        "┼┼┼┼┼┼┼┼┼▀▀█▄█████████▄█▀▀┼┼┼┼┼┼┼┼┼┼\n" +
                        "┼┼┼┼┼┼┼┼┼┼┼█████████████┼┼┼┼┼┼┼┼┼┼┼┼\n" +
                        "┼┼┼┼┼┼┼┼┼┼┼██▀▀▀███▀▀▀██┼┼┼┼┼┼┼┼┼┼┼┼\n" +
                        "┼┼┼┼┼┼┼┼┼┼┼██┼┼┼███┼┼┼██┼┼┼┼┼┼┼┼┼┼┼┼\n" +
                        "┼┼┼┼┼┼┼┼┼┼┼█████▀▄▀█████┼┼┼┼┼┼┼┼┼┼┼┼\n" +
                        "┼┼┼┼┼┼┼┼┼┼┼┼███████████┼┼┼┼┼┼┼┼┼┼┼┼┼\n" +
                        "┼┼┼┼┼┼┼┼▄▄▄██┼┼█▀█▀█┼┼██▄▄▄┼┼┼┼┼┼┼┼┼\n" +
                        "┼┼┼┼┼┼┼┼▀▀██┼┼┼┼┼┼┼┼┼┼┼██▀▀┼┼┼┼┼┼┼┼┼\n" +
                        "┼┼┼┼┼┼┼┼┼┼▀▀┼┼┼┼┼┼┼┼┼┼┼▀▀┼┼┼┼┼┼┼┼┼┼┼\n" +
                        "┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼\n");
            } else if (vida1 <= 0) {
                System.out.println("¡¡ EL JUGADOR 2 HA GANADO !!");
                System.out.println("EL JUGADOR 1 HA PERDIDO");
                System.out.println("\n" +
                        "┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼\n" +
                        "███▀▀▀██┼███▀▀▀███┼███▀█▄█▀███┼██▀▀▀\n" +
                        "██┼┼┼┼██┼██┼┼┼┼┼██┼██┼┼┼█┼┼┼██┼██┼┼┼\n" +
                        "██┼┼┼▄▄▄┼██▄▄▄▄▄██┼██┼┼┼▀┼┼┼██┼██▀▀▀\n" +
                        "██┼┼┼┼██┼██┼┼┼┼┼██┼██┼┼┼┼┼┼┼██┼██┼┼┼\n" +
                        "███▄▄▄██┼██┼┼┼┼┼██┼██┼┼┼┼┼┼┼██┼██▄▄▄\n" +
                        "┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼\n" +
                        "███▀▀▀███┼▀███┼┼██▀┼██▀▀▀┼██▀▀▀▀██▄┼\n" +
                        "██┼┼┼┼┼██┼┼┼██┼┼██┼┼██┼┼┼┼██┼┼┼┼┼██┼\n" +
                        "██┼┼┼┼┼██┼┼┼██┼┼██┼┼██▀▀▀┼██▄▄▄▄▄▀▀┼\n" +
                        "██┼┼┼┼┼██┼┼┼██┼┼█▀┼┼██┼┼┼┼██┼┼┼┼┼██┼\n" +
                        "███▄▄▄███┼┼┼─▀█▀┼┼─┼██▄▄▄┼██┼┼┼┼┼██▄\n" +
                        "┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼\n" +
                        "┼┼┼┼┼┼┼┼██┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼██┼┼┼┼┼┼┼┼┼\n" +
                        "┼┼┼┼┼┼████▄┼┼┼▄▄▄▄▄▄▄┼┼┼▄████┼┼┼┼┼┼┼\n" +
                        "┼┼┼┼┼┼┼┼┼▀▀█▄█████████▄█▀▀┼┼┼┼┼┼┼┼┼┼\n" +
                        "┼┼┼┼┼┼┼┼┼┼┼█████████████┼┼┼┼┼┼┼┼┼┼┼┼\n" +
                        "┼┼┼┼┼┼┼┼┼┼┼██▀▀▀███▀▀▀██┼┼┼┼┼┼┼┼┼┼┼┼\n" +
                        "┼┼┼┼┼┼┼┼┼┼┼██┼┼┼███┼┼┼██┼┼┼┼┼┼┼┼┼┼┼┼\n" +
                        "┼┼┼┼┼┼┼┼┼┼┼█████▀▄▀█████┼┼┼┼┼┼┼┼┼┼┼┼\n" +
                        "┼┼┼┼┼┼┼┼┼┼┼┼███████████┼┼┼┼┼┼┼┼┼┼┼┼┼\n" +
                        "┼┼┼┼┼┼┼┼▄▄▄██┼┼█▀█▀█┼┼██▄▄▄┼┼┼┼┼┼┼┼┼\n" +
                        "┼┼┼┼┼┼┼┼▀▀██┼┼┼┼┼┼┼┼┼┼┼██▀▀┼┼┼┼┼┼┼┼┼\n" +
                        "┼┼┼┼┼┼┼┼┼┼▀▀┼┼┼┼┼┼┼┼┼┼┼▀▀┼┼┼┼┼┼┼┼┼┼┼\n" +
                        "┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼\n");
            }
        }
    }
}
