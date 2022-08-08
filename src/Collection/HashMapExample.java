package Collection;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> cources = new HashMap<>();

        //Adding elements in HashMap
        cources.put("Core Java",4000);
        cources.put("Advanced Java", 5000);
        cources.put("SpringBoot",6000);
        cources.put("Python",8000);
        System.out.println(cources);
        System.out.println(cources.size());

        //Traversing HashMap using foreach method
        cources.forEach((e1,e2)->{
            System.out.println(e1+"=>"+e2);
        });
    }
}
