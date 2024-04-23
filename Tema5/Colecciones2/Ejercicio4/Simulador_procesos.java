package Colecciones2.Ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Simulador_procesos {
    private static List<Proceso> procesos = new ArrayList<>();
    private static double duracionProceso = 0.2;
    private static int tiempoTranscurrido = 0;
    public static void main(String[] args) {
        simularProcesos();
    }
    public static void simularProcesos() {
        while(tiempoTranscurrido < 20){
            tiempoTranscurrido += 2;
            anadirProceso();
            mostrarEstado();
            for (int i = 0; i < procesos.size(); i++) {
                Proceso proceso = procesos.get(i);
                proceso.setTiempoEjecucion(duracionProceso);
                if (proceso.terminado()) {
                    procesos.remove(i);
                    i--;
                }
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
            for (Proceso proceso : procesos) {
                System.out.println(proceso);
            }
        }
    }

}

