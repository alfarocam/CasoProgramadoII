/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoprogramadoii.camilaalfaro;

/**
 *
 * @author camil
 */
public class Habitaciones {

    private String disponibilidad;//libre-sucia
    private int precio;
    private int numeroHabitacion;
    private String categoria;//doble - simple

    // Constructor
    public Habitaciones(String disponibilidad, int precio, int numeroHabitacion, String categoria) {
        this.disponibilidad = disponibilidad;
        this.precio = precio;
        this.numeroHabitacion = numeroHabitacion;
        this.categoria = calcularCategoria(precio);
    }

    // Metodo para calcular la categoria basado en el precio
    private String calcularCategoria(int precio) {
        if (precio < 30) {
            return "Simple";
        } else if (precio <= 60) {
            return "Doble";
        }
        return null;
    }

    // Getters y setters 
    //Getters
    public String getDisponibilidad() {
        return disponibilidad;
    }

    public int getPrecio() {
        return precio;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public String getCategoria() {
        return categoria;
    }

    //Setters
    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Habitacion #" + numeroHabitacion
                + ": " + categoria
                + ", Precio: " + precio
                + ", Disponibilidad: " + disponibilidad;
    }
}
