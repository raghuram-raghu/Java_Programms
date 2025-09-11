
import java.util.Random;

public class randomMobile {

    public static void main(String[]argus){

        Random Ran = new Random();

        for(int i=0;i<=10;i++) {

            int num = Ran.nextInt(2) + 7;

            int num1 =9;

            Long num2 = Ran.nextLong(1000000000);

            System.out.println(num1 + "" + num2);
        }
    }
}
