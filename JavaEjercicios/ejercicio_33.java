import java.util.HashMap;
import java.util.Map;

public class ejercicio_33 {


    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 2, 3, 1, 4, 5, 2, 4};

        Map<Integer, Integer> frecuencia = contarFrecuencia(arreglo);

        for (Map.Entry<Integer, Integer> entry : frecuencia.entrySet()) {
            System.out.println("Elemento: " + entry.getKey() + ", Frecuencia: " + entry.getValue());
        }
    }

    public static Map<Integer, Integer> contarFrecuencia(int[] arreglo) {
        Map<Integer, Integer> frecuencia = new HashMap<>();

        for (int elemento : arreglo) {
            frecuencia.put(elemento, frecuencia.getOrDefault(elemento, 0) + 1);
        }

        return frecuencia;
    }
}


