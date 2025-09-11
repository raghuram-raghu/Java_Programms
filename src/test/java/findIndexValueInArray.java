public class findIndexValueInArray {

    public static void main (String [] argus) {

        int[] arr = {9,8,7,6,5,4,3,2,4};

        int exValue = 4;

        for (int i =0;i< arr.length;i++){

            if(exValue==arr[i]){

                System.out.println("the expected value index is "+i);

                break;
            }


        }

}}
