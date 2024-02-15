package Tema4.Herencias.EJ8;

class AtaqueBolaFuego implements IAtaqueAvanzado{
    @Override
    public void lanzar() {
        System.out.println("Acabas de lanzar un ataque mágico y físico");
    }
    @Override
    public Coste coste() {
        System.out.println("El ataque cuesta: ");
        return new Coste();
    }

    @Override
    public DañoInfligido danoInfligido() {
        System.out.println("El daño infringido es: ");
        return new DañoInfligido();
    }

    public AtaqueBolaFuego() {
    }
}