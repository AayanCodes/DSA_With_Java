public class FindMaximum {
  public static void main(String[] args) {
    int[] arr = {50, 23, 43, 67, 90};
    int max = arr[0];

    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }

    System.out.println("Maximum Elements = " + max);
  }
}

        
      
  
