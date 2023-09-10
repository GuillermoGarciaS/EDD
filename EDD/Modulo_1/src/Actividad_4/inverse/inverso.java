package Modulo_1.src.Actividad_4.inverse;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class inverso {

    public static void main (String[] args) {

        List<Integer> numeros = new ArrayList<>();

        numeros.add(3);
        numeros.add(6);
        numeros.add(9);
        numeros.add(12);
        numeros.add(15);
        numeros.add(18);
        numeros.add(21);
        numeros.add(24);
        numeros.add(27);
        numeros.add(30);

        System.out.println("Lista: " + numeros);

        Collections.reverse(numeros);

        System.out.println("Nueva lista: " + numeros);

    }
    
}
