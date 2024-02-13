package Tema4.Herencias.EJ7;

class AtaqueMagico implements IAtaque{
    @Override
    public void lanzar() {
        System.out.println("Acabas de lanzar un ataque magico");
    }

    @Override
    public int coste() {
        System.out.println("El ataque cuesta: ");
        return 30;
    }

    @Override
    public int danoInfligido() {
        System.out.println("El daño infringido es: ");
        return 50;
    }
}
