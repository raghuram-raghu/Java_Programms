import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.*;

public class removeDuplicatesInArray {

    public static void main (String [] argus) {

        Integer [] arr = {9, 8, 7, 6, 5,8, 4, 3, 2, 4};

            Arrays.sort(arr);

        ArrayList <Integer> aa = new ArrayList(Arrays.asList(arr));

        Set li = new HashSet();

        Set set = new HashSet();

        for(int i=0;i<aa.size();i++){

            int nn = aa.get(i);

            if(!li.contains(nn)){

                li.add(nn);

            }else{

                set.add(nn);
            }
        }

        System.out.println(set);
        System.out.println(li);

//
//        for (int a:arr){
//
//            set.add(a);
//        }
//
//        System.out.println(set);



//        Set <Integer> s = new HashSet<Integer> (Arrays.asList(arr));


//        System.out.println(s);


    }
    }
