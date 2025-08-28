package recursividad;

/**
 *
 * @author abeta
 */

public class Recursion {

    // Función factorial recursiva
    public static long factorial(long n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    // Función Fibonacci recursiva
    public static long fibonacci(long n) {
        if (n <= 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    // Función que suma los dígitos de un número entero positivo
    public static int sumaDigitos(int n) {
        if (n < 10) {
            return n; // caso base: un solo dígito
        } else {
            return (n % 10) + sumaDigitos(n / 10); // recursión sobre el número dividido por 10
        }
    }
}
