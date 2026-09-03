// 1941. Check if All Characters Have Equal Number of Occurrences

// iven a string s, return true if s is a good string, or false otherwise.

// A string s is good if all the characters that appear in s have the same number of occurrences (i.e., the same frequency).

 

// Example 1:

// Input: s = "abacbc"
// Output: true
// Explanation: The characters that appear in s are 'a', 'b', and 'c'. All characters occur 2 times in s.
// Example 2:

// Input: s = "aaabb"
// Output: false
// Explanation: The characters that appear in s are 'a' and 'b'.
// 'a' occurs 3 times while 'b' occurs 2 times, which is not the same number of times.


public class EqualCharacterOccurence {

    public static void main(String[] args) {

        String s = "helloo";

        int s_len = s.length();
        boolean b = false;
        int[] array = new int[26];

        for (char ch : s.toCharArray()) {
            array[ch - 'a']++;
        }

        int count = array[s.charAt(0)-'a'];



        for (int i = 0; i < 26; i++) {
            if (array[i] == 0 && array[i] == count) {
                b = true;
            } else {
                b = false;
                break;
            }
            
            
        }
        return b;
    }
}
