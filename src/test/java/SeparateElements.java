public class SeparateElements {


    public static void main(String [] argus) {

        String str = "Setrtyu0987654@#$)(*&^KJHGFCVB";

        String c_letters = "";

        String s_letters = "";

        String numbers = " ";

        String symbols = " ";


        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);

            if ( c>='A' && c<='Z'){

                c_letters=c_letters+" "+c;
            } else if ( c>='a' && c<='z'){

                s_letters = s_letters+c;

            } else if (c>='0' && c<='9'){

                numbers=numbers+c;

            }else{

                symbols= symbols+c;
            }
        }

        System.out.println(c_letters);
        System.out.println(s_letters);
        System.out.println(numbers);
        System.out.println(symbols);

    }}