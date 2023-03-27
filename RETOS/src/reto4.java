import java.util.Random;
import java.util.Scanner;

public class reto4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int resultadoMaquina = rand.nextInt(3); // 0 para Piedra, 1 para Papel, 2 para Tijera
        System.out.println("¡Bienvenido al juego de Piedra, Papel o Tijera!");
        System.out.println("Elige tu jugada: Piedra, Papel o Tijera");
        String jugadaJugador = sc.nextLine();
        if (jugadaJugador.equalsIgnoreCase("piedra")) {
            if (resultadoMaquina == 0) {
                System.out.println("¡Empate! La máquina eligió Piedra.");
            } else if (resultadoMaquina == 1) {
                System.out.println("¡Perdiste! La máquina eligió Papel.");
            } else {
                System.out.println("¡Ganaste! La máquina eligió Tijera.");
            }
        } else if (jugadaJugador.equalsIgnoreCase("papel")) {
            if (resultadoMaquina == 0) {
                System.out.println("¡Ganaste! La máquina eligió Piedra.");
            } else if (resultadoMaquina == 1) {
                System.out.println("¡Empate! La máquina eligió Papel.");
            } else {
                System.out.println("¡Perdiste! La máquina eligió Tijera.");
            }
        } else if (jugadaJugador.equalsIgnoreCase("tijera")) {
            if (resultadoMaquina == 0) {
                System.out.println("¡Perdiste! La máquina eligió Piedra.");
            } else if (resultadoMaquina == 1) {
                System.out.println("¡Ganaste! La máquina eligió Papel.");
            } else {
                System.out.println("¡Empate! La máquina eligió Tijera.");
            }
        } else {
            System.out.println("Jugada inválida. Por favor, elige Piedra, Papel o Tijera.");
        }
    }
}

