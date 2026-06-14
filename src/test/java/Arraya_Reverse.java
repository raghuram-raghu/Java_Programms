import java.util.Arrays;

public class Arraya_Reverse {

        public static void main(String[] args) {
            int[] arr = {60,70,90,10, 20, 30, 40, 50};

            int start = 0;
            int end = arr.length-1;

            while(start<end){

                int temp = arr[start];
                arr[start]=arr[end];
                arr[end]=temp;

                start++;
                end--;


            }

            System.out.println("Reversed array: " + Arrays.toString(arr));

//                    int[] arr = {60,70,90,10,20,30,40,50};
//
//                    int[] rev = new int[arr.length];
//
//                    int j = 0;
//
//                    for(int i = arr.length - 1; i >= 0; i--) {
//                        rev[j++] = arr[i];
//                    }
//
//                    System.out.println(Arrays.toString(rev));
//                }
//            }
        }
    }

