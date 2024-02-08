package Tema4.Herencias.EJ5;

public class PublicacionVideo implements IPublicacion,IAbrirPublicacion,{
    @Override
    public void publicar() {
        System.out.print("Estas publicando el video seleccionado");
    }

    @Override
    public void compartir() {
        System.out.print("Estas compartiendo el video seleccionado");
    }


    @Override
    public void abrir() {
        System.out.print("Estas abriendo el video");

    }
}