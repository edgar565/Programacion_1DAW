package Tema4.Herencias.EJ7;

class AtaqueMagico implements IAtaque{
    @Override
    public void lanzar() {
        System.out.println("Acabas de lanzar un ataque magico");
    }

    @Override
    public void coste() {
        System.out.println("El ataque cuesta: ");
    }

    @Override
    public void danoInfligido() {
        System.out.println("El daño infringido es: ");
    }
}
