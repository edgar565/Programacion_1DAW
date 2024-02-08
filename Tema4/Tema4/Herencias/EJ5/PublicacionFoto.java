package Tema4.Herencias.EJ5;

public class PublicacionFoto implements IPublicacion,IAbrirPublicacion{
    @Override
    public void publicar() {
        System.out.print("Estas publicando la imagen seleccionada");
    }

    @Override
    public void compartir() {
        System.out.print("Esta compartiendo la imagen seleccionada");

    }



    @Override
    public void abrir() {
        System.out.print("Estas abriendo la imagen");
    }
}
