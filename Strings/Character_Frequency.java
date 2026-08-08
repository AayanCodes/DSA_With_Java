public class CharacterFrequency {

    public static void main(String[] args) {

        String str = "programming";
        char key = 'g';

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == key) {
                count++;
            }
        }

        System.out.println("Frequency of '" + key + "' = " + count);
    }
}


/* OUTPUT :

Frequency of 'g' = 2

  */

