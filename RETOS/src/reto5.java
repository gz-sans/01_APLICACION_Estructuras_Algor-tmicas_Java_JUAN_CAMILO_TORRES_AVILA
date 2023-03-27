import java.util.Random;
import java.util.Scanner;

public class reto5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int resultadoMaquina;
        int vidasJugador = 3;
        int vidasMaquina = 3;
        System.out.println("¡Bienvenido al juego de Piedra, Papel o Tijera!");
        
        while (vidasJugador > 0 && vidasMaquina > 0) {
            System.out.println("Vidas restantes: Jugador " + vidasJugador + " - Máquina " + vidasMaquina);
            System.out.println("Elige tu jugada: Piedra, Papel o Tijera");
            String jugadaJugador = sc.nextLine();
            resultadoMaquina = rand.nextInt(3); // 0 para Piedra, 1 para Papel, 2 para Tijera

            if (jugadaJugador.equalsIgnoreCase("piedra")) {
                if (resultadoMaquina == 0) {
                    System.out.println("¡Empate! La máquina eligió Piedra.");
                } else if (resultadoMaquina == 1) {
                    System.out.println("¡Perdiste! La máquina eligió Papel.");
                    vidasJugador--;
                } else {
                    System.out.println("¡Ganaste! La máquina eligió Tijera.");
                    vidasMaquina--;
                }
            } else if (jugadaJugador.equalsIgnoreCase("papel")) {
                if (resultadoMaquina == 0) {
                    System.out.println("¡Ganaste! La máquina eligió Piedra.");
                    vidasMaquina--;
                } else if (resultadoMaquina == 1) {
                    System.out.println("¡Empate! La máquina eligió Papel.");
                } else {
                    System.out.println("¡Perdiste! La máquina eligió Tijera.");
                    vidasJugador--;
                }
            } else if (jugadaJugador.equalsIgnoreCase("tijera")) {
                if (resultadoMaquina == 0) {
                    System.out.println("¡Perdiste! La máquina eligió Piedra.");
                    vidasJugador--;
                } else if (resultadoMaquina == 1) {
                    System.out.println("¡Ganaste! La máquina eligió Papel.");
                    vidasMaquina--;
                } else {
                    System.out.println("¡Empate! La máquina eligió Tijera.");
                }
            } else {
                System.out.println("Jugada inválida. Por favor, elige Piedra, Papel o Tijera.");
            }
        }

        if (vidasJugador == 0) {
            System.out.println("Se acabaron las vidas del jugador. ¡La máquina gana!");
        } else {
            System.out.println("Se acabaron las vidas de la máquina. ¡El jugador gana!");
        }
    }
}
