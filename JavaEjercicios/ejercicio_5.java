import java.util.Scanner;

public class ejercicio_5 {
  public static void main(String[] args) {
    Scanner consola = new Scanner(System.in);

    int num1 = obtenerNumeroEntero(consola, "Ingresa el primer número entero: ");
    int num2 = obtenerNumeroEntero(consola, "Ingresa el segundo número entero: ");

    mayorMenor(num1, num2);

  }

  private static int obtenerNumeroEntero(Scanner consola, String mensaje) {
    System.out.print(mensaje);
    while (!consola.hasNextInt()) {
      System.out.print("Entrada inválida. Ingresa un número entero: ");
      consola.next();
    }
    return consola.nextInt();

  }

  private static void mayorMenor(int num1, int num2) {
    if (num1 == num2) {
      System.out.println("los numeros son iguales");
    } else if (num1 < num2) {
      System.out.println("numero " + num2 + " es mayor que el " + num1);
    } else {
      System.out.println("numero " + num1 + " es mayor que el " + num2);
    }
  }

}