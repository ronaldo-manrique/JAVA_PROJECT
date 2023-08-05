import java.util.Scanner;

public class ejercicio_11 {
  public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la longitud del primer lado: ");
        double lado1 = scanner.nextDouble();
        
        System.out.println("Ingrese la longitud del segundo lado: ");
        double lado2 = scanner.nextDouble();
        
        System.out.println("Ingrese la longitud del tercer lado: ");
        double lado3 = scanner.nextDouble();
        
        double semiperimetro = (lado1 + lado2 + lado3) / 2;
        
        double area = Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
        
        System.out.println("El área del triángulo es: " + area);
        scanner.close();
    }
  }

