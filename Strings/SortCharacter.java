import java.util.Arrays;

public class SortCharacters {

    public static void main(String[] args) {

        String str = "dcba";

        char[] arr = str.toCharArray();

        Arrays.sort(arr);

        String result = new String(arr);

        System.out.println("Sorted String = " + result);
    }
}

/*  OUTPUT :

Sorted String = abcd 

  */

