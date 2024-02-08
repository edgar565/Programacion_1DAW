package Tema4.Herencias.EJ8;

class AtaqueEspadazo implements IAtaqueAvanzado {
    @Override
    public void lanzar() {
        System.out.println("Acabas de lanzar un ataque mágico y físico");
    }
    @Override
    public void coste() {
        System.out.println("El ataque cuesta: ");
    }

    @Override
    public void danoInfligido() {
        System.out.println("El daño infringido mágico es:  Y el daño infringido físico es: ");
    }
}
