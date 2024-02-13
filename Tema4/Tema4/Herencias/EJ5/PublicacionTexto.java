package Tema4.Herencias.EJ5;

import Tema4.Herencias.EJ6.IPublicacionConReaccion;

class PublicacionTexto implements IPublicacion, IPublicacionConReaccion {

    @Override
    public void publicar() {
        System.out.print("Estas publicando el texto seleccionado");
    }

    @Override
    public void comentar() {
        System.out.print("Estas comentando al texto seleccionado");

    }

    @Override
    public void compartir() {
        System.out.print("Estas compartiendo el texto seleccionando");
    }

    @Override
    public void reaccionar() {
        System.out.print("Estas reaccionando al texto seleccionado");

    }

}
