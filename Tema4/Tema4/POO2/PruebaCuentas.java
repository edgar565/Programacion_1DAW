package Tema4.POO2;

import java.util.Scanner;
import java.util.Random;

public class PruebaCuentas {
    public static Persona2[] arrayPersonas = new Persona2[10];
    public static int personas = 0;
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        int opcion;
        do {
            do {
                System.out.println("\n 1. Instanciar objetos de tipo Persona" +
                        "\n 2. Instanciar objetos de tipo Cuenta y asociarlo a una persona" +
                        "\n 3. Mostrar datos de una persona (por su DNI)" +
                        "\n 4. Recibir la nómina mensual de una persona (por dni y núm de cuenta)" +
                        "\n 5. Recibir un pago (por dni y núm de cuenta)" +
                        "\n 6. Realizar transferencia entre cuentas" +
                        "\n 7. Imprimir las personas morosas");
                opcion = scanner.nextInt();
            } while (opcion > 7 && opcion < 1);
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
                    ingresarNomina();
                    break;
                case 5:
                    recibirPago();
                    break;
                case 6:
                    transferencias();
                    break;
                case 7:
                    personasMorosas();
                    break;
            }
        }while (opcion != 55);
    }
    public static void crearPersonas(){
        Persona2 persona = leerDni();
        for (int x = personas; x < arrayPersonas.length; x++){
            arrayPersonas[x] = persona;
        }
        personas++;
    }
    public static void crearCuenta(){
        Persona2 person = leerDni();
            if (person.getDNI().equals(person.getDNI())){
               Cuenta cuenta = new Cuenta(numeroCuenta());
               person.añadirCuentas(cuenta);
                System.out.println("Cuenta creada correctamente:\n" +
                        "DNI asociado: " + person.getDNI() + "\n" +
                        "Número de cuenta: " + numeroCuenta());
            }
    }
    public static String numeroCuenta(){
        StringBuilder numero = new StringBuilder();
        Random random = new Random();
        for(int x = 0; x < 22; x++){
            numero.append(random.nextInt(10));
        }
        return "ES" + numero;
    }
    public static void mostrarDatos(){
        Persona2 person = leerDni();
        System.out.println("La persona con DNI: " + person.getDNI());
        System.out.println("Tiene " + person.getNumCuentas() + " cuentas" );
        for (int x = 0; x < person.numCuentas; x++) {
            String cuenta = String.valueOf(person.cuentasBancarias[x]);
            int saldo = person.cuentasBancarias[x].getSaldo();
            if (saldo < 0){
                System.out.println("Tienes " + person.morosa() + " cuentas en negativo");
                System.out.println("En la cuenta: " + cuenta + " hay un saldo de: " + saldo);
            } else {
                System.out.println("En la cuenta: " + cuenta + " hay un saldo de: " + saldo);
            }
        }
    }
    public static void ingresarNomina(){
        Persona2 person = leerPersona();
        System.out.println("Elige la cuenta para ingresar la nomina");
        int cuentaNomina = scanner.nextInt();
        System.out.println("Cual es el importe a ingresar");
        int importe = scanner.nextInt();
        person.cuentasBancarias[cuentaNomina].recibirAbonos(importe);
    }
    public static void recibirPago(){
        Persona2 person = leerPersona();
        System.out.println("Elige la cuenta para ingresar la nomina");
        int cuentaNomina = scanner.nextInt();
        System.out.println("Cual es el importe a ingresar");
        int importe = scanner.nextInt();
        person.cuentasBancarias[cuentaNomina].pagarRecibos(importe);
    }
    public static void transferencias(){
        System.out.println("REALIZAR TRANSFERENCIA");
        System.out.println("Introduce los datos de la persona de origen");
        Persona2 person = leerPersona();
        System.out.println("Introduce los datos de la persona de destino");
        Persona2 persona2 = leerPersona();
        System.out.println("Elige la cuenta de origen");
        int cuentaOrigen = scanner.nextInt();
        System.out.println("Introduce la cuenta de destino");
        int cuentaDestino = scanner.nextInt();
        System.out.println("Cual es el importe a transferir");
        int importe = scanner.nextInt();
        persona2.cuentasBancarias[cuentaDestino].setSaldo(persona2.cuentasBancarias[cuentaDestino].getSaldo() + importe);
        person.cuentasBancarias[cuentaOrigen].setSaldo(person.cuentasBancarias[cuentaOrigen].getSaldo() + importe);
        System.out.println("Numero de cuenta: " + person.cuentasBancarias[cuentaOrigen].getNumeroCuenta() + " Saldo: " + person.cuentasBancarias[cuentaOrigen].getSaldo());
    }
    public static void personasMorosas(){
        System.out.println("Personas morosas");
        for (int x = 0; x < arrayPersonas.length; x++){
            if (arrayPersonas[x].cuentasBancarias[x].getSaldo() < 0){
                System.out.println(arrayPersonas[x].getDNI());
            }
        }
    }
    public static Persona2 leerDni(){
        System.out.println("Introduce el DNI");
        String DNI = scanner.next();
        Persona2 person = new Persona2(DNI);
        return person;
    }
    public static Persona2 leerPersona(){
        System.out.println("Introduce el DNI");
        String DNI = scanner.next();
        Persona2 person = new Persona2(DNI);
        System.out.println("Cuentas associadas: ");
        for (int x = 0; x < person.numCuentas; x++ ){
            String cuenta = String.valueOf(person.cuentasBancarias[x]);
            System.out.println(x + 1 + ". Cuenta " + cuenta + " hay un saldo: " + person.cuentasBancarias[x].getSaldo());
        }
        return person;
    }
}