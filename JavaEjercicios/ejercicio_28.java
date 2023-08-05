public class ejercicio_28 {
  

    public static void main(String[] args) {
        int[] arreglo = { 5, 10, 15, 20, 25 };
        int suma = calcularSuma(arreglo);
        System.out.println("La suma de los elementos en el arreglo es: " + suma);
    }

    public static int calcularSuma(int[] arreglo) {
        int suma = 0;
        for (int elemento : arreglo) {
            suma += elemento;
        }
        return suma;
    }
}


