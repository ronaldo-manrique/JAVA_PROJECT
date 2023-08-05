

public class ejercicio_10 {
  public static void main(String[] args) {
    
     
    
    int n =20; 
    
    int[] fibonacciArray = new int[n];
      
    //[ 0,1,1,2, , , , ]  

    fibonacciArray[0] = 0;
    fibonacciArray[1] = 1;

    for (int i = 2; i < n; i++) {
        fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
    }

    System.out.println("Los primeros " + n + " números de Fibonacci son:");
    for (int num : fibonacciArray) {
        System.out.print(num + " ");
    }

  }
  
  
}
