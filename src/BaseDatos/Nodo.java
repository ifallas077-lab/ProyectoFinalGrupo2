package BaseDatos;

public class Nodo {

    private Paquete dato;
    private Nodo siguiente;

    public Nodo(Paquete dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public Paquete getDato() {
        return dato;
    }

    public void setDato(Paquete dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

}
