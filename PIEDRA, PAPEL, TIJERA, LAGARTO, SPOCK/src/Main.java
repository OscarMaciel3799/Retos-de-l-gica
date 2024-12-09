import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * Crea un programa que calcule quien gana más partidas al piedra,
         * papel, tijera, lagarto, spock.
         * - El resultado puede ser: "Player 1", "Player 2", "Tie" (empate)
         * - La función recibe un listado que contiene pares, representando cada jugada.
         * - El par puede contener combinaciones de "🗿" (piedra), "📄" (papel),
         *   "✂️" (tijera), "🦎" (lagarto) o "🖖" (spock).
         * - Ejemplo. Entrada: [("🗿","✂️"), ("✂️","🗿"), ("📄","✂️")]. Resultado: "Player 2".
         * - Debes buscar información sobre cómo se juega con estas 5 posibilidades.
         * * Rules:
         * - Tijeras cortan Papel. ✂️  > 📄
         * - Papel cubre Piedra. 📄 > 🗿
         * - Piedra tritura Lagarto. 🗿 > 🦎
         * - Lagarto envenena Spock. 🦎 > 🖖
         * - Spock rompe Tijeras. 🖖 > ✂️
         * - Tijeras decapitan Lagarto. ✂️ > 🦎
         * - Lagarto come Papel. 🦎 > 📄
         * - Papel desautoriza Spock. 📄 > 🖖
         * - Spock vaporiza Piedra. 🖖 > 🗿
         * - Piedra tritura Tijeras. 🗿 > ✂️
         */
        System.out.println("Bienvenido al juego Piedras, Papel, Tijeras, Lagarto, Spock");
        System.out.println("Desea Jugar?");
        System.out.println("Si\nNo");
        Scanner scanner=new Scanner(System.in);
        String valor=scanner.next();
        int winPlayer1=0;
        int winPlayer2=0;
        int eleccionPlayer1=0;
        int eleccionPlayer2=0;

        while(true){

            if ( valor.toLowerCase().equals("si") ){
                System.out.println("Elija una opcion Jugador1");
                System.out.println(menuOpciones());
                eleccionPlayer1=scanner.nextInt();
                System.out.println(menuOpciones());
                System.out.println("Elija una opcion Jugador2");
                eleccionPlayer2=scanner.nextInt();
            }

            switch(eleccionPlayer1){
                case 1:
                    System.out.println(eleccionPlayer1);
                    if(eleccionPlayer2==3 || eleccionPlayer2==4) {
                        winPlayer1++;
                        System.out.println("El ganador es player 1");
                    }else if(eleccionPlayer2==2 || eleccionPlayer2==5) {
                        winPlayer2++;
                        System.out.println("El ganador es player 2");
                    }
                    break;
                case 2:
                    if(eleccionPlayer2==1 || eleccionPlayer2==5) {
                        winPlayer1++;
                        System.out.println("El ganador es player 1");
                    }else if(eleccionPlayer2==4 || eleccionPlayer2==3) {
                        winPlayer2++;
                        System.out.println("El ganador es player 2");
                    }
                    break;
                case 3:
                    if(eleccionPlayer2==2 || eleccionPlayer2==4) {
                        winPlayer1++;
                        System.out.println("El ganador es player 1");
                    }else if(eleccionPlayer2==1 || eleccionPlayer2==5) {
                        winPlayer2++;
                        System.out.println("El ganador es player 2");
                    }
                    break;
                case 4:
                    if(eleccionPlayer2==2 || eleccionPlayer2==5) {
                        winPlayer1++;
                        System.out.println("El ganador es player 1");
                    }else if(eleccionPlayer2==1 || eleccionPlayer2==3) {
                        winPlayer2++;
                        System.out.println("El ganador es player 2");
                    }
                    break;
                case 5:
                    if(eleccionPlayer2==1 || eleccionPlayer2==3) {
                        winPlayer1++;
                        System.out.println("El ganador es player 1");
                    }else if(eleccionPlayer2==2 || eleccionPlayer2==4) {
                        winPlayer2++;
                        System.out.println("El ganador es player 2");
                    }
                    break;
                default:
                    if (eleccionPlayer1==eleccionPlayer2){
                        System.out.println("A sido un empate");
                    }
                    break;
            }
            System.out.println("Los puntos actualmente son: \nPlayer1: " + winPlayer1+"\nPlayer2: "+ winPlayer2);
            System.out.println("Desea volver a jugar? \n Si\n No");
            valor=scanner.next();
            if (valor.toLowerCase().equals("si") ){
                continue;
            }else {
                System.out.println("Espero que volvamos a jugar pronto");
                break;
            }
        }


    }
    public static String menuOpciones(){
        return  "1) Piedra \n" +
                "2) Papel\n" +
                "3) Tijera\n" +
                "4) Lagarto\n" +
                "5) Spock";
    }
}



