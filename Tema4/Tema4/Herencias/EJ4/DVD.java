package Tema4.Herencias.EJ4;

class DVD extends Ficha{
    private String director;
    private int ano;
    public enum TipoDVD {
        ANIMACION, ACCION, DOCUMENTAL, CIENCIA_FICCION
    }
    private TipoDVD tipo;

    public DVD(int numero, String titulo, String director, int ano, TipoDVD tipo) {
        super(numero, titulo);
        this.director = director;
        this.ano = ano;
        this.tipo = tipo;
    }
    @Override
    public String toString() {
        return super.toString() + "\nDirector: " + director + "\nAño: " + ano + "\nTipo: " + tipo;
    }

}