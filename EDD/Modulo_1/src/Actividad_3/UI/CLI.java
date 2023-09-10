package Modulo_1.src.Actividad_3.UI;

import java.util.Scanner;
import Modulo_1.src.Actividad_3.process.infijo_a_postfijo;


public class CLI {

    public static void showMenu() {

        Scanner scanner = new Scanner(System.in);

        //Inicio del programa

                            //Azul
        String oracion1 = "\033[34mBienvenido a la calculadora transformadora! \npresiona X para empezar";

        for (int i = 0; i < oracion1.length(); i++) {
            System.out.print(oracion1.charAt(i));
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();

        String confirmacion = scanner.nextLine().toLowerCase();

        //System.out.print("\033[36m"); Turquesa

        //System.out.print("\033[0m");  Blanco (color del texto por defecto)


        if (confirmacion.equals("x")) {

            infijo_a_postfijo.transformacion();

        } else {

            System.out.println("No pues, bueno chido pues");
        }
        

        scanner.close();
    }
    
}