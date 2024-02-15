package Tema4.Polimorfismo.EJ1;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
public class ITV {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Random random = new Random();
        int tipoVehiculo = 1;
        ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
        while (tipoVehiculo != 0){
            tipoVehiculo = random.nextInt(0,3);
            int[] matricula = new int[4];
            for (int x = 0; x < 4; x++){
                matricula[x] = random.nextInt(0,9);
            }
            char[] letraMatricula = new char[3];
            for (int i = 0; i < 3; i++) {
                letraMatricula[i] = (char) (random.nextInt(26) + 'A');
            }
            MomentoEntrada fecha = momentoEntrada();
            Vehiculo nuevo = null;
            switch (tipoVehiculo){
                case 1:
                    System.out.println("### Creando la ficha del TURISMO ###");
                    nuevo = new Turismo(letraMatricula, matricula, fecha);
                    break;
                case 2:
                    System.out.println("### Creando la ficha del CAMION ###");
                    nuevo =new Camion(letraMatricula, matricula, fecha);
                    break;
                case 3:
                    System.out.println("### Creando la ficha del CICLOMOTOR ###");
                    nuevo = new Ciclomotor(letraMatricula, matricula, fecha);
                    break;
            }
            vehiculos.add(nuevo);
        }
        for(Vehiculo v: vehiculos) {
            System.out.println(v);
        }
    }
    public static MomentoEntrada momentoEntrada(){

        System.out.println("Porfavor introduce la fecha actual");
        System.out.print("Dia: ");
        int dia = scanner.nextInt();
        System.out.print("Mes: ");
        int mes = scanner.nextInt();
        System.out.print("Año: ");
        int año = scanner.nextInt();
        System.out.print("Hora: ");
        int hora = scanner.nextInt();
        System.out.print("Minuto: ");
        int minuto = scanner.nextInt();
        MomentoEntrada momentoEntrada = new MomentoEntrada(dia,mes,año,hora,minuto);
        return momentoEntrada;
    }
}