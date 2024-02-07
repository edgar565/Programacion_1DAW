package Tema4.Herencias.EJ2;


class Gallina extends Animal {
    public Gallina() {
    }

    @Override
    public void comer() {
        System.out.print("Esta comiendo");

    }

    @Override
    public void dormir() {
        System.out.print("Esta durmiendo");

    }

    @Override
    public void hacerRuido() {
        System.out.println("Esta cacareando");
    }
}