// 832. Flipping an Image

// Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.

// To flip an image horizontally means that each row of the image is reversed.

// For example, flipping [1,1,0] horizontally results in [0,1,1].
// To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.

// For example, inverting [0,1,1] results in [1,0,0].
 

// Example 1:

// Input: image = [[1,1,0],[1,0,1],[0,0,0]]
// Output: [[1,0,0],[0,1,0],[1,1,1]]
// Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
// Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]



public class FlippingImage{
    public static void main(String[] args) {

        int image[][] = new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};

        for(int [] row : image) {
            //swap 
            int left = 0;
            int right = row.length - 1;
            while(left <= right) {
                int temp = row[left];
                row[left] = row[right];
                row[right] = temp;
                left++;
                right--;
            }
            //invert
            
            for(int i = 0; i < row.length; i++) {
                if(row[i] == 1)row[i] = 0;
                else row[i] = 1;
                
            }
        }
       System.out.println("Swap anf Invert the image");
        for(int i = 0; i < image.length; i++) {
            for(int j = 0; j < image[i].length; j++) {
                System.out.print(image[i][j] + " ");
            }
            System.out.println();
        }
       
    }
}


/*  OUTPUT:

Swap anf Invert the image
1 0 0 
0 1 0 
1 1 1 

*/


