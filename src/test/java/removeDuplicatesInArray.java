import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class removeDuplicatesInArray {

    public static void main (String [] argus) {

        Integer [] arr = {9, 8, 7, 6, 5,8, 4, 3, 2, 4};

            Arrays.sort(arr);


//        Set set = new HashSet();
//
//        for (int a:arr){
//
//            set.add(a);
//        }
//
//        System.out.println(set);



        Set <Integer> s = new HashSet<Integer> (Arrays.asList(arr));


        System.out.println(s);


    }
    }
