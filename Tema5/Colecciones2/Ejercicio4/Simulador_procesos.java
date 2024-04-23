package Colecciones2.Ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Simulador_procesos {
    private static List<Proceso> procesos = new ArrayList<>();
    private static double segundos = 2;
    private static double duracionProceso = 0.2;
    private static int tiempoTranscurrido = 0;
    public static void main(String[] args) {
        simularProcesos();
    }
    public static void simularProcesos() {
        while(tiempoTranscurrido < 20){
            tiempoTranscurrido =+ 2;
            for (int i = 0; i < 3; i++){
                anadirProceso();
            }
            mostrarEstado();
            if (!procesos.get(1).terminado()){
                procesos.get(1).setTiempoEjecucion();
                int numero = procesos.size();
                String nombreNuevo = "p" + numero;
                double tiempo = procesos.get(1).getTiempoEjecucion();
                procesos.remove(1);
                Proceso proceso = new Proceso(tiempo, nombreNuevo);
                procesos.add(proceso);
            }else {
                procesos.remove(1);
                procesos.get(2).setTiempoEjecucion();
                int numero = procesos.size();
                String nombreNuevo = "p" + numero;
                double tiempo = procesos.get(2).getTiempoEjecucion();
                procesos.remove(2);
                Proceso proceso = new Proceso(tiempo, nombreNuevo);
                procesos.add(proceso);
            }

        }
    }
    private static void anadirProceso() {
        Proceso proceso = new Proceso();
        procesos.add(proceso);
    }
    private static void mostrarEstado() {
        if (procesos.isEmpty()) {
            System.out.println("No hay procesos.");
        } else {
            System.out.println("Estado de los procesos:");
            for (int i = 0; i < procesos.size(); i++) {
                System.out.println("Proceso " + procesos.get(i).toString());
            }
        }
    }

}