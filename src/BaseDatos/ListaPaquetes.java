package BaseDatos;

public class ListaPaquetes {

    private Nodo primero;

    public boolean estaVacia() {

        return primero == null;
    }

    public void insertar(Paquete dato) {

        Nodo nuevo = new Nodo(dato);

        if (primero == null) {
            primero = nuevo;
        } else {
            Nodo actual = primero;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
        }

    }

    public void mostrar() {
        Nodo actual = primero;
        while (actual != null) {
            System.out.print(actual.getDato() + " -> ");
            actual = actual.getSiguiente();
        }

        System.out.println("null");
    }

}
