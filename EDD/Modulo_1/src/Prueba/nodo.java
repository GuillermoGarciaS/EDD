package Modulo_1.src.Prueba;

public class nodo {

    private nodo siguiente;
    private String contiene;

    public nodo(){
        setSiguiente(null);
        setContiene(null);
    }

    public nodo(String c) {
        setSiguiente(null);
        setContiene(c);

    }

    public nodo(String c, nodo n){
        setSiguiente(n);
        setContiene(c);
    }


    public nodo getSiguiente() {
        return siguiente;
    }
    public void setSiguiente(nodo siguiente) {
        this.siguiente = siguiente;
    }
    public String getContiene() {
        return contiene;
    }
    public void setContiene(String contiene) {
        this.contiene = contiene;
    }

    
    
}
