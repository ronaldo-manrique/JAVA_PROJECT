import java.util.Scanner;

public class ejercicio_1 {

    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);

        int num1 = obtenerNumeroEntero(consola, "Ingresa el primer número entero: ");
        int num2 = obtenerNumeroEntero(consola, "Ingresa el segundo número entero: ");

        suma(num1, num2);
        resta(num1, num2);
        multi(num1, num2);
        divi(num1, num2);

        consola.close();
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

    private static void suma(int num1, int num2) {
        int resultado = num1 + num2;
        System.out.println("La suma de los números es: " + resultado);
    }

    private static void resta(int num1, int num2) {
        int resultado = num1 - num2;
        System.out.println("La resta de los números es: " + resultado);
    }

    private static void multi(int num1, int num2) {
        int resultado = num1 * num2;
        System.out.println("La multiplicacion de los números es: " + resultado);
    }

    private static void divi(int num1, int num2) {

        if (num1 <= 0 || num2 <= 0) {
            System.out.println("no se puede dividir por:0");
        } else {
            int resultado = num1 / num2;
            System.out.println("La suma de los números es: " + resultado);
        }
    }
}
