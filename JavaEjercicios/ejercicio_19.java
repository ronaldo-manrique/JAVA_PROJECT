import java.util.Scanner;
public class ejercicio_19 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        String nombreMayusculas = nombre.toUpperCase();
        String nombreMinusculas = nombre.toLowerCase();

        System.out.println("Nombre en mayúsculas: " + nombreMayusculas);
        System.out.println("Nombre en minúsculas: " + nombreMinusculas);

        scanner.close();
    }
}


