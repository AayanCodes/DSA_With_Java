public class CharacterOccurrence {

    public static void main(String[] args) {

        String str = "programming";

        boolean[] visited = new boolean[str.length()];

        for (int i = 0; i < str.length(); i++) {

            if (visited[i]) {
                continue;
            }

            char ch = str.charAt(i);
            int count = 0;

            for (int j = i; j < str.length(); j++) {

                if (str.charAt(j) == ch) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(ch + " = " + count);
        }
    }
}


/* OUTPUT :


p = 1
r = 2
o = 1
g = 2
a = 1
m = 2
i = 1
n = 1

  */
