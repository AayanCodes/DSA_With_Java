public class FindFrequencyOfElement {
    public static void main(String[] args) {
        
        int[] arr = {30, 65, 30, 54, 30, 85, 30};
        int key = 30;
        int count = 1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == key) {
                count++;

            }
        }

        System.out.println("Frequency of " + key + " is: " + count);

    }
    
}



/*  OUTPUT: 
    Frequency of 30 is: 5

*/
