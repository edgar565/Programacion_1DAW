package Tema4;

import java.util.Scanner;

public class pruebaPersona {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Dime tu nombre: ");
      String nombre1 = scanner.nextLine();
      System.out.print("Dime tus apellidos: ");
      String apellidos1 = scanner.nextLine();
      System.out.print("Dime tu edad: ");
      int edad1 = scanner.nextInt();
      scanner.nextLine();
      System.out.print("Dime tu DNI: ");
      String DNI1 = scanner.next();
      Persona persona1 = new Persona(DNI1,nombre1,apellidos1,edad1);
      System.out.println("Nombre: " + persona1.getNombre());
      System.out.println("Apellidos: " + persona1.getApellidos());
      System.out.println("Edad: " + persona1.getEdad());
      System.out.println("DNI: " + persona1.getDNI());
      if (persona1.isAdult(edad1)) {
          System.out.println(persona1.getNombre() + " es mayor de edad");
      } else {
          System.out.println(persona1.getNombre() + " no es mayor de edad");
      }
      if (persona1.isRetired(edad1)) {
            System.out.println(persona1.getNombre() + " si está retirado");
      } else {
            System.out.println(persona1.getNombre() + " no está retirado");
      }
      if (Persona.checkDNI(DNI1)) {
          System.out.println("El DNI: " + persona1.getDNI() + " es correcto");
      } else {
          System.out.println("El DNI: " + persona1.getDNI() + " no es correcto");
      }
      System.out.print("Dime tu nombre: ");
      String nombre2 = scanner.nextLine();
      System.out.print("Dime tus apellidos: ");
      String apellidos2 = scanner.nextLine();
      System.out.print("Dime tu edad: ");
      int edad2 = scanner.nextInt();
      scanner.nextLine();
      System.out.println("Dime tu DNI: ");
      String DNI2 = scanner.next();
      Persona persona2 = new Persona(DNI2,nombre2,apellidos2,edad2);
      System.out.println("Nombre: " + persona2.getNombre());
      System.out.println("Apellidos: " + persona2.getApellidos());
      System.out.println("Edad: " + persona2.getEdad());
      System.out.println("DNI: " + persona2.getDNI());
        if (persona2.isAdult(edad2)) {
            System.out.println(persona2.getNombre() + " es mayor de edad");
        } else {
            System.out.println(persona2.getNombre() + " no es mayor de edad");
        }
        if (persona2.isRetired(edad2)) {
            System.out.println(persona2.getNombre() + " si está retirado");
        } else {
            System.out.println(persona2.getNombre() + " no está retirado");
        }
        if (Persona.checkDNI(DNI2)) {
            System.out.println("El DNI: " + persona2.getDNI() + " es correcto");
        } else {
            System.out.println("El DNI: " + persona2.getDNI() + " no es correcto");
        }
    }
}