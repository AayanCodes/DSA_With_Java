public class PrintASCII {

    public static void main(String[] args) {

        String str = "ABC";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            System.out.println(ch + " = " + (int) ch);
        }
    }
}
