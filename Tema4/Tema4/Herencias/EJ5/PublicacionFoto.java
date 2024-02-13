package Tema4.Herencias.EJ5;

import Tema4.Herencias.EJ6.IPublicacionConReaccion;

public class PublicacionFoto implements IPublicacion,IAbrirPublicacion, IPublicacionConReaccion {
    @Override
    public void publicar() {
        System.out.print("Estas publicando la imagen seleccionada");
    }

    @Override
    public void comentar() {
        System.out.print("Estas comentando la imagen seleccionada");

    }

    @Override
    public void compartir() {
        System.out.print("Esta compartiendo la imagen seleccionada");

    }

    @Override
    public void reaccionar() {
        System.out.print("Estas reaccionando la imagen seleccionada");

    }


    @Override
    public void abrir() {
        System.out.print("Estas abriendo la imagen");
    }
}
