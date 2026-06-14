public class Array_SecondHighest_withOutSort {


    public static void main(String [] argus){

        int [] aa = {7,6,2,97,34,75,105,105,87,65,98};

        int fir = Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;

//        int fir = 0;
//        int sec = 0;

        for(int num:aa){

            if(num>fir){

                sec=fir;
                fir=num;

            } else if (num>sec && num!=fir) {

                sec=num;

            }
        }

        System.out.println(sec);
    }
}
