public class LongestPalindromicSubstring {

    public static void main(String[] args) {

        String str = "babad";

        String longest = "";

        for (int i = 0; i < str.length(); i++) {

            for (int j = i + 1; j <= str.length(); j++) {

                String current = str.substring(i, j);

                if (isPalindrome(current) && current.length() > longest.length()) {
                    longest = current;
                }
            }
        }

        System.out.println("Longest Palindromic Substring = " + longest);
    }

    static boolean isPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {

            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}

/*  OUTPUT:

Longest Palindromic Substring = bab

  */
