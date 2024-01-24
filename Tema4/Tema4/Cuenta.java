package Tema4;
public class Cuenta {
    private String numeroCuenta;
    private int saldo;

    public Cuenta(String numeroCuenta, int saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public int getSaldo() {
        return saldo;
    }
    public void recibirAbonos(int abono){
        saldo = saldo + abono;
    }
    public void pagarRecibos(int recibo){
        saldo = saldo - recibo;
    }
}