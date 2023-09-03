package Modulo_1.src.Actividad_2.utils;

import java.util.LinkedList;
import java.util.Optional;


public class Pila<E> {
    private LinkedList<E> stack;

    //Creamos un stack que nos servira de pila
    public Pila() {
        stack = new LinkedList<>();
    }
    
    //Metodo que empujara al elemento al tope del stack
    public void push(E elementToPush) {
        stack.addFirst(elementToPush);
    }

    //metodo para sacar el ultimo elemento del stack y retornarlo
    //Usamos un "if stack is Empty" ya que si se intenta obtener el valor y la pila esta vacia, esto resultara en un error llamado "No such Element Exception"
    public Optional<E> peek() {
        if(stack.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(stack.getFirst());
    }

    //Este metodo nos ayuda a tronar el primer elemento en caso de ser necesario
    public Optional<E> pop() {
        if(stack.isEmpty()) {
            return Optional.empty();
        }

        E elementroTronado = stack.remove(0);
        return Optional.of(elementroTronado);
        
    }

    //Este elemento nos da el tamaño de la lista
    public int conocerElTamaño() {
        return this.stack.size();
    }

    //Metodo que nos permite saber (a demas de las exepciones de los otros metodos, siendo a peticion del usuario si la funcion tiene que ser agregada) si la lista esta vacia

    public boolean estaVacio() {
        return stack.isEmpty();
    }

    //Este metodo nos regresa un stack con elementos que han cambiado de posicion con otro stack
    public Pila<E> alternar(Pila<E> stackB) {
        Pila<E> alternar = new Pila<>();

        for (int i = 0; i < Math.max(this.conocerElTamaño(), stackB.conocerElTamaño()); i++) {
            try {
                alternar.push(stackB.pop().orElse(null));
            } catch (IndexOutOfBoundsException e) {}
            try {
                alternar.push(this.pop().orElse(null));
            } catch (IndexOutOfBoundsException e) {}
        }

        return alternar;
    }

    public Pila<E> inverso() {
        Pila<E> inverso = new Pila<>();

        for (int i = 0; i < this.conocerElTamaño(); i++) {
            inverso.push(this.pop().orElse(null));
        }

        return inverso;
    }
}