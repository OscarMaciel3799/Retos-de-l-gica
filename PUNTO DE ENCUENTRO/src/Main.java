

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * Crea una función que calcule el punto de encuentro de dos objetos en movimiento
         * en dos dimensiones.
         * - Cada objeto está compuesto por una coordenada xy y una velocidad de desplazamiento
         *   (vector de desplazamiento) por unidad de tiempo (también en formato xy).
         * - La función recibirá las coordenadas de inicio de ambos objetos y sus velocidades.
         * - La función calculará y mostrará el punto en el que se encuentran y el tiempo que tardarán en lograrlo.
         * - La función debe tener en cuenta que los objetos pueden no llegar a encontrarse.
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese las coordenadas y velocidad del objeto A (x1, y1, vx1, vy1):");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double vx1 = scanner.nextDouble();
        double vy1 = scanner.nextDouble();

        System.out.println("Ingrese las coordenadas y velocidad del objeto B (x2, y2, vx2, vy2):");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double vx2 = scanner.nextDouble();
        double vy2 = scanner.nextDouble();

        if (x1==x2 && y1==y2){
            System.out.println("Los objetos se encuentran en el mismo punto");
        }else if(vy1/vx1 == vy2/vx2){
            System.out.println("Los objetos no se encontrarán.");
        }
        double tX = (x2 - x1) / (vx1 - vx2);
        double tY = (y2 - y1) / (vy1 - vy2);

        if (tX < 0 || tY < 0 || tX!=tY) {
            System.out.println("Los objetos no se encontrarán.");
        } else {

            double puntoX = x1 + vx1 * tX;
            double puntoY = y1 + vy1 * tY;

            System.out.printf("Los objetos se encontrarán en el punto: ("+puntoX+","+puntoY+") después de: "+tX+" unidades de tiempo.")
                    ;
        }
    }
}