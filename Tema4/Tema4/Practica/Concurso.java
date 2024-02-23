package Tema4.Practica;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Concurso {
    private ArrayList<Pregunta> preguntas = new ArrayList<>();
    private ArrayList<Concursante> concursantes = new ArrayList<>();
    private ArrayList<Regalo> regalos = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Pregunta[][] cuadriculaPreguntas = new Pregunta[4][4];
        int fila;
        int columna;
        while (){
            printMatrix(cuadriculaPreguntas);
            System.out.println("Elige una posición (fila y columna) para responder la pregunta:");
            System.out.print("Fila: ");
            fila = scanner.nextInt();
            System.out.print("Columna: ");
            columna = scanner.nextInt();

        }
    }
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

}