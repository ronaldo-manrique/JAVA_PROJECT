import java.util.Scanner;
import java.util.Locale;

public class ejercicio_13{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); 

        
        System.out.print("Ingrese un número decimal: ");
        double numeroDecimal = scanner.nextDouble();

        
        System.out.print("Ingrese la cantidad de decimales a los que desea redondear: ");
        int cantidadDecimales = scanner.nextInt();

        
        double factor = Math.pow(10, cantidadDecimales);
       
        double numeroRedondeado = Math.round(numeroDecimal * factor) / factor;
        
        System.out.println("El número redondeado a " + cantidadDecimales + " decimales es: " + numeroRedondeado);

        scanner.close();
    }
}
