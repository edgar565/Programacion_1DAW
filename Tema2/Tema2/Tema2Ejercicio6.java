package Tema2;

public class Tema2Ejercicio6 {

    public static void tablasMultiplicar(int num){
        while (num <= 10){
            Tema2Ejercicio5.tablaMutiplicar(num);
            num++;
        }
    }
    public static void main(String[] args){
        int num = 1;
        tablasMultiplicar(num);
    }
}
