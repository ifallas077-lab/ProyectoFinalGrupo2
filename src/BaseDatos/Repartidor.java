/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseDatos;

/**
 *
 * @author Isaac Fallas
 */
public class Repartidor {
    
// Atributos privados: Datos privados de cada repartidor.
    
    private int codigo;
    private String nombre;
    private String estado;    
 
// Metodos get, set:
// Permiten consultar los datos privados del repartidor.
    
    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEstado() {
        return estado;
    }    
    
// El codigo debe ser mayor que cero.
    
    public void setCodigo(int codigo) {
        if (codigo > 0) {
            this.codigo = codigo;
        } else {
            System.out.println("El codigo debe ser mayor que cero.");
        }
    }

// El nombre no puede ser nulo, vacio o solo espacios.
    
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre.trim();
        } else {
            System.out.println("El nombre no puede estar vacio.");
        }
    }

// El estado debe contener un valor.
    
    public void setEstado(String estado) {
        if (estado != null && !estado.trim().isEmpty()) {
            this.estado = estado.trim();
        } else {
            System.out.println("El estado no puede estar vacio.");
        }
    }    
    
// Constructor:
// Crea un repartidor y valida sus datos mediante los setters.
    
    public Repartidor(int codigo, String nombre, String estado) {
        setCodigo(codigo);
        setNombre(nombre);
        setEstado(estado);
    }    
    
// Devuelve un texto con los datos del repartidor.
    
    @Override
    public String toString() {
        return "Codigo: " + codigo
                + " | Nombre: " + nombre
                + " | Estado: " + estado;
    }    
    
    
    
}
