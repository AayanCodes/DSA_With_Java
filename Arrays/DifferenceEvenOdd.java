public class DifferenceEvenOdd {

    public static void main(String[] args) {

        int arr[] = {10, 25, 30, 35, 45, 50};

        int even = 0;
        int odd = 0;

        for( int i = 0; i < arr.length; i++) {

            if (arr[i] % 2== 0) {

                even += arr[i];

            } else {
                odd += arr[i];

            }

            }
            System.out.println("Sum of Even Numbers: " + even);

            System.out.println("Sum of the Odd Numbers: " + odd);
        }
}

/* OUTPUT :

Sum of Even Numbers: 90
Sum of the Odd Numbers: 105

  */


