public class Missing_Number_Array {

    public static void main(String [] argus) {


        int [] arr = {2,3,4,5,6,7,8,9};

        int num = arr.length+1;

        int  sum =  num*(num+1)/2;

        int arrsum =0;

        for (int i =0;i<arr.length;i++){

            arrsum+=arr[i];

        }

       int missingnum =sum-arrsum;

    System.out.println(missingnum);

    }
    
    }
