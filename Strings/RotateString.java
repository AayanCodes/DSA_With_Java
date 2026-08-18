public class RotateString {

    public static void main(String[] args) {

        String str = "abcdef";

        int k = 2;

        k = k % str.length();

        String rotated = str.substring(k) + str.substring(0, k);

        System.out.println("Orignal String = " + str);

        System.out.println("Rotated String = " + rotated);
        
    }
    
}


/* OUTPUT :

Orignal String = abcdef
Rotated String = cdefab

  */
