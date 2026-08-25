public class MissingNumberInRange {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 5};
        int n = 5;
        int total = n * (n + 1) / 2;
        int sum = 0;

        for( int i = 0; i < nums.length; i++) {

            sum += nums[i];
        }

        int missingNumber = total - sum; 
        System.out.println("The missing number is: " + missingNumber);

    }
    
}


/* OUTPUT  :

The missing number is: 4

*/
