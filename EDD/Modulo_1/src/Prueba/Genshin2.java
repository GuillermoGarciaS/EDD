package Modulo_1.src.Prueba;

import java.util.LinkedList;
import java.util.Queue;

class chalan {
    private String nombre;
    private String puesto;

    public chalan(String nombre, String puesto) {
        this.nombre = nombre;
        this.puesto=puesto ;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    @Override
    public String toString() {
        return nombre + " puesto: " + puesto;
    }
}

public class Genshin2 {

    public static void main(String[] args) {

        Queue<chalan> colaPendejos = new LinkedList<>();
        ((LinkedList<chalan>) colaPendejos).push(new chalan("Mauu", "Maistro"));
        ((LinkedList<chalan>) colaPendejos).push(new chalan("Guillermo", "Director de obra"));
        ((LinkedList<chalan>) colaPendejos).push(new chalan("DrPepper", "bebida"));
        ((LinkedList<chalan>) colaPendejos).push(new chalan("Ocelote", "chalan"));
        ((LinkedList<chalan>) colaPendejos).push(new chalan("Dylan", "chalan"));

        System.out.println("Babosos agropecuarios");
        for (chalan chalan: colaPendejos) {
            System.out.println(chalan);
        }

    do {
        if (!colaPendejos.isEmpty()) {
            chalan chalanPapeado = colaPendejos.poll();
            System.out.println("Chalan papeado >:3: " + chalanPapeado);
        }
        } while (!colaPendejos.isEmpty());

        System.out.println("Cabrones esquinkles restantes: ");
        for (chalan chalan: colaPendejos) {
            System.out.println(chalan);
        }

        if (colaPendejos.isEmpty()) {
            System.out.println("Ya no hay weyes, valio verga la obra");
            
        }
    }
  }