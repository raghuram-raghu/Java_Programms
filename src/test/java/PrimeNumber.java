public class PrimeNumber {

    public static void main(String [] argus) {

       int num = 11;

       int count =0;

           for(int i=2;i<num-1;i++){

               if(num%i==0){

                   count++;
               }
           }

       if(count==0){

           System.out.println(num+" this number is prime number");

       }else{

           System.out.println(num+" this number is not prime number");
       }


    }
}
