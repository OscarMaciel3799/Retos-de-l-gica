import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una palabra:");
        String palabra = scanner.nextLine();

        //Guardamos las permutaciones en una lista
        ArrayList<String> permutaciones = new ArrayList<String>();

        generarPermutaciones("", palabra, permutaciones);

        // Imprimir las permutaciones
        System.out.println("Permutaciones de la palabra '" + palabra + "':");
        for (String perm : permutaciones) {
            System.out.println(perm);
        }

        scanner.close();
    }

    private static void generarPermutaciones(String prefijo, String resto, ArrayList<String> permutaciones) {
        int longitud = resto.length();
        if (longitud == 0) {
            // Si no hay más letras, se añade la permutación generada
            permutaciones.add(prefijo);
        } else {
            for (int i = 0; i < longitud; i++) {
                // Elegir la letra en la posición i
                String nuevaPalabra = resto.substring(0, i) + resto.substring(i + 1);
                // Llamada recursiva con la letra elegida añadida al prefijo
                generarPermutaciones(prefijo + resto.charAt(i), nuevaPalabra, permutaciones);
            }
        }
    }
}