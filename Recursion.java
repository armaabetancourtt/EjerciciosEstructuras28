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
            return n; 
        } else {
            return (n % 10) + sumaDigitos(n / 10); 
        }
    }

    // Función que invierte una cadena de texto usando recursión
    public static String invertirCadena(String texto) {
        if (texto.isEmpty() || texto.length() == 1) {
            return texto; 
        } else {
            return texto.charAt(texto.length() - 1) + invertirCadena(texto.substring(0, texto.length() - 1));
        }
    }
}
