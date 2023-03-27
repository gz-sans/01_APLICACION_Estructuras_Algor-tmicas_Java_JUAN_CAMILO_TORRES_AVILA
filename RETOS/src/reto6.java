import java.util.Scanner;

public class reto6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String palabraSecreta = "papaya";
        String intento = "";
        int intentosRestantes = 3;

        System.out.println("Bienvenido al juego de Adivina la Palabra.");
        System.out.println("Tienes 3 intentos para adivinar la palabra secreta.");
        System.out.println("La palabra secreta tiene " + palabraSecreta.length() + " letras.");

        while (!intento.equalsIgnoreCase(palabraSecreta) && intentosRestantes > 0) {
            System.out.print("Ingresa tu intento: ");
            intento = sc.nextLine();
            intentosRestantes--;

            if (intento.equalsIgnoreCase(palabraSecreta)) {
                System.out.println("¡Felicidades! Adivinaste la palabra secreta.");
            } else if (intentosRestantes > 0) {
                System.out.println("Intento incorrecto. Te quedan " + intentosRestantes + " intentos.");

                // Mostrar pista
                if (intentosRestantes == 2) {
                    System.out.println("Pista: la palabra secreta comienza con la letra " + palabraSecreta.charAt(0));
                } else if (intentosRestantes == 1) {
                    System.out.println("Pista: la palabra secreta termina con la letra " + palabraSecreta.charAt(palabraSecreta.length() - 1));
                }
            } else {
                System.out.println("Lo siento, perdiste. La palabra secreta era " + palabraSecreta + ".");
            }
        }
    }
}
