public class NumberReverse

{

    public static void main(String [] argus) {

        int num = 567898;

        int temp =num;

        int rev =0;

        while(temp!=0){

            int rem = temp%10;

            rev=rev*10+rem;

            temp=temp/10;


        }

        System.out.println(rev);

    }
}
