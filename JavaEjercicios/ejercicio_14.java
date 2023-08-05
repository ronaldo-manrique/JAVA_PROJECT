import java.util.Scanner;
public class ejercicio_14 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        System.out.print("Ingrese un número entero positivo: ");
        int numero = scanner.nextInt();
        
        if (esNumeroPerfecto(numero)) {
            System.out.println(numero + " es un número perfecto.");
        } else {
            System.out.println(numero + " no es un número perfecto.");
        }
        
        scanner.close();
    }
    
    public static boolean esNumeroPerfecto(int num) {
        if (num <= 1) {
            return false;
        }
        
        int sumaDivisores = 1;  // Empezamos con 1 porque todo número es divisible por 1
        
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                sumaDivisores += i;
            }
        }
        
        return sumaDivisores == num;
    }
}


