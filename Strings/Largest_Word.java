public class Largest_Word {

    public static void main(String[] args) {

        String str = "Java programming is very interesting";

        String[] words = str.split(" ");

        String largest = "";

        for(String word : words) {

            if(word.length() > largest.length()) {
                largest = word;
            }
        }
        System.out.println("Largest Word = " + largest);

    }
}


/*  OUTPUT :

Largest Word = programming

  */
