package oops.JavaCollectionFramework.MapInterface;

import java.util.HashMap;
import java.util.Map;

public class LearnHashmap {
    public static void main(String[] args) {
        Map<String , Integer> num = new HashMap<>();

        //key should be unique
        num.put("one",1);
        num.put("two",2);
        num.put("three",3);
        System.out.println(num);

       if(!num.containsKey("two"))
        num.put("two",23);
        System.out.println(num);


        num.putIfAbsent("two",23);



        //iteration
        for (Map.Entry<String,Integer> e: num.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }


        for(String key : num.keySet()){
            System.out.println(key);
        }
        for(Integer val : num.values()){
            System.out.println(val);
        }

        System.out.println(num.containsValue(2));
        System.out.println(num.containsKey("two"));
    }
}
