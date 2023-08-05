import java.util.Scanner;
public class ejercicio_24 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una cadena de texto: ");
        String cadena = scanner.nextLine();

        System.out.print("Ingresa la letra que deseas reemplazar: ");
        char letraAntigua = scanner.nextLine().charAt(0);

        System.out.print("Ingresa la nueva letra: ");
        char letraNueva = scanner.nextLine().charAt(0);

        String cadenaModificada = reemplazarLetra(cadena, letraAntigua, letraNueva);

        System.out.println("Cadena original: " + cadena);
        System.out.println("Cadena modificada: " + cadenaModificada);

        scanner.close();
    }

    public static String reemplazarLetra(String cadena, char letraAntigua, char letraNueva) {
        return cadena.replace(letraAntigua, letraNueva);
    }
}


