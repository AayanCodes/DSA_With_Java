public class MoveZeroesToEnd {
    public static void main(String[] args) {
        
        int[] arr = {0, 1, 2, 3, 14};
        int index = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                arr[index] = arr[i];

            }
        }

        System.out.println("Array: ");

        for (int num : arr) {

            System.out.println(num + " ");
            
        }
    }
}


/*  OUTPUT :

Array:
 14
  1
  2
  3
  14

  */
