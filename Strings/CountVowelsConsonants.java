public class CountVowelsConsonants {

    public static void main(String[] args) {

        String str = "Programming".toLowerCase();

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }

            }

        }

        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);

    }
}

/* OUTPUT :

Vowels: 3
Consonants: 8

  */
