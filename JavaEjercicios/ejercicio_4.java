import java.util.Scanner;

public class ejercicio_4 { 

  public static void main(String[] args) {

    Scanner consola = new Scanner(System.in);

    int numero;
    
    while(true) {
        System.out.println("Ingresa un número entero positivo:");
        
        if (consola.hasNextInt()) {          
            numero = consola.nextInt();
            if (numero > 0 && numero <= 100) {
                break;
            } else {
                System.out.println("Por favor, ingresa un número entero positivo.");
            }
        } else {
            System.out.println("Por favor, ingresa un número entero válido.");
            consola.next(); // Descarta la entrada no válida
        }
    }      
    
    if(numero>=18){
      System.out.println("mayor de edad");
    }else{
      System.out.println("menor de edad");
    }
    consola.close();
}
}
