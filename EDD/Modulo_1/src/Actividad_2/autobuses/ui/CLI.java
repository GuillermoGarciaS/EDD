package Modulo_1.src.Actividad_2.autobuses.ui;

import Modulo_1.src.Actividad_2.autobuses.process.autobus;

import java.util.LinkedList;
import java.util.Scanner;

public class CLI {

    public static void showMenu() {

    Scanner scannerMenu = new Scanner(System.in);
    byte opcion;

    do {
        System.out.println("Bienvenido al sistema de MiMacroPeriferico, ¿que deseas hacer?");
        System.out.println("/1/ Agregar un pasajero");
        System.out.println("/2/ Eliminar un pasajero");
        System.out.println("/3/ Visualizar los datos de un pasajero");
        System.out.println("/4/ Salir del sistema");
        opcion = scannerMenu.nextByte();

        switch (opcion) {
            case 1:
            autobus.agregarPasajeros();
            break;

            case 2:
            autobus.eliminarPasajeros();
            break;

            case 3:
            autobus.visualizarDatos();
            break;

            case 4:
            System.out.println("Saliendo del sistema...");
            break;

        }
        
        } while (opcion != 4);
        
    }

    public static String seleccionarJugador(LinkedList jugadoresDisponibles) {
        return null;
    }
}
