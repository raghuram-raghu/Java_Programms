public class FindVowels {

    public static void main(String [] argus){


        String str = "Setty RaghuRam";

        String s = str.toUpperCase();

        String vowels = "";

        for(int i=0;i<s.length();i++) {

            char c = s.charAt(i);

            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {

                vowels = vowels + c;


            }

        }

              System.out.println(vowels);
}
}