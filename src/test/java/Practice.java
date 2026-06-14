
import java.time.Duration;
import java.util.*;
import java.util.Arrays;

public class Practice {


        public static void main(String[] args) {

            String str = "automation";

            Map <Character,Integer> map = new LinkedHashMap<>();

            for(char cc:str.toCharArray()){

                if(map.containsKey(cc)){
                    map.put(cc,map.get(cc)+1);

                }else{
                    map.put(cc,1);
                }
            }

           for( Map.Entry<Character,Integer> mm:map.entrySet()){

               if(mm.getValue()==1){

                   System.out.println("the first non repeated char is "+ mm.getKey()+" and value is "+mm.getValue());

                   break;



               }





           }


        }
    }
