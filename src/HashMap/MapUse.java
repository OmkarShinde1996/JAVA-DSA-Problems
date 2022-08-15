package HashMap;

import java.util.HashMap;
import java.util.Set;

public class MapUse {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        //Insertion - Time Complexity O(1)
        map.put("abc", 1);
        map.put("def", 2);
        map.put("abc1", 1);
        map.put("def1", 2);
        //To get the size of the map - Time Complexity O(1)
        System.out.println(map.size());
        //To check if map has a particular key or not - Time Complexity O(1)
        if(map.containsKey("abc")){
            System.out.println("true");
        }
        //To check if map has a particular key or not - Time Complexity O(n)
        if(map.containsValue(1)){
            System.out.println("true");
        }
        // get value - Time Complexity O(1)
        int v = 0;
        if(map.containsKey("abc")){
            v = map.get("abc");
        }
        System.out.println(v);
        //To remove value - Time Complexity O(1)
        int s = map.remove("def");
        System.out.println(s);

        //iterate
        Set<String> keys = map.keySet();
        for(String str : keys){
            System.out.println(str);
        }
    }
}
