package Tema4.Herencias.EJ8;

public class main {
    public static void main(String[] args) {
        AtaqueEspadazo ataqueEspadazo = new AtaqueEspadazo();
        ataqueEspadazo.lanzar();
        System.out.println(ataqueEspadazo.coste());
        System.out.println(ataqueEspadazo.danoInfligido());

        AtaqueBolaFuego ataqueBolaFuego = new AtaqueBolaFuego();
       ataqueBolaFuego.lanzar();
        System.out.println(ataqueBolaFuego.coste());
        System.out.println(ataqueBolaFuego.danoInfligido());

        AtaqueEspadazoEncantado ataqueEspadazoEncantado = new AtaqueEspadazoEncantado();
        ataqueEspadazoEncantado.lanzar();
        System.out.println(ataqueEspadazoEncantado.coste());
        System.out.println(ataqueEspadazoEncantado.danoInfligido());
    }
}