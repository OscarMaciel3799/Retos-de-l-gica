import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * Crea un programa que simule el comportamiento del sombrero seleccionador del
         * universo mágico de Harry Potter.
         * - De ser posible realizará 5 preguntas (como mínimo) a través de la terminal.
         * - Cada pregunta tendrá 4 respuestas posibles (también a selecciona una a través de terminal).
         * - En función de las respuestas a las 5 preguntas deberás diseñar un algoritmo que
         *   coloque al alumno en una de las 4 casas de Hogwarts (Gryffindor, Slytherin , Hufflepuff y Ravenclaw)
         * - Ten en cuenta los rasgos de cada casa para hacer las preguntas y crear el algoritmo seleccionador.
         *   Por ejemplo, en Slytherin se premia la ambición y la astucia.
         */
        System.out.println("¡Bienvenido al Sombrero Seleccionador de Hogwarts!");
        System.out.println("Responde las siguientes preguntas seleccionando el número correspondiente a tu respuesta.");
        int gryffindor=0;
        int slytherin=0;
        int hufflepuff=0;
        int ravenclaw=0;
        Scanner scanner=new Scanner(System.in);
        int valor;
        System.out.println("¿Cómo te sentirías si tuvieras que enfrentarte a un enemigo muy poderoso?\n" +
                "1.Emocionado por el desafio\n" +
                "2.Preocupado por el resultado\n" +
                "3.Asustado\n" +
                "4.Determinado a ganar");
        valor= scanner.nextInt();
        if (valor>=1 && valor<=4){
            switch (valor){
                case 1:
                    gryffindor++;
                    break;
                case 2:
                    ravenclaw++;
                    break;
                case 3:
                    hufflepuff++;
                    break;
                case 4:
                    slytherin++;
                    break;
            }
        }else{
            System.out.println("La opción ingresada no es valido");
        }

        System.out.println("¿Cuál de estas cualidades te parece más importante en una pareja?\n" +
                "1.Lealtad\n" +
                "2.Comunicación\n" +
                "3.Compromiso\n" +
                "4.Pasión");
        valor= scanner.nextInt();
        if (valor>=1 && valor<=4){
            switch (valor){
                case 1:
                    hufflepuff++;
                    break;
                case 2:
                    ravenclaw++;
                    break;
                case 3:
                    gryffindor++;
                    break;
                case 4:
                    slytherin++;
                    break;
            }
        }else{
            System.out.println("La opción ingresada no es valido");
        }

        System.out.println("¿Que te gusta más de la epoca de navidad?\n" +
                "1.Los regalos\n" +
                "2.La decoracion\n" +
                "3.La comida\n" +
                "4.La reunión con la familia y amigos");
        valor= scanner.nextInt();
        if (valor>=1 && valor<=4){
            switch (valor){
                case 1:
                    slytherin++;
                    break;
                case 2:
                    ravenclaw++;
                    break;
                case 3:
                    hufflepuff++;
                    break;
                case 4:
                    gryffindor++;
                    break;
            }
        }else{
            System.out.println("La opción ingresada no es valido");
        }

        System.out.println("¿Cómo te describirías en una discusion?\n" +
                "1.Defiendo mi punto de vista con firmeza\n" +
                "2.Busco ganar la discusión a cualquier costo\n" +
                "3.Trato de escuchar todas las opiniones y llegar a un acuerdo\n" +
                "4.Presento argumentos lógicos y coherentes");
        valor= scanner.nextInt();
        if (valor>=1 && valor<=4){
            switch (valor){
                case 1:
                    gryffindor++;
                    break;
                case 2:
                    slytherin++;
                    break;
                case 3:
                    hufflepuff++;
                    break;
                case 4:
                    ravenclaw++;
                    break;
            }
        }else{
            System.out.println("La opción ingresada no es valido");
        }

        System.out.println("¿Cómo te describirias en una situación de peligro?\n" +
                "1.Mantengo la calma y busco una solución basado en mi conocimiento\n" +
                "2.Analizo la situación y busco la manera más astuta de salir adelante\n" +
                "3.Me preocupo por los demás y busco protegerlos\n" +
                "4.Actúo sin pensarlo dos veces");
        valor= scanner.nextInt();
        if (valor>=1 && valor<=4){
            switch (valor){
                case 1:
                    ravenclaw++;
                    break;
                case 2:
                    slytherin++;
                    break;
                case 3:
                    hufflepuff++;
                    break;
                case 4:
                    gryffindor++;
                    break;
            }
        }else{
            System.out.println("La opción ingresada no es valido");
        }

        if (gryffindor>slytherin && gryffindor>hufflepuff && gryffindor>ravenclaw){
            System.out.println("¡Ah, veo un corazón valiente aquí! " +
                    "El peligro no te asusta y siempre estás dispuesto a enfrentarlo con audacia. " +
                    "¡Debes ser un Gryffindor!");
        }else if (slytherin>gryffindor && slytherin>hufflepuff && slytherin>ravenclaw){
            System.out.println("¡Qué mente astuta y calculadora! Tienes grandes sueños y sabes cómo alcanzarlos. " +
                    "Slytherin será tu mejor herramienta.");
        }else if (hufflepuff>slytherin && hufflepuff>gryffindor && hufflepuff>ravenclaw){
            System.out.println("¡Qué alma amable y leal! Valoras la amistad y el esfuerzo sobre todo. " +
                    "¡Hufflepuff es para ti!");
        }else {
            System.out.println("\"¡Qué mente tan brillante! La búsqueda del conocimiento te define. " +
                    "Ravenclaw será el lugar perfecto para tu intelecto.\"");
        }



    }
}