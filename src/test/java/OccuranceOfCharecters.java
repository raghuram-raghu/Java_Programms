import java.util.HashMap;
import java.util.Map;

public class OccuranceOfCharecters {

    public static void main (String [] argus){

        String str = "Govindha Govindha r";

        Map<Character,Integer> map = new HashMap<>();

//        char [] c = str.toCharArray();

        for (char cc:str.toCharArray()){

            if(map.containsKey(cc)){

                map.put(cc,map.get(cc)+1);
            }else
            {
                map.put(cc,1);
            }
        }

        for(Map.Entry<Character,Integer> m:map.entrySet()){

            if(m.getValue()==1) {

                System.out.println(m.getKey() + "  key value is   =  " + m.getValue());

            }
    }
}}
