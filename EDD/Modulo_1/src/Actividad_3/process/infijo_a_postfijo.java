package Modulo_1.src.Actividad_3.process;

import Modulo_1.src.Actividad_2.utils.Pila;

import java.util.Locale;
import java.util.Scanner;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class infijo_a_postfijo {

    public static int prioridad(char operador) {
        switch (operador){
            case '+':
            case '-':
                return 1;
            case '/':
            case '*':
                return 2;
            case '^':
                return 3;
            default:
                return 0; //El «return 0» nos servira en caso de operadores no registrados
        }
    }

    public static Pila<String> String_a_Stack(String data) {
        Pila<String> stack = new Pila<>();
        StringBuilder currentSubstring = new StringBuilder();

        for (int i = 0; i < data.length(); i++) {
            char caracter = data.charAt(i);

            if (Character.isDigit(caracter) || caracter == '.') {
                currentSubstring.append(caracter);
            } else {
                if (currentSubstring.length() > 0) {
                    stack.push(currentSubstring.toString());
                    currentSubstring.setLength(0);
                }
            }
        }

        return stack;
    }
    
    public static String infijoAPostfijo(String infijo) {
        StringBuilder postfijo = new StringBuilder();
        Pila<Character> stack = new Pila<>();
    
        for (char c : infijo.toCharArray()) {
            if (Character.isDigit(c)) {
                postfijo.append(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.estaVacio() && stack.peek().get() != '(') {
                    postfijo.append(stack.pop().get());
                }
                stack.pop(); // Elimina el '(' del stack
            } else {
                // Es un operador
                while (!stack.estaVacio() && prioridad(stack.peek().get()) >= prioridad(c)) {
                    postfijo.append(stack.pop().get());
                }
                stack.push(c);
            }
        }
    
        while (!stack.estaVacio()) {
            postfijo.append(stack.pop().get());
        }
    
        return postfijo.toString();
    }

    public static Pila<String> guardarInfijoAPostfijo(Pila<String> infijo) {
        Pila<Character> stack = new Pila<>();
        Pila<String> postfijo = new Pila<>();

        while (!infijo.estaVacio()) {
            String elemento = infijo.pop().get();
            char c = elemento.charAt(0);

            if (Character.isDigit(c)) {
                postfijo.push(elemento);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.estaVacio() && stack.peek().get() != '(') {
                    postfijo.push(String.valueOf(stack.pop().get()));
                }
                stack.pop(); 
            } else {
                while (!stack.estaVacio() && prioridad(stack.peek().get()) >= prioridad(c)) {
                    postfijo.push(String.valueOf(stack.pop().get()));
                }
                stack.push(c);
            }
        }

        while (!stack.estaVacio()) {
            postfijo.push(String.valueOf(stack.pop().get()));
        }

        postfijo = postfijo.inverso();


        return postfijo;
    }

    private static double operacion(double operando1, double operando2, String operador) {
        
        switch (operador) {
            case "+":
                return operando1 + operando2;
            case "-":
                return operando1 - operando2;
            case "*":
                return operando1 * operando2;
            case "/":
                return operando1 / operando2;
            default:
            throw new IllegalArgumentException("El operador: " + operador + " es desconocido");
        }
    }
    public static BigDecimal evaluarExpresionPostfija(Pila<String> stackExpression) {
        Pila<BigDecimal> respuesta = new Pila<>();
    
        while (!stackExpression.estaVacio()) {
            String elemento = stackExpression.pop().get();
            if (elemento.equals("+") || elemento.equals("-") || elemento.equals("*") || elemento.equals("/")) {
                BigDecimal operando2 = respuesta.pop().get();
                BigDecimal operando1 = respuesta.pop().get();
                BigDecimal resultado = operacion(operando1, operando2, elemento);
                respuesta.push(resultado);
            } else {
                // Convierte el elemento a BigDecimal
                respuesta.push(new BigDecimal(elemento));
            }
        }
    
        return respuesta.pop().get();
    }

    private static BigDecimal operacion(BigDecimal operando1, BigDecimal operando2, String elemento) {
        return null;
    }

public static void transformacion() {
    Scanner sc = new Scanner(System.in);

    String oracion1 = "Bien, entonces transformemos tu fórmula. Ingresa la notación fija: ";

    for (int i = 0; i < oracion1.length(); i++) {
        System.out.print(oracion1.charAt(i));
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    System.out.println();

    String equacion = sc.nextLine();

    try {
        // Convierte la notación fija en postfija
        String postfija = infijoAPostfijo(equacion);

        // Imprime la notación postfija
        System.out.println("Notación Postfija: " + postfija);

        // Evaluación de la expresión postfija
        Pila<String> stackExpression = String_a_Stack(postfija);
        BigDecimal resultado = evaluarExpresionPostfija(stackExpression);

        // Formatea el resultado con un Locale específico
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat df = new DecimalFormat("#.##", symbols);
        String resultadoFormateado = df.format(resultado);

        // Imprime el resultado formateado
        System.out.println("Resultado: " + resultadoFormateado);
    } catch (Exception e) {
        System.out.println("Error en la entrada. Asegúrate de que la notación sea válida.");
    }

    sc.close();
}
    
}