public class FirstUniqChar {

    public static void main(String[] args) {
        String str = "aabbcccdefq";
        int len = str.length();
        int[] array = new int[26];

        for (int i = 0; i < len; i++) {
            array[str.charAt(i) - 'a']++;


        }

        for (int i = 0; i < str.length(); i++) {
            if (array[str.charAt(i) - 'a'] == 1) {
                System.out.println(i);
            }

        }
    

    }


}
