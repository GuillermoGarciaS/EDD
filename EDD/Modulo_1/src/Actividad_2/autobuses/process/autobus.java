package Modulo_1.src.Actividad_2.autobuses.process;

import java.util.LinkedList;
import java.util.Scanner;

/*Test*/

public class autobus {

    /* Creación de la lista y del scanner para leer las opcciones del menu */
    static LinkedList<String> listaAutobus = new LinkedList<>();
    static Scanner scannerMenu = new Scanner(System.in);
    static byte opcion;


    /*Codigo para agregar pasajeron a la lista*/
    public static void agregarPasajeros() {
        
         Scanner scannerPasajero = new Scanner(System.in);
            String datosPasajero;
            System.out.println("Porfavor ingresa al usuario usando el siguiente formato...");
            System.out.println("Nombre / Edad");
            datosPasajero = scannerPasajero.nextLine();
            listaAutobus.add(datosPasajero);

    }
    /* Código para eliminar pasajeros de la lista */
    public static void eliminarPasajeros() {

        Scanner scannerEliminarPasajero = new Scanner(System.in);
            System.out.println("Ingresa los datos del pasajero a eliminar");
            String pasajeroABorrar = scannerEliminarPasajero.nextLine();

            /* Aqui se corrobora si el pasajero fue eliminado exitosamente o no */
            boolean eliminado = listaAutobus.remove(pasajeroABorrar);
            if (eliminado == true){
                System.out.println("Pasajero eliminado exitosamente");
            } else if (eliminado == false){
                System.out.println("Pasajero no encontrado");
            }
    }

    /* Código para visualizar los datos de un pasajero */
    public static void visualizarDatos() {

            System.out.println("Lista de pasajeros");
            /* Este comando nos permite imprimir la lista actual de pasajeros */
            System.out.println(listaAutobus);
    }

}