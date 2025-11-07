import java.util.Arrays;

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

        }
    }

