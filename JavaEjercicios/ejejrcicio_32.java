public class ejejrcicio_32 {
  

    public static int buscarNumero(int[] arreglo, int numeroBuscado) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == numeroBuscado) {
                return i;  // Se encontró el número, se devuelve su índice
            }
        }
        return -1;  // El número no se encontró en el arreglo
    }

    public static void main(String[] args) {
        int[] arreglo = { 12, 45, 7, 23, 9, 4, 18, 37 };
        int numeroBuscado = 5;

        int indice = buscarNumero(arreglo, numeroBuscado);

        if (indice != -1) {
            System.out.println("El número " + numeroBuscado + " se encuentra en el índice " + indice);
        } else {
            System.out.println("El número " + numeroBuscado + " no se encuentra en el arreglo.");
        }
    }
}


