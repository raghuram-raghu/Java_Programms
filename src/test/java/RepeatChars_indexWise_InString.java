public class RepeatChars_indexWise_InString {


    public static void main(String [] argus) {

    String str = " abcdefg";

    String ss = " ";


    for (int i =0;i<str.length();i++){

        char c= str.charAt(i);

        for (int j =0;j<i;j++) {

            ss=ss+c;

        }
    }

    System.out.println(ss);

    }

    }
