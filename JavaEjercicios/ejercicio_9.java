import java.util.Scanner;

public class ejercicio_9 {
  public static void main(String[] args) {
    Scanner consola = new Scanner(System.in);

      int num1 = obtenerNumeroEnteroPositivo(consola, "Ingresa el primer número entero: ");

      int resultado = factorial(num1);

      System.out.println(resultado);

  }

  private static int factorial(int numero){

    if(numero == 0 || numero == 1){
      return 1;
    }
      return numero * factorial(numero-1);
    
  }

  private static int obtenerNumeroEnteroPositivo(Scanner consola, String mensaje) {
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
