import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * Crea una función que reciba dos cadenas de texto casi iguales,
         * a excepción de uno o varios caracteres.
         * La función debe encontrarlos y retornarlos en formato lista/array.
         * - Ambas cadenas de texto deben ser iguales en longitud.
         * - Las cadenas de texto son iguales elemento a elemento.
         * - No se pueden utilizar operaciones propias del lenguaje
         *   que lo resuelvan directamente.
         *
         * Ejemplos:
         * - Me llamo mouredev / Me llemo mouredov -> ["e", "o"]
         * - Me llamo.Brais Moure / Me llamo brais moure -> [" ", "b", "m"]
         */

        System.out.println("Bienvenido al indetificador de caracteres");
        Scanner scanner=new Scanner(System.in);
        ArrayList<String> infiltrados=new ArrayList<>();;
        System.out.println("Asegurese que ambas cadenas de texto tengan el mismo tamaño");
        System.out.println("Ingrese la primer cadena de texto");
        String cadena1=scanner.nextLine();
        System.out.println("Ingrese la segunda cadena de texto, debe tener "+cadena1.length()+" caracteres");
        String cadena2=scanner.nextLine();
        if (cadena1.length()!=cadena2.length()){
            System.out.println("Las cadenas de Texto no tienen el mismo tamaño");
        }else{
            for (int i=0;i<cadena1.length();i++){
                if (cadena1.charAt(i)!=cadena2.charAt(i)){
                    infiltrados.add(String.valueOf(cadena1.charAt(i)));
                    infiltrados.add(String.valueOf(cadena2.charAt(i)));
                }
            }
            System.out.println(infiltrados);
        }


    }
}