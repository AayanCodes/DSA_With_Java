public class Remove_Dublicate_Array {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 10, 20, };

        int j = 0;
        
        for (int i = 1; i < arr.length; i++) {

            if(arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }


        }
        System.out.println("Array after removing dupplicates: ");

        for(int i = 0; i <= j; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}


/*  OUTPUT :

Array after removing duplicates:
  10
  20
  30
  40
  50
  10
  20

  */
