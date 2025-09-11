public class Palindrome_EachWord_String {


    public static void check_Word_Palindrome(String str){

        String [] words = str.split(" ");

        for(String word : words){

            StringBuilder st = new StringBuilder(word);

          String rev =  st.reverse().toString();

            if (rev.equals(word)) {

                System.out.println("this word is palindrome  " + word);
            }

            else {

                System.out.println("this word is not palindrome  " + word);
            }


        }



    }

    public static void main(String [] argus) {

        String s = "setty raghu ram ahss jaj";

        String [] words = s.split(" ");

        for(String word : words){

            String rev ="";

                for (int i=0;i<word.length();i++) {

                   char c =word.charAt(i);

                   rev =c+rev;

            }
                       if (rev.equals(word)) {

                         System.out.println("this word is palindrome  " + word);
                }

                       else {

                         System.out.println("this word is not palindrome  " + word);
                }


        }



        check_Word_Palindrome(s);
    }


}
