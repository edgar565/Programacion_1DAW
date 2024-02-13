package Tema4.Herencias.EJ4;

public class main {
    public static void main(String[] args) {
        Libros libro1 = new Libros(1, "El señor de los anillos", "J.R.R. Tolkien", "Minotauro");
        System.out.println(libro1);

        Revistas revista1 = new Revistas(2, "National Geographic", 100, 2024);
        System.out.println(revista1);

        DVD dvd1 = new DVD(3, "Avatar", "James Cameron", 2009, DVD.TipoDVD.CIENCIA_FICCION);
        System.out.println(dvd1);
    }
}
