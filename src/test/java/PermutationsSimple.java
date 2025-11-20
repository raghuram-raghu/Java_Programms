
    public class PermutationsSimple {

        public static void main(String[] args) {
            permute("abc", "");
        }

        public static void permute(String s, String res) {

            if (s.isEmpty()) {
                System.out.println(res);

            }

            for (int i = 0; i < s.length(); i++) {

                // pick the character
                char ch = s.charAt(i);

                // remove the character from the string
                String remaining = s.substring(0, i) + s.substring(i + 1);

                // recursive call
                permute(remaining, res + ch);
            }
        }
    }


