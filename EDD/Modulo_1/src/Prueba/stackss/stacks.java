package Modulo_1.src.Prueba.stackss;

import java.util.Scanner;
import java.util.Stack;

public class stacks {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa tu formula :3");
        String equation = scanner.nextLine();
        stack.push(equation);

        System.out.println(equation);


        scanner.close();
    }
    
}
