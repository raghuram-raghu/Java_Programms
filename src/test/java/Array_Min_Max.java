import java.util.Arrays;

public class Array_Min_Max {


        public static void main(String[] args) {
            int[] numbers = {12, 45, 7, 89, 3, 56};

            int min = numbers[0];  // assume first element is minimum
            int max = numbers[0];  // assume first element is maximum

            // Loop through the array
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] < min) {
                    min = numbers[i];  // update minimum
                }
                if (numbers[i] > max) {
                    max = numbers[i];  // update maximum
                }
            }

            System.out.println("Minimum number = " + min);
            System.out.println("Maximum number = " + max);


                    int minn = Arrays.stream(numbers).min().getAsInt();
                    int maxx = Arrays.stream(numbers).max().getAsInt();

                    System.out.println("Minimum = " + minn);
                    System.out.println("Maximum = " + maxx);
                }
            }





