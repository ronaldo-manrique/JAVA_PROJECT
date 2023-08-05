

import java.util.Scanner;

public class Ejercicio_2{
    public static void main (String[] args) {
        
        Scanner consola = new Scanner(System.in);
        int num1 = obtenerNumeroEntero(consola, "Ingrese un numero entero: ");
        
        if (num1 %2 == 0){
            
            System.out.println("El numero ingresado al sistema es par = " + num1);         
        }
        else{
            System.out.println("El numero ingresado al sistema es impar = " + num1);   
        }
}
    
private static int obtenerNumeroEntero(Scanner consola, String  mensaje) {

        System.out.print(mensaje);
        while (!consola.hasNextInt()) {
            System.out.print("Entrada inválida. Ingresa un número entero: ");
            consola.next();
        }
        return consola.nextInt();
}
}
