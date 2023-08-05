import java.util.Scanner;
public class ejercicio_22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese una frase: ");
        String input = scanner.nextLine();
        
        if (esPalindromo(input)) {
            System.out.println("La frase es un palíndromo.");
        } else {
            System.out.println("La frase no es un palíndromo.");
        }
        
        scanner.close();
    }
    
    public static boolean esPalindromo(String str) {
        str = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
        int i = 0;
        int j = str.length() - 1;
        
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}


