import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Missing_Number_Array {

    public static void main(String [] argus) {

//
//        int [] arr = {2,3,4,5,6,7,8,9};
//
//        int num = arr.length+1;
//
//        int  sum =  num*(num+1)/2;
//
//        int arrsum =0;
//
//        for (int i =0;i<arr.length;i++){
//
//            arrsum+=arr[i];
//
//        }
//
//       int missingnum =sum-arrsum;
//
//    System.out.println(missingnum);
//
//
////    finding multiple missing numbers in array
//
//        int [] ar = {2,3,4,5,7,8,9,11};
//
//        Set se= new HashSet();
//
//        for(int a:ar){
//            se.add(a);
//        }
//
//        int start =2;
//        int end =11;
//
//        for(int j= start;j<=end;j++){
//
//            if(!se.contains(j)){
//
//                System.out.println(j);
//
//            }
//        }


                int[] arrr = {10, 12, 13, 15,19,27};

                Arrays.sort(arrr);

                System.out.print("Missing numbers: ");
                for (int i = 0; i < arrr.length - 1; i++) {
                    int current = arrr[i];
                    int next = arrr[i + 1];

                    while (next - current > 1) {
                        current++;

                        System.out.println(current + " ");
                    }
                }


    }
    
    }
