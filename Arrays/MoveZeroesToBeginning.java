public class MoveZeroesToBeginning {
    
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 3, 4};

        int[] result = new int[arr.length];

        int index = arr.length - 1;

        for(int i = arr.length -1; i >= 0; i--) {

            if (arr[i] != 0) {

                result[index] = arr[i];
                index--;

            }
        }

        System.out.println("Array:");

        for (int num : result) {
            System.out.println(num + " ");
        }
    }
}


/*  OUTPUT :

  0
  0
  1
  2
  3
  4

  */
