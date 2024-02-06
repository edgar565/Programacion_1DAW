package Tema4.Herencias;

abstract class Animal {
       public abstract void comer();
       public abstract void dormir();
       public abstract void hacerRuido();
}
class perro extends Animal{

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
class gato extends Animal{
    public gato() {
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
        System.out.println("Esta maullando");
    }
}
class conejo extends Animal{
    public conejo() {
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
        System.out.println("Esta ronroneando");
    }
}
class gallina extends Animal{
    public gallina() {
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
class caballo extends Animal{
    public caballo() {
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
        System.out.print("Esta relinchando");

    }
}