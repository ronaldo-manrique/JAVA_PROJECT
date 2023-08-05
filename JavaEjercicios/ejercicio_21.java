import java.util.Scanner;
public class ejercicio_21 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una cadena de texto: ");
        String cadena = scanner.nextLine();

        System.out.print("Ingresa la letra que deseas contar: ");
        char letra = scanner.next().charAt(0);

        int contador = contarLetra(cadena, letra);
        System.out.println("La letra '" + letra + "' aparece " + contador + " veces en la cadena.");
    }

    public static int contarLetra(String cadena, char letra) {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == letra) {
                contador++;
            }
        }
        return contador;
    }
}


