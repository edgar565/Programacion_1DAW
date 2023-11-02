package Tema2;

public class Utils {
    public static double miles2kilometers(double millas){
        double result;
        result = millas * 1.60934;
        return result;
    }
    public static double getTaxes(double euros, double impuesto){
        double result ;
        result = (euros * impuesto) / 100;
        result = Math.round(result * 100) / 100.0;
        return result;
    }
    public static double getNetPrice(double euros, double impuesto){
        double importe;
        if (impuesto != 0) {
            importe = (euros * impuesto) / 100;
            importe = Math.round((euros + importe) * 100) / 100.0;
        } else {
            importe = 1;
        }

        return importe;
    }
    public static int getCoins(double euros){
        int moneda2euros = 0;
        int moneda1euro = 0;
        int moneda50cent = 0;
        int moneda20cent = 0;
        int moneda10cent = 0;
        int moneda5cent = 0;
        int moneda2cent = 0;
        int moneda1cent = 0;
        while (euros > 0.009) {
            if (euros >= 2) {
                moneda2euros++;
                euros = euros - 2;
            } else if (euros >= 1) {
                moneda1euro++;
                euros = euros - 1;
            } else if (euros >= 0.50) {
                moneda50cent++;
                euros = euros - 0.50;
            }else if (euros >= 0.20) {
                moneda20cent++;
                euros = euros - 0.20;
            }else if (euros >= 0.10) {
                moneda10cent++;
                euros = euros - 0.10;
            }else if (euros >= 0.05) {
                moneda5cent++;
                euros = euros - 0.05;
            }else if (euros >= 0.02) {
                moneda2cent++;
                euros = euros - 0.02;
            } else {
                moneda1cent++;
                euros = euros - 0.01;
            }
        }
            return (moneda2euros * 10000000) + (moneda1euro * 1000000) + (moneda50cent * 100000) + (moneda20cent * 10000) + (moneda10cent * 1000) + (moneda5cent * 100) + (moneda2cent * 10) + (moneda1cent);
    }
    public  static char getNIF(int DNI){
        int result = DNI % 23;
        char letra = 0;
        switch (result){
            case 0:
                letra = 'T';
                break;
            case 1:
                letra = 'R';
                break;
            case 2:
                letra = 'W';
                break;
            case 3:
                letra = 'A';
                break;
            case 4:
                letra = 'G';
                break;
            case 5:
                letra = 'M';
                break;
            case 6:
                letra = 'Y';
                break;
            case 7:
                letra = 'F';
                break;
            case 8:
                letra = 'P';
                break;
            case 9:
                letra = 'D';
                break;
            case 10:
                letra = 'X';
                break;
            case 11:
                letra = 'B';
                break;
            case 12:
                letra = 'N';
                break;
            case 13:
                letra = 'J';
                break;
            case 14:
                letra = 'Z';
                break;
            case 15:
                letra = 'S';
                break;
            case 16:
                letra = 'Q';
                break;
            case 17:
                letra = 'V';
                break;
            case 18:
                letra = 'H';
                break;
            case 19:
                letra = 'L';
                break;
            case 20:
                letra = 'C';
                break;
            case 21:
                letra = 'K';
                break;
            case 22:
                letra = 'E';
                break;
        }
        return letra;
    }
    public static boolean isValidNIF(int DNI, char letra){
        boolean isValid = false;
        letra = Character.toUpperCase(letra);
        if (getNIF(DNI) == letra){
            isValid = true;
        }
        return isValid;
    }
}