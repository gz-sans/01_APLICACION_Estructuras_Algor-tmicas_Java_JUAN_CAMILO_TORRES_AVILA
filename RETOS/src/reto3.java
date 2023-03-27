import java.util.Random;
import java.util.Scanner;

public class reto3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int resultadoMoneda = rand.nextInt(2); // 0 para cara, 1 para sello
        System.out.println("¡Bienvenido al juego del carisellazo!");
        System.out.println("¿Elige Cara o Sello?");
        String eleccionJugador = sc.nextLine();
        if (eleccionJugador.equalsIgnoreCase("cara")) {
            if (resultadoMoneda == 0) {
                System.out.println("¡Ganaste! La moneda cayó en cara.");
            } else {
                System.out.println("¡Perdiste! La moneda cayó en sello.");
            }
        } else if (eleccionJugador.equalsIgnoreCase("sello")) {
            if (resultadoMoneda == 1) {
                System.out.println("¡Ganaste! La moneda cayó en sello.");
            } else {
                System.out.println("¡Perdiste! La moneda cayó en cara.");
            }
        } else {
            System.out.println("Elección inválida. Por favor, elige Cara o Sello.");
        }
    }
}
