import java.util.Scanner;

public class reto2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("buenas tardes porfavor Ingrese el peso del bebé en kilogramos: ");
        double peso = sc.nextDouble();
        System.out.println("gracias por la informacion anterior pero ahora porfavor ponga Ingrese la edad del bebé en meses: ");
        int edad = sc.nextInt();
        double dosisVacuna = (peso + 10) / (edad * 10) * 8;
        System.out.println("La dosis de vacuna a aplicar es: " + dosisVacuna + " ml.");
    }
}
