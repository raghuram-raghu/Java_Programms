public class Pyramid {

    public static void main(String [] argus) {

        int num = 10;

        for (int i = 0; i < num; i++) {

            for (int j = i; j < num; j++) {

                System.out.print(" ");
            }

            for (int k = 0; k < i; k++) {

                System.out.print(" *");
            }

            System.out.println(" ");

        }



    }}