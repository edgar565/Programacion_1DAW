package Tema4.Herencias.EJ4;

class DVD extends Ficha{
    private String director;
    private int ano;
    enum tipo_DVD{
        ANIMACION, ACCION, DOCUMENTAL, CIENCIA_FICCION
    }

    @Override
    public String toString() {
        return "Número: " + + "\nTítulo: " +  + "\nDirector: " + director + "\nAño: " + ano + "\nTipo: " + tipo_DVD;
    }

    public DVD(int numero, String titulo, String director, int ano, tipo_DVD tipo) {
        super(numero, titulo);
        this.director = director;
        this.ano = ano;
    }

}