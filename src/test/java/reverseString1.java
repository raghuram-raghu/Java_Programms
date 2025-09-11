public class  reverseString1 {

    public static void main(String[] argus) {

        String str = "Setty Raghu Ram";

        String Each_R_Reverse = "";

        String Reverse = "";


        for(String ss:str.split(" ")){
//
//            StringBuilder sb = new StringBuilder(ss);
//
//            sb.reverse();
//
//            Each_R_Reverse =sb + " "+Each_R_Reverse;
//
//            Reverse=Reverse+" "+sb;

            for (int i=ss.length()-1;i>=0;i--){


                char c = ss.charAt(i);

                if(c>='A' & c<='Z') {

                    Each_R_Reverse = Each_R_Reverse + c+" ";
                }else{

                    Each_R_Reverse = Each_R_Reverse + c;
                }
            }
        }

        System.out.println(Each_R_Reverse);

//        System.out.println(Reverse);

    }
    }
