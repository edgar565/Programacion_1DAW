package Tema4;
public class Cuenta {
    private String numeroCuenta;
    private int saldo;

    public Cuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public int getSaldo() {
        return saldo;
    }
    public void setSaldo(int saldo) {
        this.saldo += saldo;
    }

    public void recibirAbonos(int abono){
        saldo = saldo + abono;
    }
    public void pagarRecibos(int recibo){
        saldo = saldo - recibo;
    }
}