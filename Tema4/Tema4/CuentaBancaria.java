package Tema4;
import java.sql.Array;
import java.util.ArrayList;

public class CuentaBancaria {
    private final String iban;
    private String titular;
    private String dni;
    private double saldo;
    private String[] movimientos;
    public CuentaBancaria() {
        iban = "ES0000000000000000000000";
        titular = "LibreCoders";
        dni = "000000000A";
        movimientos = null;

    }
    public CuentaBancaria(String iban, String titular, String dni) {
        this.iban = iban;
        this.titular = titular;
        this.dni = dni;
        this.saldo = 0;
        this.movimientos = new String[100];
    }
    public String getIban() {
        return iban;
    }
    public String getTitular() {
        return titular;
    }
    public String getDni() {
        return dni;
    }
    public double getSaldo() {
        return saldo;
    }
    public String[] getMovimientos() {
        return movimientos;
    }
    public void realizarIngreso(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            int contadorMovimientos = 0;
            movimientos.add = String.valueOf(cantidad);
            if (saldo > -50 && saldo < 0) {
                System.out.println("AVISO: Saldo negativo");
            }
            if (cantidad > 3000) {
                System.out.println("AVISO: Notificar a hacienda");
            }
        } else {
            System.out.println("Error: La cantidad a ingresar debe ser mayor que cero.");
        }
    }
    public void realizarRetirada(double cantidad) {
        if (cantidad > 0) {
            if (saldo - cantidad >= -50) {
                saldo -= cantidad;
                movimientos.add(-cantidad);
                if (saldo > -50 && saldo < 0) {
                    System.out.println("AVISO: Saldo negativo");
                }
                if (cantidad > 3000) {
                    System.out.println("AVISO: Notificar a hacienda");
                }
            } else {
                System.out.println("Error: Saldo insuficiente para realizar la retirada.");
            }
        } else {
            System.out.println("Error: La cantidad a retirar debe ser mayor que cero.");
        }
    }
}