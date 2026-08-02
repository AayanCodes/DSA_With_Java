public class PalidromeString {
    public static void main(String[] args) {

        String str = "nayaa dhom";

        String reverse =" ";

        for (int i = str.length() -1; i >= 0; i--) {

            reverse = reverse + str.charAt(i);


        }

        if (str.equals(reverse)) {

            System.out.println("Palindrome");


        } else {

            System.out.println("Not Palindrome");
        }
    }
}


/*  Output :

Not Palidrome

  */
