public class SortedArray {
    public static void main(String[] args) {
        int[] arr = {12, 23, 34, 45, 65, 35, 75, 44};
        boolean isSorted = true;

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;

            }
        }

        if (isSorted) {

            System.out.println("Array is Sorted.");
        }
         else {
            System.out.println("Array is Not Sorted.");
        
        }
    }
}
