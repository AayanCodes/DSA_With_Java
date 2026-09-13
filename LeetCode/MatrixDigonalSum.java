public class MatrixDigonalSum  {
  public static void main(String[] args) {
    int arr[][] = {{2, 4, -1,}, {-10, 5, 11}, {18, -7, 6}};
    int transpose[][] =new int [3][3];

  for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++){
      treanspose[i][j] = arr[j][i];
    }
  }
     System.out.println("Original Matrix: ");
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++){
        System.out.println(arr[i][j] + " ") 
          }
      System.out.println();
  }

  System.out.println("Transposed Matrix: ");
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++){
        System.out.println(transpose[i][j] + " ") 
          }
      System.out.println();

    }

  }

}


/*  Output :

Original Matrix:
2 4 -1 
-10 5 11 
18 -7 6 
Transposed Matrix:
2 -10 18 
4 5 -7 
-1 11 6 
       */
