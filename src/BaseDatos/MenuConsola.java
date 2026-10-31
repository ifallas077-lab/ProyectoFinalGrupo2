/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseDatos;

import java.util.Scanner;

/**
 *
 * @author Isaac Fallas
 */
public class MenuConsola {

    private final Scanner teclado = new Scanner(System.in); // lee lo que escribe el usuario
    private final ListaPaquetes lista = new ListaPaquetes(); // lista enlazada con los paquetes

    // Muestra el menu y repite hasta que se elija salir 
    public void iniciar() {
        int opcion;
        do {
            mostrarOpciones();
            opcion = leerEntero("Seleccione una opcion: ");
            // cada case llama al metodo de su opcion; el break evita pasar al siguiente
            switch (opcion) {
                case 1:
                    registrarPaquete();
                    break;
                case 2:
                    mostrarPaquetes();
                    break;
                case 3:
                    buscarPaquete();
                    break;
                case 4:
                    eliminarPaquete();
                    break;
                case 5:
                    cargarDatosPrueba();
                    break;
                case 6:
                    mostrarRepartidores();
                    break;
                case 0:
                    System.out.println("Saliendo del sistema......");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion != 0);
    }

    private void mostrarOpciones() {
        System.out.println();
        System.out.println("== Gestion De Entregas y Rutas ==");
        System.out.println("1. Registrar Paquete");
        System.out.println("2. Mostrar Paquetes");
        System.out.println("3. Buscar Paquete");
        System.out.println("4. Eliminar Paquete");
        System.out.println("5. Cargar Paquetes De Prueba");
        System.out.println("6. Mostrar Repartidores De Prueba");
        System.out.println("0. Salir");
    }

    private void registrarPaquete() { 
        //Pide los datos, valida que el codigo no exista y agrega el paquete a la lista.
        System.out.println("--- Registrar paquete ---");
        int codigo = leerEnteroPositivo("Codigo: ");

        // no permiten dos paquetes con el mismo codigo
        if (lista.buscar(codigo) != null) {
            System.out.println("Ya existe un paquete con ese codigo");
            return;
        }

        String destinatario = leerTexto("Destinatario: ");
        String origen = leerTexto("Centro de origen: ");
        String destino = leerTexto("Centro de destino: ");
        double peso = leerDecimal("Peso(KG): ");
        String prioridad = leerPrioridad();

        Paquete nuevo = new Paquete(codigo, destinatario, origen, destino, peso, prioridad, "Pendiente");
        lista.insertar(nuevo);
        System.out.println("Paquete regitrado correctamente");
    }

    private void mostrarPaquetes() {
        //Muestra los paquetes si la lista no esta vacia.
        if (lista.estaVacia()) {
            System.out.println("No hay paquetes registrados.");
        } else {
            System.out.println("--- Paquetes registrados ---");
            lista.mostrar();
        }
    }

    private void buscarPaquete() {
        //Busca un paquete por codigo y lo muestra, o avisa si no existe.
        int codigo = leerEnteroPositivo("Codigo a buscar: ");
        Paquete encontrado = lista.buscar(codigo);
        if (encontrado == null) {
            System.out.println("El paquete " + codigo + " no existe");
        } else {
            System.out.println("Paquete encontrado: ");
            System.out.println(encontrado);
        }
    }

    private void eliminarPaquete() {
        //Elimina un paquete por codigo; la lista avisa si no se pudo.
        int codigo = leerEnteroPositivo("Codigo a eliminar: ");
        if (lista.eliminar(codigo)) {
            System.out.println("Paquete Eliminado");
        }

    }

    private void cargarDatosPrueba() { 
        //Inserta los 15 paquetes de DatosPrueba sin repetir codigos.
        Paquete[] datos = DatosPrueba.crearPaquetes();
        int cargados = 0;
        for (int i = 0; i < datos.length; i++) {
            if (lista.buscar(datos[i].getCodigo()) == null) {
                lista.insertar(datos[i]);
                cargados++;
            }
        }
        System.out.println("Paquetes cargados: " + cargados + " de " + datos.length);
    }

    private void mostrarRepartidores() {
        //Muestra los 5 repartidores de prueba.
        Repartidor[] repartidores = DatosPrueba.crearRepartidores();
        System.out.println("--- Repartidores de prueba ---");
        for (int i = 0; i < repartidores.length; i++) {
            System.out.println(repartidores[i]);
        }
    }

    //Lectura segura del teclado
    private int leerEntero(String mensaje) {
        //Pide un numero entero y repite hasta que sea valido.
        while (true) {
            System.out.println(mensaje);
            String texto = teclado.nextLine().trim();
            try {
                return Integer.parseInt(texto);
            } catch (NumberFormatException e) {
                System.out.println("Debe ingresar un numero entero");
            }
        }
    }

    private int leerEnteroPositivo(String mensaje) {
        //Pide un entero mayor que cero.
        while (true) {
            int valor = leerEntero(mensaje);
            if (valor > 0) {
                return valor;
            }
            System.out.println("El valor debe ser mayor que cero");
        }
    }

    private double leerDecimal(String mensaje) {
        //Pide un decimal mayor que cero.
        while (true) {
            System.out.println(mensaje);
            String texto = teclado.nextLine().trim();
            try {
                double valor = Double.parseDouble(texto);
                if (valor > 0) {
                    return valor;
                }
                System.out.println("El valor debe ser mayor que cero.");
            } catch (NumberFormatException e) {
                System.out.println("Debe ingresar un numero.");
            }
        }
    }

    private String leerTexto(String mensaje) {
        //Pide un texto que no este vacio.
        while (true) {
            System.out.println(mensaje);
            String texto = teclado.nextLine().trim();
            if (!texto.isEmpty()) {
                return texto;
            }
            System.out.println("Este campo no puede quedar vacio");
        }
    }

    private String leerPrioridad() {
        //Pide la prioridad hasta que sea Alta, Media o Baja.
        while (true) {
            String texto = leerTexto("Prioridad (Alta, Media o Baja): ");
            if (texto.equalsIgnoreCase("Alta")) {
                return "Alta";
            }
            if (texto.equalsIgnoreCase("Media")) {
                return "Media";
            }
            if (texto.equalsIgnoreCase("Baja")) {
                return "Baja";
            }
            System.out.println("La prioridad debe ser Alta, Media o Baja");

        }
    }
}
