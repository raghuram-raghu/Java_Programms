import java.util.Arrays;

public class swapElement_In_Array {


    public static void main(String[] argus) {

        int[] arr = {9,8,0, 7, 6, 5, 0,8,0, 4, 3, 2, 4};

        int rValue=0;

        for(int i=0;i<arr.length;i++){
 
            for(int j=i+1;j<arr.length;j++){

            int fValue = arr[i];
            int sValue = arr[j];

            if(fValue!=rValue && sValue==rValue){

                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

            }
        }}

        System.out.println(Arrays.toString(arr));

    }
}