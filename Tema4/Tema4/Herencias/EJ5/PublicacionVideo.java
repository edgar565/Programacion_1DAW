package Tema4.Herencias.EJ5;

import Tema4.Herencias.EJ6.IPublicacionConReaccion;

public class PublicacionVideo implements IPublicacion,IAbrirPublicacion, IPublicacionConReaccion {
    @Override
    public void publicar() {
        System.out.print("Estas publicando el video seleccionado");
    }

    @Override
    public void comentar() {
        System.out.print("Estas comentando al video seleccionado");

    }

    @Override
    public void compartir() {
        System.out.print("Estas compartiendo el video seleccionado");
    }

    @Override
    public void reaccionar() {
        System.out.print("Estas reaccionando al video seleccionado");

    }


    @Override
    public void abrir() {
        System.out.print("Estas abriendo el video");

    }

}