public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {

        String str = "aabbcdde";

        char result = '\0';

        for (int i = 0; i < str.length(); i++) {

            char current = str.charAt(i);

            int count = 0;

            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(j) == current) {
                    count++;
                }
            }

            if (count == 1) {
                result = current;
                break;
            }
        }

        if (result != '\0') {
            System.out.println("First Non-Repeating Character = " + result);
        } else {
            System.out.println("No Non-Repeating Character Found");
        }
    }
}
