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
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

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
