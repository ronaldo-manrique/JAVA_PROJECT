import java.util.Scanner;
public class ejercicio_15 {


    public static boolean esCapicua(int numero) {
        String numeroStr = String.valueOf(numero);
        String numeroReverso = new StringBuilder(numeroStr).reverse().toString();
        return numeroStr.equals(numeroReverso);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingresa un número entero: ");
            int numeroUsuario = scanner.nextInt();

            if (esCapicua(numeroUsuario)) {
                System.out.println(numeroUsuario + " es un número capicúa.");
            } else {
                System.out.println(numeroUsuario + " no es un número capicúa.");
            }

        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Debes ingresar un número entero válido.");
        }
        scanner.close();
    }
}


