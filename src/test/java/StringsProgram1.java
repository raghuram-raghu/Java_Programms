public class StringsProgram1 {

    public static void main(String[] argus) {

         String str1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        String str2 = str1.toLowerCase();

        String newStr = "";

        for (int i =0;i< str1.length();i++){

            char c1= str1.charAt(i);

            char c2= str2.charAt(i);

            newStr =newStr+c1+c2;
        }

        System.out.println(newStr);
    }
}
