import java.util.Random;

public class ejercicio_18{

    public static void main(String[] args) {
        String contrasena = generarContrasena(8);
        System.out.println("Contraseña generada: " + contrasena);
    }

    public static String generarContrasena(int longitud) {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder contrasena = new StringBuilder();

        Random random = new Random();
        for (int i = 0; i < longitud; i++) {
            int index = random.nextInt(caracteres.length());
            contrasena.append(caracteres.charAt(index));
        }

        return contrasena.toString();
    }
}
