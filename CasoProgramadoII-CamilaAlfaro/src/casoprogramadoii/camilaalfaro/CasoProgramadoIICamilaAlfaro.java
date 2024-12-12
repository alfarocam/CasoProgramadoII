/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casoprogramadoii.camilaalfaro;

import java.util.Scanner;

/**
 *
 * @author camil
 */
public class CasoProgramadoIICamilaAlfaro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creamos el gestor de habitacion con capacidad para 4 habitaciones
        GestionHabitacion gestion = new GestionHabitacion(4);
        //scanner para la entada de datos
        Scanner scanner = new Scanner(System.in);
        //variable para guardar opcion del menu
        int opcion;

        //menu con switch 
        do {
            System.out.println("\n*** SISTEMA DE GESTION DE RESERVAS DE HOTEL ***");
            System.out.println("1. Visualizar el numero de habitacion");
            System.out.println("2. Buscar habitacion por numero");
            System.out.println("3. Registrar habitacion");
            System.out.println("4. Listar habitaciones por categoria");
            System.out.println("5. Generar reporte final");
            System.out.println("6. Salir");
            System.out.print("Ingrese una opcion: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Numero de habitaciones:");
                    System.out.println("Piso 1 - Habitacion - Habitacion");
                    System.out.println("             1            2");
                    System.out.println("Piso 2 -     3            4 ");
                    break;

                case 2:
                    System.out.print("Ingrese numero de la habitacion a buscar: ");
                    int numBuscar = scanner.nextInt();
                    Habitaciones encontrado = gestion.buscarHabitacionPorNumero(numBuscar);
                    if (encontrado != null) {
                        System.out.println("Habitacion encontrada");
                        System.out.println(encontrado);
                    } else {
                        System.out.println("Habitacion no encontrado.");
                    }
                    break;

                case 6:
                    System.out.println("Gracias por usar el sistema!!");
                    break;

                default:
                    System.out.println("Por favor intente de nuevo");
                    break;
            }

            if (opcion != 0) {
                System.out.println("\nTque la tecla ENTER para continuar...");
                scanner.nextLine();
            }

        } while (opcion != 0);

        scanner.close();
    }
}
