import java.util.HashSet;
import java.util.Set;

public class program1 {

    public static void main(String[] argus) {


        String str = "abfWT%^*9997abz";

        String output = "";

        Set<Character> se = new HashSet();

        char[] c = str.toCharArray();

        for (char cc : c) {

            if (cc >= 'a' && cc <= 'z') {

                se.add(cc);

            }
        }

        System.out.println(se);

        for (char ccc : se) {

            output = output + ccc;

        }

        System.out.println(output);


    }
}