import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * Crea un programa que analice texto y obtenga:
         * - Número total de palabras.
         * - Longitud media de las palabras.
         * - Número de oraciones del texto (cada vez que aparecen un punto).
         * - Encuentre la palabra más larga.
         *
         * Todo esto utilizando un único bucle.
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Por favor ingrese el texto que desea analizar");
        String texto=scanner.nextLine();

        int totalPalabras = 0;
        int totalLongitudPalabras = 0;
        int totalOraciones = 0;
        String palabraMasLarga = "";
        String palabraActual = "";

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            if (c==' ' || c == '.') {
                if (palabraActual.length() > 0) {

                    totalPalabras++;
                    totalLongitudPalabras += palabraActual.length();

                    if (palabraActual.length() > palabraMasLarga.length()) {
                        palabraMasLarga = palabraActual;
                    }

                    palabraActual="";
                }

                if (c == '.') {
                    totalOraciones++;
                }
            } else {
                palabraActual+=c;
            }
        }
        if (palabraActual.length() > 0) {
            totalPalabras++;
            totalLongitudPalabras += palabraActual.length();
            if (palabraActual.length() > palabraMasLarga.length()) {
                palabraMasLarga = palabraActual;
            }
        }

        double longitudMediaPalabras = totalPalabras > 0 ? (double) totalLongitudPalabras / totalPalabras : 0;

        System.out.println("Número total de palabras: " + totalPalabras);
        System.out.println("Longitud media de las palabras: " + longitudMediaPalabras);
        System.out.println("Número de oraciones: " + totalOraciones);
        System.out.println("Palabra más larga: " + palabraMasLarga);

        scanner.close();



    }
}