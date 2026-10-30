/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseDatos;

/**
 *
 * @author Andrea Calvo
 */
public class PruebaModelo {
   
public static void main(String[] args) {

        // Obtiene los datos preparados en DatosPrueba.
        Paquete[] paquetes = DatosPrueba.crearPaquetes();
        Repartidor[] repartidores = DatosPrueba.crearRepartidores();

        // Recorre el arreglo y muestra cada paquete.
        System.out.println("=== PAQUETES DE PRUEBA ===");
        for (int i = 0; i < paquetes.length; i++) {
            System.out.println(paquetes[i]);
        }
        System.out.println("Total de paquetes: " + paquetes.length);

        // Recorre el arreglo y muestra cada repartidor.
        System.out.println("\n=== REPARTIDORES DE PRUEBA ===");
        for (int i = 0; i < repartidores.length; i++) {
            System.out.println(repartidores[i]);
        }
        System.out.println("Total de repartidores: " + repartidores.length);
        
        
                // Comprueba que un peso negativo no cambie el peso anterior.
        System.out.println("\n=== PRUEBA DE PESO INVALIDO ===");
        System.out.println("Peso antes: " + paquetes[0].getPeso());

        paquetes[0].setPeso(-5);

        System.out.println("Peso despues: " + paquetes[0].getPeso());
        
           // Comprueba que un nombre con solo espacios sea rechazado.
        System.out.println("\n=== PRUEBA DE NOMBRE INVALIDO ===");
        System.out.println("Nombre antes: " + repartidores[0].getNombre());

        repartidores[0].setNombre("   ");

        System.out.println("Nombre despues: " + repartidores[0].getNombre());     
        
             // Comprueba que una prioridad no permitida sea rechazada.
        System.out.println("\n=== PRUEBA DE PRIORIDAD INVALIDA ===");
        System.out.println("Prioridad antes: " + paquetes[0].getPrioridad());

        paquetes[0].setPrioridad("Urgente");

        System.out.println("Prioridad despues: " + paquetes[0].getPrioridad());   
     
          // Comprueba que el codigo cero sea rechazado.
        System.out.println("\n=== PRUEBA DE CODIGO INVALIDO ===");
        System.out.println("Codigo antes: " + paquetes[0].getCodigo());

        paquetes[0].setCodigo(0);

        System.out.println("Codigo despues: " + paquetes[0].getCodigo());      
        
        
        
        
    }    
    
    
    
    
}
