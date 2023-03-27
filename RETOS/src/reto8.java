import java.util.Random;
import java.util.Scanner;

public class reto9 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        
        int jugador1 = 3; //Vidas del jugador 1
        int jugador2 = 3; //Vidas del jugador 2
        
        System.out.println("Bienvenido al juego de dados!");
        System.out.println("Cada jugador tiene 3 vidas.");
        System.out.println("El juego termina cuando uno de los jugadores pierde todas sus vidas.");
        
        while(jugador1 > 0 && jugador2 > 0) { //Mientras ambos jugadores tengan vidas
            
            System.out.println("Turno del jugador 1.");
            System.out.println("Presiona Enter para lanzar el dado.");
            sc.nextLine(); //Espera a que el jugador presione Enter
            
            int dado1 = r.nextInt(6) + 1; //Lanzamiento del dado del jugador 1
            System.out.println("El jugador 1 ha sacado un " + dado1);
            
            System.out.println("Turno del jugador 2.");
            System.out.println("Presiona Enter para lanzar el dado.");
            sc.nextLine(); //Espera a que el jugador presione Enter
            
            int dado2 = r.nextInt(6) + 1; //Lanzamiento del dado del jugador 2
            System.out.println("El jugador 2 ha sacado un " + dado2);
            
            //Compara los resultados de los lanzamientos y resta una vida al perdedor
            if(dado1 > dado2) {
                jugador2--;
                System.out.println("El jugador 1 gana! El jugador 2 pierde una vida.");
            }
            else if(dado2 > dado1) {
                jugador1--;
                System.out.println("El jugador 2 gana! El jugador 1 pierde una vida.");
            }
            else {
                System.out.println("Empate!");
            }
            
            //Muestra las vidas restantes de ambos jugadores
            System.out.println("El jugador 1 tiene " + jugador1 + " vidas restantes.");
            System.out.println("El jugador 2 tiene " + jugador2 + " vidas restantes.");
            System.out.println();
        }
        
        //Muestra el resultado final del juego
        if(jugador1 == 0) {
            System.out.println("El jugador 2 gana!");
        }
        else {
            System.out.println("El jugador 1 gana!");
        }
    }
}
