import java.util.Scanner;

public class Tema1Ejercicio16 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce 'D' para convertir de euros a dólares o 'E' para convertir de dólares a euros (o 'Q' para salir): ");
        String C = in.nextLine();
        if ("D".equals(C)){
            System.out.println("Dime los euros que quieres convertir a dolares");
            double euros = in.nextDouble();
            System.out.println(euros + " euros " + " son " + (euros * 1.06F) + "dolares");
        } else {
            if ("E".equals(C)){
                System.out.println("Dime los dolares que quieres convertir a euros");
                double dolares = in.nextDouble();
                System.out.println(dolares + " dolares "+ " son " + (dolares * 1.06F) + "euros");
            }
        }
    }
}
