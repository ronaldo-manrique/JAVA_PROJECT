import java.util.Arrays;
import java.util.Scanner;


public class ejercicio_27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa una frase:");
        String frase = scanner.nextLine();
        
        String[] palabras = frase.split(" ");
        Arrays.sort(palabras);
        
        System.out.println("Palabras ordenadas alfabéticamente:");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
        
        scanner.close();
    }
}


