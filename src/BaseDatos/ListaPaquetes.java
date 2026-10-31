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
    //METODOS DE ELIMINAR Y RECUPERAR
    public boolean eliminar(int codigo) { // Eliminar Paquete
        
        if (estaVacia()) { // Lista vacía
            System.out.println("LA LISTA ESTA VACIA");
            return false;
        }

        // Si el elemento a eliminar es el primero (cabeza)
        if (primero.getDato() != null && primero.getDato().getCodigo() == codigo) {
            primero = primero.getSiguiente();
            return true;
        }

        // Si está en el medio o al final, usamos anterior y actual
        Nodo anterior = primero;
        Nodo actual = primero.getSiguiente();

        while (actual != null) {
            if (actual.getDato() != null && actual.getDato().getCodigo() == codigo) {
                anterior.setSiguiente(actual.getSiguiente()); // Desconectamos el nodo
                return true;
            }
            anterior = actual;
            actual = actual.getSiguiente();
        }

        System.out.println("EL CODIGO DEL PAQUETE NO ESTA EN LA LISTA");
        return false;
    }

}
