public class ejercicio_29 {
  
    public static void main(String[] args) {
        int[] arreglo = {5, 10, 3, 8, 15, 20, 7};
        int maximo = encontrarNumeroMasGrande(arreglo);
        System.out.println("El número más grande en el arreglo es: " + maximo);
    }
    
    public static int encontrarNumeroMasGrande(int[] arreglo) {
        if (arreglo.length == 0) {
            throw new IllegalArgumentException("El arreglo no puede estar vacío");
        }
        
        int maximo = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > maximo) {
                maximo = arreglo[i];
            }
        }
        return maximo;
    }
}


