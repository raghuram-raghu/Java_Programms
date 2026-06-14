public class Array_String {


    public static void main(String[] argus) {


   String  ar = "kuh iabdsa bsamsx jnsaxjan sa dagxsua NMbxb amsasdaskSAN";

   String [] arr = ar.split(" ");

   String ex ="";

      for(String aa:arr)  {

          if(aa.length()>ex.length()){

              ex=aa;

          }
   }
      System.out.println(ex);



    }
    }
