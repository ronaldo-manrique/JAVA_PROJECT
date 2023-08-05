import java.util.Scanner;

public class ejercicio_12{
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int numero = obtenerNumeroEntero(consola,"ingresa un numero entero: "); 

        if (esPrimo(numero)) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }
    }

    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }
    private static int obtenerNumeroEntero(Scanner consola, String mensaje) {
        System.out.print(mensaje);

        while (!consola.hasNextInt()) {
            System.out.println(consola.next());
            System.out.print("Entrada inválida. Ingresa un número entero: ");

            consola.next();
        }

        return consola.nextInt();

    }
}
