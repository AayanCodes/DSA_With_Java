public class CountCharacters {
    
    public static void main(String[] args) {

        String str = "MohdAayan@123";

        int alphabetCount = 0;
        int digitCount = 0;
        int special = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if( Character.isLetter(ch)) {
                alphabetCount++;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            } else {
                special++;
            }

            
        }

        System.out.println("Alphabets = " + alphabetCount);
        System.out.println("Digits = " + digitCount);       
        System.out.println("Special Characters = " + special);
    }
}

/*  OUTPUT :

  Alphabets = 9
  Digits = 3
  Special Character =1

  */
