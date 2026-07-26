public class Swap_Last_FirstElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        int first = arr[0];
        int last = arr[arr.length - 1];

        arr[0] = last;
        arr[arr.length - 1] = first; 

         System.out.println("Array after swapping first and last elements: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}


/*   OUTPUT :

Array after swapping first and last elements:
50 20 30 40 10

  */
