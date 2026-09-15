public class SelectionSort{
  public static void main(String[] args ) {
    int array[] = {0, 5, 4, 3, 2, 1};
    int arr_len = array.length;

  for(int i = 0; i < array,length; i++) {
    Object min = array[i];
    int min_idx = i;

    for (int j = i + 1; j < array.length; j++) {
      if (array[j] < (Integer) min) {
        min = array[j];
        min_idx = j;
      }
    }

    //Swap the found minimum element with the first element 

    array[min_idx] = array[i];
    array[i] = (Integer) min;
  }
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i] + " ");
    }

  }

}


//OUTPUT :
// 0 1 2 3 4 5 
