public class Linear_Search {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int key = 30;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == key) {
                System.out.println("Element found at index: " + i);

                found = true;

            }



            if (!found) {
                System.out.println("Element not found. ");
            }
        }
    }
}


/*  OUTPUT:

Element not found.
Element not found.
Element not found. 2 

  */
