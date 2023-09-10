package Modulo_1.src.Actividad_4.UI;

import Modulo_1.src.Actividad_4.Process.Simulation;

import java.util.Scanner;

public class CLI {

    public static void showMenu() {

        String oracion1 = "Bienvenido a la empresa Kamisato, aqui se ha de apreciar el main frame de dos servidores";
        String oracion2 = "Presiona cualquier letra para comenzar!";
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < oracion1.length(); i++) {
            System.out.print(oracion1.charAt(i));
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();

        for (int i = 0; i < oracion2.length(); i++) {
            System.out.print(oracion2.charAt(i));
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();

        String cualquierLetra = scanner.nextLine();
        if (!cualquierLetra.isEmpty()) {
            Simulation.runSimulation();
        }
        scanner.close();
    }
    
}