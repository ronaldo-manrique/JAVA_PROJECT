import java.util.Scanner;

public class ejercicio_7 {
  public static void main(String[] args) {
    Scanner consola = new Scanner(System.in);

    int num = obtenerNumeroEntero(consola,"ingrese un numero entero: ");   

    for(int i=1; i<=10; i++ ){
      System.out.println(num+"*"+i+"="+(num*i));
    }

  }

  private static int obtenerNumeroEntero(Scanner consola, String mensaje) {
    System.out.print(mensaje);
    while (!consola.hasNextInt()) {
      System.out.print("Entrada inválida. Ingresa un número entero: ");
      consola.next();
    }
    return consola.nextInt();

  }

}
