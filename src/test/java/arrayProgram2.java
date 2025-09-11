import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class arrayProgram2 {


    public static void main (String [] argus) {

        String [] a = {"sachin cricket","kapildev cricket","singh haki ","messi football","ronaldo football"};

        Map<String, List<String>> map =new HashMap<>();

        for(String aa :a){

            String [] aaa = aa.split(" ");

            String field = aaa[1];

            String name = aaa[0];

            if(map.containsKey(field)){
                map.get(field).add(name);

            }else{

               List<String> li = new ArrayList<>();

               li.add(name);

                map.put(field,li);

            }

        }

        System.out.println(map);



    }
}
