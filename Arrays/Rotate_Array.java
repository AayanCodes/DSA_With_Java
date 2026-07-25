public class Rotate_Array {
  public static void main(Stings[] args ) {
    int[] arr = {10, 20, 30, 40, 50};

  int  first = [0];

  for (int i = 0; i < arr.length - 1; i++) {
    arr[i] = arr[i + 1];
  }
    arr[arr.length - 1] = first;
    System.out.println("Left Rotated Array: " );

  for (int i = 0; i < arr.length, i++) {
    System.out.println(arr[i] + " ");
  }
 
  }

}

/* OUTPUT: 

Left Rotated Array:
  20
  30
  40
  50
  10
        */
