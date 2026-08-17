public class LongestCommonSuffix {

    public static void main(String[] args) {

        String[] words = {
            "running",
            "jogging",
            "walking"
        };

        String suffix = words[0];

        for (int i = 1; i < words.length; i++) {

            while (!words[i].endsWith(suffix)) {

                suffix = suffix.substring(1);

                if (suffix.isEmpty()) {
                    break;
                }
            }
        }

        System.out.println("Longest Common Suffix = " + suffix);
    }
}

/* OUTPUT :

Longest Common Suffix = ing

  */
