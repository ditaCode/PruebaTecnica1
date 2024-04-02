import java.util.Scanner; //1. Se agrega la importación de java.util

public class RetoUno {
    public static void main(String[] args) {//2. Se agrega método main
        Scanner s = new Scanner(System.in); //3. Se inicializa el método con System.in

        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        String j1 = s.nextLine();

        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
        String j2 = s.nextLine();

        if (j1.equals(j2)) { //4. Se aplica método de equals porque el operador == no funcionaba.
            System.out.println("Empate");
        } else {
            int ganador = 2;
            switch (j1) {
                case "piedra":
                    if (j2.equals("tijeras")) {
                        ganador = 1;
                    }
                    break; 
                case "papel":
                    if (j2.equals("piedra")) {
                        ganador = 1;
                    }
                    break;
                case "tijeras":
                    if (j2.equals("papel")) {
                        ganador = 1;
                    }
                    break;
                default:
                    break;
            }
            System.out.println("Gana el jugador " + ganador);
        }
    }
}
