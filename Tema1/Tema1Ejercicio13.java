import java.util.Scanner;

public class Tema1Ejercicio13 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dime la hora");
        int H = in.nextInt();
        System.out.println("Dime los minutos");
        int M = in.nextInt();
        System.out.println("Dime los segundos");
        int S = in.nextInt();
        S++;
        if (S == 60){
            S = 00;
            M++;
        }
        if (M == 60){
            M = 00;
            H++;
        }
        if (H == 23){
            H = 00;
        }
        System.out.println(H + ":" + M + ":" + S);
    }
}