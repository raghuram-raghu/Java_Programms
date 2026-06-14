
import java.util.Arrays;


public class TwoDArrayMinMax {

    public static void main(String [] argus ){

        int [][] arr  = {{84,98,62,},{75,93,72}};

        int min =arr[0][0];
        int max =arr[0][0];

        for(int i= 0;i<arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if(arr[i][j]<min){

                    min=arr[i][j];

                }else if(arr[i][j]>max){

                    max=arr[i][j];
                }

            }
        }

        System.out.println(max);
        System.out.println(min);


    }
}
