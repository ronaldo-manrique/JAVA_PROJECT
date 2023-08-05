import java.util.Scanner;

public class ejercicio_6 {
  public static void main(String[] args) {
    Scanner consola = new Scanner(System.in);

    int num1 = obtenerNumeroEntero(consola, "Ingresa el primer número entero: ");

    mayorMenor(num1);

  }

  private static int obtenerNumeroEntero(Scanner consola, String mensaje) {
    System.out.print(mensaje);
    while (!consola.hasNextInt()) {
      System.out.print("Entrada inválida. Ingresa un número entero: ");
      consola.next();
    }
    return consola.nextInt();

  }

  private static void mayorMenor(int num1) {

    if (num1 == 0) {
      System.out.println("los numero es cero");
    } else if (num1 < 0) {
      System.out.println("el numero es negativo");
    } else {
      System.out.println("numero es positivo");
    }

  }

}