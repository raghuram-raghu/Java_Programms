import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;

public class acending_Dcending_Array {


        public static void main(String[] argus) {

            int[] arr = {9,8,0,7,6,5,0,8,0,4,3,2,4};


            for(int i=0;i<arr.length;i++){

                for(int j=i+1;j<arr.length;j++){

                    if(arr[i]>arr[j]){

                        int temp = arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;

                    }
                }}

            System.out.println(Arrays.toString(arr));
            System.out.println(arr[arr.length-1]);
            System.out.println(arr[0]);



            Integer[] ar = {9,8,0,7,6,5,0,8,0,4,3,2,4};

            List <Integer>li = Arrays.asList(ar);
//
////            to  print ascending order with duplicate
//            li.stream().sorted().forEach(s->System.out.println(s));
//
//
////            to  print ascending order without duplicates
//            li.stream().distinct().sorted().forEach(s->System.out.println(s));
//
//
////            to  print descending order with duplicate
//            li.stream().sorted(Comparator.reverseOrder()).forEach(s->System.out.println(s));


//            to  print descending order without duplicate
      List<Integer> lii = li.stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());


      //forEach(s->System.out.println(s));

//System.out.println(lii.get(2));
        }
    }

