package Tema4.Herencias.EJ8;
abstract class Ataque implements IAtaqueAvanzado{
    public abstract void lanzar();
    public abstract Coste coste();
    public abstract DañoInfligido danoInfligido();
}