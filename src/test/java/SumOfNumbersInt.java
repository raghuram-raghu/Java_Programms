public class SumOfNumbersInt {


        public static void main(String[] args) {
            int number = 876;
            int sum = 0;

            // Loop to extract each digit and add it to the sum
            while (number != 0) {
                sum += number % 10;  // Add the last digit
                number= number / 10;        // Remove the last digit
            }

            System.out.println("Sum of digits: " + sum); // Output: 39


            String numbers = "876567";
            int summ = 0;
            String rev = "";
            // Loop through each character, convert it to an integer, and add to sum
            for (char digit : numbers.toCharArray()) {
                summ += Character.getNumericValue(digit);

                rev=digit+rev;
            }

            System.out.println("Sum of digits: " + summ); // Output: 39
            System.out.println(rev);

        }
    }