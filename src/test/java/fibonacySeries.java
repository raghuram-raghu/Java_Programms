public class fibonacySeries {

    public static void main(String [] argus){

        int first  = 0;

        int second = 1;

        for(int i=0;i<10;i++){

            System.out.println(first);

            int temp=first+second;
            first=second;
            second=temp;


        }
    }
}
