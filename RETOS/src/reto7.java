import java.util.Scanner;

public class reto7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido al formulario de registro de usuario.");
        System.out.print("Por favor, ingrese su nombre completo: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese su dirección de correo electrónico: ");
        String correo = sc.nextLine();

        System.out.print("Ingrese una contraseña: ");
        String contrasena = sc.nextLine();

        System.out.print("Confirme su contraseña: ");
        String confirmacionContrasena = sc.nextLine();

        if (contrasena.equals(confirmacionContrasena)) {
            System.out.println("¡Registro exitoso!");
            System.out.println("Nombre: " + nombre);
            System.out.println("Correo electrónico: " + correo);
        } else {
            System.out.println("Las contraseñas no coinciden. Por favor, inténtelo de nuevo.");
        }
    }
}
