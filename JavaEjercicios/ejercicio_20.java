import java.util.Scanner;
public class ejercicio_20 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una cadena: ");
        String cadena = scanner.nextLine();

        String cadenaInvertida = invertirCadena(cadena);

        System.out.println("Cadena invertida: " + cadenaInvertida);
    }

    public static String invertirCadena(String cadena) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = cadena.length() - 1; i >= 0; i--) {
            stringBuilder.append(cadena.charAt(i));
        }
        return stringBuilder.toString();
    }
}


