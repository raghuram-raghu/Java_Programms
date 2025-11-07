import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;


public class Array_Prog3 {

        public static void main(String[] args) {


            String str [] = {"7t&^%FGGHJy8", "iuPOI)(*&y98", "9uiASD@#$8"};
            int sum = 0;

            List<Integer> arr = new ArrayList();

            for (String s : str) {
                String numStr = s.replaceAll("[^0-9]", ""); // Remove non-numeric characters
                if (!numStr.isEmpty()) {

                    sum += Integer.parseInt(numStr);

                    arr.add(Integer.parseInt(numStr));

                }
            }

           System.out.println("Sum = " + sum);
            System.out.println(arr);



        }
    }


