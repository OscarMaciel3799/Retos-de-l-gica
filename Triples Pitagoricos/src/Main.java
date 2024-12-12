import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Crea una función con java que encuentre todos los triples pitagóricos
        (ternas) menores o iguales a un número dado.
        Debes buscar información sobre qué es un triple pitagórico.
        La función únicamente recibe el número máximo que puede
        aparecer en el triple.
        Ejemplo: Los triples menores o iguales a 10 están
        formados por (3, 4, 5) y (6, 8, 10).
        */

        Scanner scanner =new Scanner(System.in);
        System.out.println("Ingrese el valor maximo");
        int maximo=scanner.nextInt();


        System.out.println("Triples pitagóricos menores o iguales a " + maximo + ":");
        for (int a = 1; a <= maximo; a++) {
            for (int b = a; b <= maximo; b++) {
                int c = (int) Math.sqrt(a * a + b * b);
                if (c <= maximo && a * a + b * b == c * c) {
                    System.out.println("(" + a + ", " + b + ", " + c + ")");
                }
            }
        }
    }


}