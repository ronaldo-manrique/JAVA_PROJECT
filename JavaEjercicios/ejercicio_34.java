import java.util.Arrays;

public class ejercicio_34 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int positions = 2; // Cantidad de posiciones a rotar
        
        System.out.println("Arreglo original: " + Arrays.toString(arr));
        
        // Rota hacia la izquierda
        rotateLeft(arr, positions);
        System.out.println("Arreglo rotado hacia la izquierda: " + Arrays.toString(arr));
        
        // Rota hacia la derecha
        rotateRight(arr, positions);
        System.out.println("Arreglo rotado hacia la derecha: " + Arrays.toString(arr));
    }
    
    public static void rotateLeft(int[] arr, int positions) {
        int length = arr.length;
        positions = positions % length; // Maneja rotaciones mayores que el tamaño del arreglo
        
        int[] temp = new int[positions];
        for (int i = 0; i < positions; i++) {
            temp[i] = arr[i];
        }
        
        for (int i = 0; i < length - positions; i++) {
            arr[i] = arr[i + positions];
        }
        
        for (int i = 0; i < positions; i++) {
            arr[length - positions + i] = temp[i];
        }
    }
    
    public static void rotateRight(int[] arr, int positions) {
        int length = arr.length;
        positions = positions % length; // Maneja rotaciones mayores que el tamaño del arreglo
        
        int[] temp = new int[positions];
        for (int i = 0; i < positions; i++) {
            temp[i] = arr[length - positions + i];
        }
        
        for (int i = length - positions - 1; i >= 0; i--) {
            arr[i + positions] = arr[i];
        }
        
        for (int i = 0; i < positions; i++) {
            arr[i] = temp[i];
        }
    }
}


