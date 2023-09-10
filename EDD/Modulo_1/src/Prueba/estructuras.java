package Modulo_1.src.Prueba;

public class estructuras {

    public static void main (String[] args) {

    String persona1 = "Axel";
    String persona2 = "Guillermo";
    String persona3 = "Yun";
    String persona4 = "Jimena";

    nodo n1 =  new nodo(persona1);
    nodo n2 = new nodo(persona2);
    nodo n3 = new nodo(persona3);
    nodo n4 = new nodo(persona4);
    
    n1.setSiguiente(n2);
    n2.setSiguiente(n3);
    n3.setSiguiente(n4);

        nodo aux = n1;

        for (int i = 0; i < 4; i++) {

            String aux2 = (String)aux.getContiene();
            System.out.println(aux2);
            aux = aux.getSiguiente();
        }
    }

}
