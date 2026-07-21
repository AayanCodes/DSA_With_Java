public class FindMinimum {
  public static void main(String[] args) {
    int[] arr = {15, 40, 7, 89, 23};

    int min = arr[0];

    for (int i =1; i < arr.length; i++) {
      if (arr[i] < min) {
        min = arr[i];
      
      }
    
    }
    System.out.println("Minimum Element = " + min);
  
  }

}
