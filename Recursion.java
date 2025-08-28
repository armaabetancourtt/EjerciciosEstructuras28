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
            // última letra + recursión sobre el resto
            return texto.charAt(texto.length() - 1) + invertirCadena(texto.substring(0, texto.length() - 1));
        }
    }

    // Función que cuenta las vocales en una cadena usando recursión
    public static int contarVocales(String texto) {
        if (texto.isEmpty()) {
            return 0; 
        } else {
            char c = Character.toLowerCase(texto.charAt(0));
            int cuenta = (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? 1 : 0;
            return cuenta + contarVocales(texto.substring(1)); 
        }
    }
}
