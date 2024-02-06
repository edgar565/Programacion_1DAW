package Tema4.POO2;

public class Persona2 {
    private String DNI;
    public Cuenta[] cuentasBancarias;
    public int numCuentas;

    public Persona2(String DNI) {
        this.DNI = DNI;
        this.cuentasBancarias = new Cuenta[3];
        this.numCuentas = 0;
    }

    public String getDNI() {
        return DNI;
    }

    public Cuenta[] getCuentasBancarias() {
        return cuentasBancarias;
    }

    public int getNumCuentas() {
        return numCuentas;
    }

    public int morosa() {
        int cuentasNegativo = 0;
        for (int x = 0; x < cuentasBancarias.length; x++) {
            if (cuentasBancarias[x].getSaldo() < 0) {
                cuentasNegativo++;
            }
        }
        return cuentasNegativo;
    }
    public boolean añadirCuentas(Cuenta cuenta) {
        boolean añadida = false;
        if (numCuentas < 3) {
            cuentasBancarias[numCuentas] = cuenta;
            numCuentas++;
            añadida =true;
        }
        return añadida;
    }
}