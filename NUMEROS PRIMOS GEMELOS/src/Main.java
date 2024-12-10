import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * Crea un programa que encuentre y muestre todos los pares de números primos
         * gemelos en un rango concreto.
         * El programa recibirá el rango máximo como número entero positivo.
         *
         * - Un par de números primos se considera gemelo si la diferencia entre
         *   ellos es exactamente 2. Por ejemplo (3, 5), (11, 13)
         *
         * - Ejemplo: Rango 14
         *   (3, 5), (5, 7), (11, 13)
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el rango máximo que desee evaluar, asegurese que el número sea entero positivo: ");
        int rangoMaximo = scanner.nextInt();

        if (rangoMaximo < 2) {
            System.out.println("El rango debe ser al menos 2 para encontrar primos gemelos.");
        } else {
            int[][] primosGemelos = encontrarPrimosGemelos(rangoMaximo);
            System.out.println("Pares de primos gemelos en el hasta el rango " + rangoMaximo + " son :");
            System.out.println(Arrays.deepToString(primosGemelos));

        }
        scanner.close();

    }
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int[][] encontrarPrimosGemelos(int rangoMaximo) {
        List<int[]> listaPrimosGemelos = new ArrayList<>();

        for (int i = 2; i <= rangoMaximo - 2; i++) {
            if (esPrimo(i) && esPrimo((i + 2))) {
                listaPrimosGemelos.add(new int[]{i, i + 2});
            }
        }

        int[][] matrizPrimosGemelos = new int[listaPrimosGemelos.size()][2];
        for (int i = 0; i < listaPrimosGemelos.size(); i++) {
            matrizPrimosGemelos[i] = listaPrimosGemelos.get(i);
        }

        return matrizPrimosGemelos;
    }

}