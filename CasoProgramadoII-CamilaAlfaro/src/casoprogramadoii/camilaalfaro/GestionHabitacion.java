/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoprogramadoii.camilaalfaro;

/**
 *
 * @author camil
 */
public class GestionHabitacion {

    //String[] Pisos = {"Piso 1", "Piso 2"};
    private Habitaciones[] arrgHabitacion; //arreglo para almacenar las habitaciones del hotel
    private int cantidadHabitaciones = 4; //contador que lleva el número de habitaciones registrados

    // const de la clase que inicializa el arreglo de habitaciones
    public GestionHabitacion(int capacidad) {
        arrgHabitacion = new Habitaciones[capacidad]; // Crea el arreglo con un tamaño máximo 'capacidad'
    }
    

    // Metodo para buscar una habitacion por su numero 
    public Habitaciones buscarHabitacionPorNumero(int numero) {
        for (int i = 0; i < cantidadHabitaciones; i++) { // Recorre el arreglo de las habitaciones
            if (arrgHabitacion[i].getNumeroHabitacion() == numero) { // Si encuentra el número de habitacion
                return arrgHabitacion[i]; // Retorna la habitación encontrada
            }
        }
        return null;
    }
    
    

}
