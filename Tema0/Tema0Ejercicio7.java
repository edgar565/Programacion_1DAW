import java.util.Scanner;

public class Tema0Ejercicio7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Lee la cara del dado");
        int N = in.nextInt();
        if (N < 1 || N > 6){
            System.out.println("No es un numero correcto");
        } else {
            if (N == 1) {
                System.out.println("La cara opuesta es 6");
            } else {
                if (N == 2) {
                    System.out.println("La cara opuesta es 5");
                } else {
                    if (N == 3) {
                        System.out.println("La cara opuesta es 4");
                    } else {
                        if (N == 4) {
                            System.out.println("La cara opuesta es 3");
                        } else {
                            if (N == 5){
                                System.out.println("La cara opuesta es 2");
                            } else {
                                if (N == 6){
                                    System.out.println("La cara opuesta es 1");

                                }
                            }

                        }
                    }

                }

            }
        }
    }

}