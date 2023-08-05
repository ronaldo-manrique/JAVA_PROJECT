

import java.util.Scanner;


public class ejercicio_3{
     public static void main (String[] args) {
        
        Scanner consola = new Scanner(System.in);
        
        double radio = obtenerNumeroDouble(consola, "Ingresa el radio del circulo: ");
        
        area(radio);
        perimetro(radio);
        
  }
     
     private static double obtenerNumeroDouble(Scanner consola, String  mensaje) {

        System.out.print(mensaje);
        while (!consola.hasNextDouble()) {
            System.out.print("Entrada inválida. Ingresa un número valido (decimal): ");
            consola.next();
        }
        return consola.nextDouble();

    }
     private static void area(double radio) {
         double resultado = Math.PI * Math.pow(radio, 2);
        System.out.println("El area del circulo es: " + resultado);
     }
     private static void perimetro(double radio) {
        double resultado = (Math.PI * 2) * radio;
        System.out.println("La resta de los números es: " + resultado);
    }
  
    }
