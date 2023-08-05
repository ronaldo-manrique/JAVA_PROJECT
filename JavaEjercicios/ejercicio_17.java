import java.util.Scanner;

public class ejercicio_17 {
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int inicio = scanner.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int fin = scanner.nextInt();

        System.out.println("Números primos en el rango [" + inicio + ", " + fin + "]:");
        for (int num = inicio; num <= fin; num++) {
            if (esPrimo(num)) {
                System.out.println(num);
            }
        }
    }

    // Función para verificar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        if (numero <= 3) {
            return true;
        }
        if (numero % 2 == 0 || numero % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= numero; i += 6) {
            if (numero % i == 0 || numero % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
  }

