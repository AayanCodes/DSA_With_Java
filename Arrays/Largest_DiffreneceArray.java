public class Largest_DiffreneceArray {
  public static void main(String[] args) {
    int[] arr = { 64, 34, 23, 42, 55, 45, 53, 92};
    
    int max = arr[0];
    int min = arr[0];

  for (int i = 0; i < arr.length; i++) {
    if (arr[i] > max) {
      max = arr[i];
    }

    if (arr[i] < min) {
      min = arr[i];

    }

  }
    int difference = max - min;

  System.out.println("Largest Difference = " + difference);

  }

}



/* OUTPUT :

Largest Diffrenece = 69

  */
