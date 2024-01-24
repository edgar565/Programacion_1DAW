package Tema4;

public class Persona2 {
    private String DNI;
    private Cuenta[] cuentasBancarias;
        public Persona2(String DNI, Cuenta[] cuentasBancarias) {
        this.DNI = DNI;
        this.cuentasBancarias = cuentasBancarias;
    }
    public String getDNI() {
        return DNI;
    }
    public Cuenta[] getCuentasBancarias() {
        return cuentasBancarias;
    }
    public int morosa (){
            int cuentasNegativo = 0;
        for (int x = 0 ; x < cuentasBancarias.length; x++){
            if (cuentasBancarias[x].getSaldo() < 0){
                cuentasNegativo++;
            }
        }
        return cuentasNegativo;
    }
    public void añadirCuentas(){

    }
}