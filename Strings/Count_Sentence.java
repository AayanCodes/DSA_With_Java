public class Count_Sentence {

    public static void main(String[] args) {

        String str = "My name is Mohd Aayan";

        String[] words = str .trim().split("\\s+");

        System.out .println("Total number of the words in the sentence = " + words.length);
        
    }
    
}


/*  OUTPUT :

Total number of thewords in the sentencce = 5

  */
