import java.util.Scanner;

public class Tema1Ejercicio24 {

    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Introduce las notas");
        double nota = 0;
        double suspensos = 0;
        double aprobados = 0;
        while (nota >= 0 && nota <= 10) {
            System.out.println("Dime una nota");
            nota = scanner.nextDouble();
            switch ((int) nota) {
                case 0, 1, 2, 3, 4:
                    suspensos++;
            }
            switch ((int) nota) {
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    aprobados++;
            }
            if (nota <= -1) {
                break;
            }
        }

        System.out.println("Hay " + suspensos + " suspendidos");
        System.out.println("Hay " + aprobados + " aprobados");
    }
}