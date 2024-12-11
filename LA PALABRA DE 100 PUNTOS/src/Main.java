import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * Crea un programa que calcule los puntos de una palabra.
         * - Cada letra tiene un valor asignado. Por ejemplo, en el abecedario
         *   español de 27 letras, la A vale 1 y la Z 27.
         * - El programa muestra el valor de los puntos de cada palabra introducida.
         * - El programa finaliza si logras introducir una palabra de 100 puntos.
         * - Puedes usar la terminal para interactuar con el usuario y solicitarle
         *   cada palabra.
         */
        String[] abecedario={"a","b","c","d","e","f","g","h","i","j","k","l","m","n",
                "ñ","o","p","q","r","s","t","u","v","w","x","y","z"};

        Scanner scanner=new Scanner(System.in);


        while(true){
            System.out.println("Ingrese una palabra");
            String palabra=scanner.next().toLowerCase();
            int resultado=0;
            for (int i=0;i<palabra.length();i++){

                for (int j=0;j<abecedario.length;j++){
                    if (abecedario[j].equals(String.valueOf(palabra.charAt(i)))){
                        resultado+=(j+1);
                        break;
                    }
                }

            }
            System.out.println(resultado);
            if (resultado==100){
                break;
            }
        }


    }
}