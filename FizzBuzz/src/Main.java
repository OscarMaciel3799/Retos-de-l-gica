public class Main {
    public static void main(String[] args) {
        /*
         * Escribe un programa que muestre por consola (con un print) los
         * números de 1 a 100 (ambos incluidos y con un salto de línea entre
         * cada impresión), sustituyendo los siguientes:
         * - Múltiplos de 3 por la palabra "fizz".
         * - Múltiplos de 5 por la palabra "buzz".
         * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
         */
        int c=1;

        do {
            if (c%3==0 && c%5 ==0){
                System.out.println("fizzbuzz");
            }else if (c%3==0 ){
                System.out.println("fizz");
            }else if (c%5 ==0){
                System.out.println("buzz");
            }else{
                System.out.println(c);
            }
            c++;
        }while ( c<=100);
    }
}