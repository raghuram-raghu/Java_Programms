import java.util.Arrays;

public class ArrayProgram1 {

    public static int[] arrayprog(int[] array,int result ){

        int[] arr =new int[2];

        for(int i =0;i<array.length;i++){

            for(int j =i+1;j<array.length;j++){

            int sum = array[i]+array[j];

                if(sum==result){
/**/              arr[0]=array[i];
                    arr[1]=array[j];
                    System.out.println("the two elements are"+arr[0]+","+arr[1]);
                    break;
                }

        }}
         return arr;
    }

    public static void main (String [] argus) {


        int[] intarray = {9,8,7,6,5,4,3,2};

        int num = 16;
        int[] aa = arrayprog(intarray,num);

        for(int k =0;k<aa.length;k++) {

//            System.out.println(Arrays.toString(aa));
            System.out.println(aa[k]);
        }
    }
}
