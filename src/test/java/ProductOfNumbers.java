public class ProductOfNumbers {

    public static void main(String[] argus) {

        int num =10;


//        for(int i=1;i<=num;i++){
//
//            if(num%i==0){
//
//                int j = num/i;
//
//                System.out.println(i+" *"+j+" "+"= "+num);
//
//            }
//        }


        for (int i =0;i<num;i++){

            for (int j =1;j<num;j++){


                if(i*j==num) {

                    System.out.println(i + "*" + j+ "=" + num);

                }
            }


        }
  }
}