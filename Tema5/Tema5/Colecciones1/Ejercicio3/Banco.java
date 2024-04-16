package Tema5.Colecciones1.Ejercicio3;

public class Banco {
    public static void main(String[] args) {
        ColaBanco colaBanco = new ColaBanco();

        Usuario usuario1 = new Usuario("Juan",  "12345678A", 30);
        Usuario usuario2 = new Usuario("María",  "87654321B", 25);
        Usuario usuario3 = new Usuario("Pedro",  "98765432C", 40);

        colaBanco.agregarUsuario(usuario1);
        colaBanco.agregarUsuario(usuario2);
        colaBanco.agregarUsuario(usuario3);

        colaBanco.mostrarCola();

        colaBanco.atenderSiguiente();

        colaBanco.quitarUsuario(1);

        colaBanco.mostrarCola();
    }
}
