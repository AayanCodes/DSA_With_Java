public class RemoveExtraSpaces {

    public static void main(String[] args) {

        String str = "Mohd   Aayan   Malik";

        String result = str.trim().replaceAll("\\s+", " ");

        System.out.println("Original = " + str);
        System.out.println("Updated = " + result);
    }
}

/*  OUTPUT :

Orignal = Mohd   Aayan   Malik
Updated = Mohd Aayan Malik

  */
