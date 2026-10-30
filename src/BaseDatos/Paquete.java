/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseDatos;

/**
 *
 * @author Isaac Fallas
 */
public class Paquete {
    
// Atributos privados: almacenan los datos de cada paquete.
    private int codigo;
    private String destinatario;
    private String centroOrigen;
    private String centroDestino;
    private double peso;
    private String prioridad;
    private String estado;
    
    
// Metodos get, set:
    
// Permiten consultar los atributos privados del paquete.
    
    public int getCodigo() {
        return codigo;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public String getCentroOrigen() {
        return centroOrigen;
    }

    public String getCentroDestino() {
        return centroDestino;
    }

    public double getPeso() {
        return peso;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public String getEstado() {
        return estado;
    }
    
// Permite asignar códigos mayores que cero.
    
    public void setCodigo(int codigo) {
        if (codigo > 0) {
            this.codigo = codigo;
        } else {
            System.out.println("El codigo debe ser mayor que cero.");
        }
    }
    
// Valida que el destinatario no sea nulo, vacio o solo espacios.
    
    public void setDestinatario(String destinatario) {
        if (destinatario != null && !destinatario.trim().isEmpty()) {
            this.destinatario = destinatario.trim();
        } else {
            System.out.println("El destinatario no puede estar vacio.");
        }
    }
    
// Valida que el centro de origen tenga un nombre.
    
    public void setCentroOrigen(String centroOrigen) {
        if (centroOrigen != null && !centroOrigen.trim().isEmpty()) {
            this.centroOrigen = centroOrigen.trim();
        } else {
            System.out.println("El centro de origen no puede estar vacio.");
        }
    }    

// Valida que el centro de destino tenga un nombre.
    
    public void setCentroDestino(String centroDestino) {
        if (centroDestino != null && !centroDestino.trim().isEmpty()) {
            this.centroDestino = centroDestino.trim();
        } else {
            System.out.println("El centro de destino no puede estar vacio.");
        }
    }

// El peso del paquete debe ser mayor que cero.
    
    public void setPeso(double peso) {
        if (peso > 0) {
            this.peso = peso;
        } else {
            System.out.println("El peso debe ser mayor que cero.");
        }
    }

// Solo permite las prioridades Alta, Media o Baja.
    
    public void setPrioridad(String prioridad) {
        if (prioridad != null
                && (prioridad.trim().equalsIgnoreCase("Alta")
                || prioridad.trim().equalsIgnoreCase("Media")
                || prioridad.trim().equalsIgnoreCase("Baja"))) {
            this.prioridad = prioridad.trim();
        } else {
            System.out.println("La prioridad debe ser Alta, Media o Baja.");
        }
    }
    
// Valida que el estado del paquete no este vacio.
    
    public void setEstado(String estado) {
        if (estado != null && !estado.trim().isEmpty()) {
            this.estado = estado.trim();
        } else {
            System.out.println("El estado no puede estar vacio.");
        }
    }    
    
    
// Constructores:


// Crea un paquete y utiliza los setters para validar sus datos.
    
    public Paquete(int codigo, String destinatario, String centroOrigen,
            String centroDestino, double peso, String prioridad, String estado) {
        setCodigo(codigo);
        setDestinatario(destinatario);
        setCentroOrigen(centroOrigen);
        setCentroDestino(centroDestino);
        setPeso(peso);
        setPrioridad(prioridad);
        setEstado(estado);
    }

// Devuelve un texto con los datos del paquete.
    
    @Override
    public String toString() {
        return "Codigo: " + codigo
                + " | Destinatario: " + destinatario
                + " | Origen: " + centroOrigen
                + " | Destino: " + centroDestino
                + " | Peso: " + peso
                + " | Prioridad: " + prioridad
                + " | Estado: " + estado;
    }
    
    
    
    
    
}
