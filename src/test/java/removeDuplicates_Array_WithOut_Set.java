
import java.util.ArrayList;
import java.util.Arrays;

public class removeDuplicates_Array_WithOut_Set {


            public static int[] removeDuplicates(int[] arr) {
                // Create an ArrayList to store unique elements
                ArrayList<Integer> uniqueList = new ArrayList<>();

                // Loop through the input array
                for (int i = 0; i < arr.length; i++) {
                    // If the element is not already in the list, add it
                    if (!uniqueList.contains(arr[i])) {
                        uniqueList.add(arr[i]);
                    }
                }

                // Convert the ArrayList back to an array
                int[] result = new int[uniqueList.size()];
                for (int i = 0; i < uniqueList.size(); i++) {
                    result[i] = uniqueList.get(i);
                }

                return result;
            }

            public static void main(String[] args) {
                int[] arr = {1, 2, 2, 3, 4, 4, 5};
                int[] newArr = removeDuplicates(arr);
                System.out.println(Arrays.toString(newArr));

            }
        }



