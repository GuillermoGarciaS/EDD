package Modulo_1.src.Prueba;
import java.util.Stack;

class Personaje {
    private String nombre;
    private String habilidad;

    public Personaje(String nombre, String habilidad) {
        this.nombre = nombre;
        this.habilidad = habilidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getHabilidad() {
        return habilidad;
    }

    @Override
    public String toString() {
        return nombre + " utiliza la habilidad " + habilidad;
    }
}

public class Genshin {
    public static void main(String[] args) {
        Stack<Personaje> colaHabilidades = new Stack<>();

        // Agregamos habilidades de personajes a la cola
        colaHabilidades.push(new Personaje("Diluc", "Danza de la Lava"));
        colaHabilidades.push(new Personaje("Jean", "Viento Azotador"));
        colaHabilidades.push(new Personaje("Keqing", "Relámpago de Jade"));

        // Mostramos las habilidades en la cola
        System.out.println("Cola de Habilidades:");
        for (Personaje personaje : colaHabilidades) {
            System.out.println(personaje);
        }

        // Usamos la habilidad en la parte superior de la cola
        if (!colaHabilidades.isEmpty()) {
            Personaje personajeUsado = colaHabilidades.pop();
            System.out.println("\n" + personajeUsado + "\n");
        }

        // Mostramos las habilidades restantes en la cola
        System.out.println("Cola de Habilidades Restantes:");
        for (Personaje personaje : colaHabilidades) {
            System.out.println(personaje);
        }
    }
}