import java.util.Scanner;

public class ejercicio_26{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una cadena: ");
        String cadena = scanner.nextLine();

        int contador = 0;

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) != ' ') {
                contador++;
            }
        }

        System.out.println("La cadena tiene " + contador + " caracteres sin contar los espacios en blanco.");

        scanner.close();
    }
}


