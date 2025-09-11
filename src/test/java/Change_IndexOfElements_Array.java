import java.util.Arrays;

public class Change_IndexOfElements_Array {


    public static void main(String[] argus) {

        int[] arr = {9,8,7,6,5,4,3,2,1};

        int num = arr.length;

        for(int i=0;i<4;i++){

//         int a=arr[i];  useing this it will print below array
//         [5, 4, 3, 2, 1, 9, 7, 5, 3]


            int a=arr[0];
//             [5, 4, 3, 2, 1, 9, 8, 7, 6]


            for(int j=0;j<arr.length-1;j++){

                arr[j]=arr[j+1];

            }

            arr[num-1]=a;

        }

        System.out.println(Arrays.toString(arr));

    }

}
