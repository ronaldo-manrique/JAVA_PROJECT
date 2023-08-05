import java.util.Scanner;

public class ejercicio_16 {
  public static void main(String[] args) {
    Scanner consola = new Scanner(System.in);
    int n =obtenerNumeroEntero(consola, "ingresa un numero: "); 
    
    int[] fibonacciArray = new int[n];
      
    //[ 0,1,1,2, , , , ]  

    fibonacciArray[0] = 0;
    fibonacciArray[1] = 1;

    for (int i = 2; i < n; i++) {
        fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
    }

    System.out.println("Los primeros " + n + " números de Fibonacci son:");
    for (int num : fibonacciArray) {
        System.out.print(num + " ");
    }
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
