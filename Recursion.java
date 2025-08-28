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
}
