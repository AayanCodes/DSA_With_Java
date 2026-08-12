public class RemovesVowels {

    public static void main(String[] args) {

        String str = "Java Programming";

        StringBuilder result = new StringBuilder();

        for(int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' && ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U') {
                result.append(ch);
            }
        }

        System.out.println("String after removing vowels: " + result.toString());
    }
}


/* OUTPUT :
After Removing Vowels = Jv Prgrmmng

  */
