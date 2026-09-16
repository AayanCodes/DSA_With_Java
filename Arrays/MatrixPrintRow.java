// print the all values in wave form (row wise)
public class MatrixPrintRow {
  public static void main(String[] args ) {
    int [][] array = new int [][] {{0, 1, 2, 3}, {10, 20, 30, 40}, {50, 60, 70, 80} };

  for (int i = 0; i <array.length; i++) {
      if(i%2 ==0) {
        System.out.println(array[i][j] + " ");
      }
  } else {
    for(int j <array[0].length - 1; j >= 0; j++){
      System.out.println(array[i][j] + " ");
    }
  }
  }
  }
}

//OUTPUT :
// 0 1 2 3 44 33 22 12 21 34 56 44 
    
      
      
