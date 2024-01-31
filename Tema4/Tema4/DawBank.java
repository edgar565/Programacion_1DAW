package Tema4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DawBank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        int opcionCliente;
        CuentaBancaria cuenta = new CuentaBancaria();
        do {
            System.out.println("Menú Principal:");
            System.out.println("1. Hacerte cliente");
            System.out.println("2. Acceder cliente");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            if (opcion == 1) {
                System.out.println("\nPorfavor rellene los siguientes datos para crear la cuenta:\n");
                System.out.print("Ingrese el titular de la cuenta: ");
                String titular = scanner.nextLine();
                System.out.print("Ingrese el dni del titular de la cuenta:");
                String dni = scanner.nextLine();
                System.out.println(" ### PORFAVOR ESPERE ###");
                String iban = numeroCuenta();
                cuenta = new CuentaBancaria(iban, titular, dni);
                System.out.println("La cuenta ha sido creada correctamente");
            }
            if (opcion != 55) {
                System.out.print("\nIngrese el titular de la cuenta: ");
                String titular = scanner.nextLine();
                System.out.print("Ingrese el dni del titular de la cuenta:");
                String dni = scanner.nextLine();
                System.out.println("\n ### PORFAVOR ESPERE ###");
                String iban = numeroCuenta();
                cuenta = new CuentaBancaria(iban, titular, dni);
                do {
                    System.out.println("\nMenú Principal:");
                    System.out.println("1. Datos de la cuenta");
                    System.out.println("2. IBAN");
                    System.out.println("3. Titular");
                    System.out.println("4. Saldo");
                    System.out.println("5. Ingreso");
                    System.out.println("6. Retirada");
                    System.out.println("7. Movimientos");
                    System.out.println("8. Salir");
                    System.out.print("Seleccione una opción: ");
                    opcionCliente = scanner.nextInt();
                    switch (opcionCliente) {
                        case 1:
                            mostrarDatosCuenta(cuenta);
                            break;
                        case 2:
                            mostrarIban(cuenta);
                            break;
                        case 3:
                            mostrarTitular(cuenta);
                            break;
                        case 4:
                            mostrarSaldo(cuenta);
                            break;
                        case 5:
                            realizarIngreso(cuenta);
                            break;
                        case 6:
                            realizarRetirada(cuenta);
                            break;
                        case 7:
                            mostrarMovimientos(cuenta);
                            break;
                        case 8:
                            System.out.println("¡Hasta luego!\n");
                            break;
                        default:
                            System.out.println("Error: Opción no válida. Intente nuevamente.\n");
                    }
                } while (opcionCliente != 8);
            }
        } while (opcion != 55);
    }

    private static void mostrarDatosCuenta(CuentaBancaria cuenta) {
        System.out.println(cuenta);
    }

    public static void mostrarIban(CuentaBancaria cuenta) {
        System.out.println("\nIBAN: " + cuenta.getIban());
        System.out.println();
    }

    public static void mostrarTitular(CuentaBancaria cuenta) {
        System.out.println("\nTITULAR: " + cuenta.getTitular());
        System.out.println();
    }

    public static void mostrarSaldo(CuentaBancaria cuenta) {
        System.out.println("\nSALDO: " + cuenta.getSaldo() + " euros");
        System.out.println();
    }

    public static void realizarIngreso(CuentaBancaria cuenta) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nINGRESE LA CANTIDAD A INGRESAR: ");
        double cantidad = scanner.nextDouble();
        cuenta.realizarIngreso(cantidad);
        System.out.println();
    }

    public static void realizarRetirada(CuentaBancaria cuenta) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nINGRESE LA CANTIDAD A RETIRAR: ");
        double cantidad = scanner.nextDouble();
        cuenta.realizarRetirada(cantidad);
        System.out.println();
    }

    public static void mostrarMovimientos(CuentaBancaria cuenta) {
        System.out.println("\nMOVIMIENTOS:");
        for (int i = 0; i < cuenta.contadorMovimientos; i++) {
            double movimiento = cuenta.getMovimientos()[i];
            System.out.println(movimiento);
        }
    }

    public static String numeroCuenta() {
        StringBuilder numero = new StringBuilder();
        Random random = new Random();
        for (int x = 0; x < 22; x++) {
            numero.append(random.nextInt(10));
        }
        return "ES" + numero;
    }
}