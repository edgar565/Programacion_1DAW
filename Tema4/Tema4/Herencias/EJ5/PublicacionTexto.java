package Tema4.Herencias.EJ5;

class PublicacionTexto implements IPublicacion {

    @Override
    public void publicar() {
        System.out.print("Estas publicando el texto seleccionado");
    }

    @Override
    public void compartir() {
        System.out.print("Estas compartiendo el texto seleccionando");
    }

    public PublicacionTexto() {
    }
}
