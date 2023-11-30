package Tema3;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class BuscaminasArray {
    public static void main(String[] args) {
        Random random = new Random();
        String[] tablero = new String[]{"0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"};
        for (int i = 1; i < 6; i++){
            int x = random.nextInt(0,19);
            tablero[x] = "*";
            if (Objects.equals(tablero[x], "*")){
                x = random.nextInt(0, 19);
                tablero[x] = "*";
            }
        }
        for (int i = 1; i < 19 ;i++){
            if (tablero[i].equals("*")){
                tablero[i - 1] = "1";
                tablero[i + 1] = "1";
            }
        }
        for (int i = 2; i < 17; i++){
            if (tablero[i].equals("*") && tablero[i - 2].equals("*")){
                tablero[i - 1] = "2";
            } else if (tablero[i].equals("*") && tablero[i + 2].equals("*") ){
                tablero[i + 1] = "2";
            }
        }
        if (tablero[0].equals("*") && tablero[19].equals("*")){
            tablero[1] = "1";
            tablero[18] = "1";
        }
        System.out.println(Arrays.toString(tablero));
    }
}