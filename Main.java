package recursividad;

/**
 *
 * @author abeta
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n -------- [ MENÚ DE RECURSIÓN ] -------");
            System.out.println("1. Calcular Factorial");
            System.out.println("2. Calcular Fibonacci");
            System.out.println("3. Sumar los dígitos de un número");
            System.out.println("4. Invertir una cadena de texto");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa un número para factorial: ");
                    int numFact = sc.nextInt();
                    System.out.println("Factorial de " + numFact + " = " + Recursion.factorial(numFact));
                    break;
                case 2:
                    System.out.print("Ingresa la posición para Fibonacci: ");
                    int numFib = sc.nextInt();
                    System.out.println("Fibonacci en posición " + numFib + " = " + Recursion.fibonacci(numFib));
                    break;
                case 3:
                    System.out.print("Ingresa un número entero positivo: ");
                    int numSum = sc.nextInt();
                    if (numSum < 0) {
                        System.out.println("Número inválido. Debe ser positivo.");
                    } else {
                        System.out.println("Suma de los dígitos de " + numSum + " = " + Recursion.sumaDigitos(numSum));
                    }
                    break;
                case 4:
                    System.out.print("Ingresa una cadena de texto: ");
                    String texto = sc.nextLine();
                    System.out.println("Cadena invertida: " + Recursion.invertirCadena(texto));
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }

        } while (opcion != 0);

        sc.close();
    }
}
