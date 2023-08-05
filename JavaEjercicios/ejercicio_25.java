import java.util.Scanner;
public class ejercicio_25 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa una frase:");
        String frase = scanner.nextLine();

        String[] palabras = frase.split(" ");

        System.out.println("Palabras separadas:");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }
}


