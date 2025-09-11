public class ExceptionHandling {


    public static void main(String[] argus) {

        int result = 0;

        try {

            int one = 10 ;
            int two = 0;
            result = one/two;

        } catch (ArithmeticException e) {

            System.out.println("its arthematic  exception");

        } finally{

            System.out.println("its finally block");

        }

         System.out.println(result);


    }
}