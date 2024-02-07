package Tema4.Herencias.EJ2;



class perro extends Animal {

    public perro() {
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
        System.out.println("Esta ladrando");
    }
}