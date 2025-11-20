import java.util.Arrays;
import java.time.Duration;
import java.util.*;
import java.util.Arrays;

public class Anagrams {


        public static void main(String[] argus) {


            String str[] = {"7t&^%FGGHJy8", "iuPOI)(*&y98", "9uiASD@#$8"};

            int arr[] = {7, 6, 8, 2, 3, 2, 8, 7, 8};
            String s1 = "listen";
            String s2 = "silent";

            char[] c1 = s1.toCharArray();
            char[] c2 = s2.toCharArray();

            Arrays.sort(c1);
            Arrays.sort(c2);

            System.out.println(Arrays.equals(c1, c2));


            System.out.println(c1);

            System.out.println(c2);

//                System.out.println(ss);








        }
    }
