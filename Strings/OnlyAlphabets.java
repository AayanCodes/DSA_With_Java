public class OnlyAlphabets {

    public static void main(String[] srgs) {

        String str = "JavaProgramming";

        boolean isAlphabet = true;

        for(int i = 0; i < str.length(); i++) {

            if (!Character.isLetter(str.charAt(i))) {

                isAlphabet = false;
                break;


            }
        }

        if (isAlphabet) {

            System.out.println("String conatins only alphabets. ");
        } else {

            System.out.println("String does not contain only alphabets.");
        }
       
    }
}

/*  OUTPUT :

String contains only alphabets. 

  */
