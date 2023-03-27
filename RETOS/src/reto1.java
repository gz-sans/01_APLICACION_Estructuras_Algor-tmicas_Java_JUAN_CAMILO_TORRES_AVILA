import java.util.Scanner;

public class reto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la temperatura en grados Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        double celsius = (fahrenheit - 32) / 1.8;
        System.out.println("La temperatura en grados Celsius es: " + celsius);
    }
}
