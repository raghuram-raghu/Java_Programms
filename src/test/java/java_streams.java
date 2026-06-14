import java.util.*;
import java.util.stream.Stream;


public class java_streams {


    public static void main(String[] args) {


        String str [] = {"jshikjndk", "iuPOI)(*&y98", "ihgtjkjhk","9uiASD@#$8","uaydjahdb"};

        String str1 [] = {"tshikjndk", "ouPOI)(*&y98", "ihgtjkjhk","9uiASD@#$8","uaydjahdb"};

        List <String> al = Arrays.asList(str);

        List <String> al1 = Arrays.asList(str1);

        Long num = al.stream().filter(s->s.startsWith("i")).count();

       System.out.println(num);

        al.stream().filter(s->s.length()>8).forEach(s->System.out.println(s));

        al.stream().filter(s->s.length()>8).limit(1).forEach(s->System.out.println(s));

        al.stream().filter(s->s.startsWith("i")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));


        Stream.concat(al.stream(),al1.stream()).forEach(s->System.out.println(s));

        Stream<String> st =  Stream.concat(al.stream(),al1.stream());
        st.forEach(s->System.out.println(s));

        boolean stt = Stream.concat(al.stream(),al1.stream()).anyMatch(s->s.equalsIgnoreCase("ouPOI)(*&y98"));
        System.out.println(stt);

    }

}
