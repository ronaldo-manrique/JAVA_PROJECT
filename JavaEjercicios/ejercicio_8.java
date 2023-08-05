import java.util.Scanner;

public class ejercicio_8 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        int numero = (int) (Math.random() * 10 + 1);
        System.out.println("Número a adivinar: " + numero);

        while (true) {
            int ingreso = obtenerNumeroEntero(consola, "Ingresa un número entero positivo: ");

             if (ingreso < numero) {
                System.out.println("Tu número es menor.");

            } else if (ingreso > numero) {
                System.out.println("Tu número es mayor.");

            } else {
                System.out.println("LO ENCONTRASTE");
                break;
            }
        }
        consola.close();
    }

    private static int obtenerNumeroEntero(Scanner consola, String mensaje) {
        int numero;
        while (true) {
            System.out.print(mensaje);

            while (!consola.hasNextInt()) {
                System.out.print("Entrada inválida. Ingresa un número entero: ");
                consola.next();
            }
            numero = consola.nextInt();
          
            if (numero >= 0) {
                break;
            } else {
                System.out.print("No puedes ingresar números negativos. Intenta nuevamente ");
            }
        } 
        return numero;
    }
}
