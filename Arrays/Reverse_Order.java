public class Reverse_Order {
    public static void main(String[] args) {
      
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        
        System.out.println("Original Array: ");

        for (int i = arr.length -1; i >= 0; i--) {
            
            System.out.print(arr[i] + " ");

        }
    }
}


/*   OUTPUT:

Original Array: 70, 60, 50, 40, 30, 20, 10 
  */
