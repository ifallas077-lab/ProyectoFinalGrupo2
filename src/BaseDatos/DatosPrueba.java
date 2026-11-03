/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseDatos;

/**
 *
 * @author Andrea Calvo
 */
public class DatosPrueba {  
   

// Crea y devuelve un arreglo con 15 paquetes de prueba.
    
    public static Paquete[] crearPaquetes() {
        Paquete[] paquetes = new Paquete[15];

        // Orden: codigo, destinatario, origen, destino,
        // peso, prioridad y estado.
        paquetes[0] = new Paquete(1, "Ana Lopez", "San Jose",
                "Heredia", 2.5, "Alta", "Pendiente");

        paquetes[1] = new Paquete(2, "Luis Mora", "Cartago",
                "Alajuela", 4.0, "Media", "Pendiente");

        paquetes[2] = new Paquete(3, "Maria Rojas", "Heredia",
                "Cartago", 1.2, "Baja", "Pendiente");

        paquetes[3] = new Paquete(4, "Carlos Soto", "Alajuela",
                "San Jose", 8.5, "Alta", "Pendiente");

        paquetes[4] = new Paquete(5, "Sofia Vargas", "San Jose",
                "Puntarenas", 3.0, "Media", "Pendiente");

        paquetes[5] = new Paquete(6, "Pedro Castro", "Limon",
                "Heredia", 6.2, "Baja", "Pendiente");

        paquetes[6] = new Paquete(7, "Laura Jimenez", "Puntarenas",
                "Alajuela", 5.5, "Alta", "Pendiente");

        paquetes[7] = new Paquete(8, "Diego Sanchez", "Cartago",
                "Limon", 2.0, "Media", "Pendiente");

        paquetes[8] = new Paquete(9, "Elena Torres", "Heredia",
                "San Jose", 7.3, "Baja", "Pendiente");

        paquetes[9] = new Paquete(10, "Jorge Perez", "Alajuela",
                "Puntarenas", 9.0, "Alta", "Pendiente");

        paquetes[10] = new Paquete(11, "Valeria Solis", "San Jose",
                "Cartago", 1.8, "Media", "Pendiente");

        paquetes[11] = new Paquete(12, "Andres Ruiz", "Limon",
                "Alajuela", 4.7, "Baja", "Pendiente");

        paquetes[12] = new Paquete(13, "Daniela Vega", "Puntarenas",
                "Heredia", 3.6, "Alta", "Pendiente");

        paquetes[13] = new Paquete(14, "Pablo Arias", "Cartago",
                "San Jose", 6.0, "Media", "Pendiente");

        paquetes[14] = new Paquete(15, "Gabriela Leon", "Heredia",
                "Limon", 2.9, "Baja", "Pendiente");

        return paquetes;
    }    
    
 // Crea y devuelve un arreglo con 5 repartidores de prueba.
    
    public static Repartidor[] crearRepartidores() {
        Repartidor[] repartidores = new Repartidor[5];

        // Orden: codigo, nombre y estado.
        repartidores[0] = new Repartidor(1, "Juan Mora", "Disponible");
        repartidores[1] = new Repartidor(2, "Ana Castro", "Disponible");
        repartidores[2] = new Repartidor(3, "Luis Rojas", "Disponible");
        repartidores[3] = new Repartidor(4, "Maria Soto", "Disponible");
        repartidores[4] = new Repartidor(5, "Carlos Vega", "Disponible");

        return repartidores;
    }    
    
    
}
