// Print all the values in wave from (Column wise)

Public class MatrixPrintCloumn{
  public static void main(String[] args) {
    int [][] array = new int[][] { {10, 20, 30, 40}, {50, 60, 70, 80}, {90, 11, 22, 44}};

  for (int j = 0; j < array.length; j++) {
    if(j%2 == 0) {
      for(int i = 0; i < array[0].length; i++){
      System.out.println(array[i][j] + " ");
      }
    } else {
      for(int j = array[0].length - 1; j>= 0; j++){
        System.out.println(array[i][j] + " ");
      }
    }
  }
  }
}
    
