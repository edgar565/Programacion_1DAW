package Tema4;

import java.util.Scanner;
import java.util.Random;

public class PruebaCuentas {
    public static Persona2[] arrayPersonas = new Persona2[10];
    public static int personas = 0;
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(numeroCuenta());
        //menu();
    }
    public static void menu(){
        int opcion;
        do {
            do {
                System.out.println("\n 1. Instanciar objetos de tipo Persona" +
                        "\n 2. Instanciar objetos de tipo Cuenta y asociarlo a una persona" +
                        "\n 3. Mostrar datos de una persona (por su dni)" +
                        "\n 4. Recibir la nómina mensual de una persona (por dni y núm de cuenta)" +
                        "\n 5. Recibir un pago (por dni y núm de cuenta)" +
                        "\n 6. Realizar transferencia entre cuentas" +
                        "\n 7. Imprimir las personas morosas");
                opcion = scanner.nextInt();
            } while (opcion <= 7 && opcion >= 1);
            switch (opcion) {
                case 1:
                    crearPersonas();
                    break;
                case 2:
                    crearCuenta();
                    break;
                case 3:
                    mostrarDatos();
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
            }
        }while (opcion != 55);
    }
    public static void crearPersonas(){
        System.out.println("Porfavor introduce un DNI");
        String DNI = scanner.next();
        Persona2 persona = new Persona2(DNI);
        for (int x = personas; x < arrayPersonas.length; x++){
            arrayPersonas[x] = persona;
        }
        personas++;
    }
    public static void crearCuenta(){
        System.out.println("Porfavor introduce un DNI");
        String DNI = scanner.next();
        Persona2 person = new Persona2(DNI);
        for (int x = 0; x < arrayPersonas.length; x++){
            if (arrayPersonas[x].getDNI().equals(person.getDNI())){
               Cuenta cuenta = new Cuenta(numeroCuenta());
               person.añadirCuentas(cuenta);
            }
        }
    }
    public static String numeroCuenta(){
        StringBuilder numero = new StringBuilder();
        Random random = new Random();
        for(int x = 0; x < 20; x++){
            numero.append(random.nextInt(10));
        }
        return "ES" + numero;
    }
    public static void mostrarDatos(){
        System.out.println("Introduce el DNI");
        String DNI = scanner.next();
        Persona2 person = new Persona2(DNI);
        System.out.println("La persona con DNI" + DNI);
        System.out.println("Tiene " + person.numCuentas + " cuentas" );
        for (int x = 0; x < person.numCuentas; x++) {
            String cuenta = String.valueOf(person.cuentasBancarias[x]);
            int saldo = person.cuentasBancarias[x].getSaldo();
            if (saldo < 0){
                person.morosa();
            } else {
                System.out.println("En la cuenta: " + cuenta + " hay un saldo de: " + saldo);
            }
        }

    }
}
