public class StringProgram2 {


    public static void main(String[] argus) {

        String str1 = "AhggfjBFGHJfghgjkCxcvdYzcsdvZxzvdsv";

        String str2 = "";

        char [] cc = str1.toCharArray();

        for (char c:cc) {

            if(c>='A' && c<='Z'){

                str2=str2+" "+c;
            }else{

                str2=str2+c;
            }

        }

        System.out.println(str2);
    }
}