import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * Escribe un programa que, dado un número, compruebe y muestre si es primo, fibonacci y par.
         * Ejemplos:
         * - Con el número 2, nos dirá: "2 es primo, fibonacci y es par"
         * - Con el número 7, nos dirá: "7 es primo, no es fibonacci y es impar"
         */


        System.out.println("Ingrese un número: ");
        Scanner scanner=new Scanner(System.in);
        int numero=scanner.nextInt();

        System.out.println("El numero "+numero+esPrimo(numero)+esFibonacci(numero)+esPar(numero));

    }
    public static String esPar(int num){
        if (num % 2==0){
            return " es par";
        }else{
            return " es impar";
        }
    }

    public static String esPrimo(int num){
        for(int i=2;i<num;i++){
            if(num%i==0){
                return " no es primo,";
            }
        } return " es primo,";
    }

    public static String esFibonacci(int num) {
        if (num < 0) {
            return " no es Fibonacci y";
        }

        int a = 0;
        int b = 1;
        int c = a + b;

        if (num == a || num == b) {
            return " es Fibonacci y";
        }

        while (c <= num) {
            if (c == num) {
                return " es Fibonacci y";
            }
            a = b;
            b = c;
            c = a + b;
        }

        return " no es Fibonacci y";
    }


}