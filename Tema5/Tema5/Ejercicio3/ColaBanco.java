package Tema5.Ejercicio3;

import java.util.LinkedList;

public class ColaBanco {
    private LinkedList<Usuario> cola = new LinkedList<>();

    public ColaBanco() {
        cola = new LinkedList<>();
    }
    public void agregarUsuario(Usuario usuario) {
        cola.add(usuario);
        System.out.println("Usuario " + usuario.getNombre() + " agregado a la cola.");
    }

    public Usuario atenderSiguiente() {
        if (!cola.isEmpty()) {
            Usuario usuarioAtendido = cola.removeFirst();
            System.out.println("Usuario " + usuarioAtendido.getNombre() + " atendido.");
            return usuarioAtendido;
        } else {
            System.out.println("No hay usuarios en la cola.");
            return null;
        }
    }

    public void quitarUsuario(int posicion) {
        if (posicion >= 0 && posicion < cola.size()) {
            Usuario usuarioQuitado = cola.remove(posicion);
            System.out.println("Usuario " + usuarioQuitado.getNombre() + " quitado de la cola.");
        } else {
            System.out.println("Posición inválida.");
        }
    }

    public void mostrarCola() {
        System.out.println("Cola de usuarios:");
        for (Usuario usuario : cola) {
            System.out.println(usuario);
        }
    }
}