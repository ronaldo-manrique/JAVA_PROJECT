import java.util.Arrays;
import java.util.HashSet;


public class ejercicio_30 {
    public static void main(String[] args) {
        int[] arregloConDuplicados = {1, 2, 3, 4, 1, 2, 5, 6, 3, 7};

        int[] arregloSinDuplicados = eliminarDuplicados(arregloConDuplicados);

        System.out.println("Arreglo original: " + Arrays.toString(arregloConDuplicados));
        System.out.println("Arreglo sin duplicados: " + Arrays.toString(arregloSinDuplicados));
    }

    public static int[] eliminarDuplicados(int[] arreglo) {
        HashSet<Integer> set = new HashSet<>();
        for (int elemento : arreglo) {
            set.add(elemento);
        }

        int[] resultado = new int[set.size()];
        int indice = 0;
        for (int elemento : set) {
            resultado[indice] = elemento;
            indice++;
        }

        return resultado;
    }
}


