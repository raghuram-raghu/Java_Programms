import java.util.Random;

public class Random_Program {

    public static void main(String [] argus){



        Random random = new Random();

        for(int i=0;i<=10;i++) {
            Long num = random.nextLong(989775245) * 10000;


            System.out.println(num);
        }
    }



}
