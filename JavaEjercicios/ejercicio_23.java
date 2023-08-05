import java.util.Scanner;

public class ejercicio_23{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese una oración:");
        String oracion = scanner.nextLine();
        
        int cantidadPalabras = contarPalabras(oracion);
        
        System.out.println("La oración contiene " + cantidadPalabras + " palabras.");
    }
    
    public static int contarPalabras(String oracion) {
        String[] palabras = oracion.split("\\s+");
        return palabras.length;
    }
}
