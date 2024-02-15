package Tema4.Polimorfismo.EJ1;
import Tema4.Polimorfismo.EJ2.Avion;
import Tema4.Polimorfismo.EJ2.Barco;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class ITV {
    public static void main(String[] args) {
        Random random = new Random();
        int tipoVehiculo = 1;
        ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
        int numPista = 0;
        int numCanal = 0;
        int[] arrayMatricula;
        char[] arrayLetraMatricula;
        while (tipoVehiculo != 0){
            tipoVehiculo = random.nextInt(1,3);
             arrayMatricula = new int[4];
            for (int x = 0; x < 4; x++){
                arrayMatricula[x] = random.nextInt(0,9);
            }
            int matricula = arrayAInt(arrayMatricula);
            arrayLetraMatricula = new char[3];
            for (int i = 0; i < 3; i++) {
                arrayLetraMatricula[i] = (char) (random.nextInt(26) + 'A');
            }
            String letraMatricula = new String(arrayLetraMatricula);
            Date fechaHoraActual = new Date();
            Vehiculo nuevo = null;
            switch (tipoVehiculo){
                case 1:
                    System.out.println("### Creando la ficha del TURISMO ###");
                    nuevo = new Turismo(letraMatricula, matricula, fechaHoraActual);
                    break;
                case 2:
                    System.out.println("### Creando la ficha del CAMION ###");
                    nuevo =new Camion(letraMatricula, matricula, fechaHoraActual);
                    break;
                case 3:
                    System.out.println("### Creando la ficha del CICLOMOTOR ###");
                    nuevo = new Ciclomotor(letraMatricula, matricula, fechaHoraActual);
                    break;
                case 4:
                    System.out.println("### Creando la ficha del AVION ###");
                    String pistaAterrizaje = "P" + numPista;
                    nuevo = new Avion(letraMatricula, matricula, fechaHoraActual, pistaAterrizaje);
                    numPista++;
                    break;
                case 5:
                    System.out.println("### Creando la ficha del BARCO ###");
                    String canal = "C" + numCanal;
                    nuevo = new Barco(letraMatricula, matricula, fechaHoraActual, canal);
                    numCanal++;
                    break;
            }
            vehiculos.add(nuevo);
        }
        for(Vehiculo v: vehiculos) {
            System.out.println(v);
        }
    }
    public static int arrayAInt(int[] array) {
        int numero = 0;
        for (int i = 0; i < array.length; i++) {
            numero = numero * 10 + array[i];
        }
        return numero;
    }
}