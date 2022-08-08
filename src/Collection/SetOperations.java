package Collection;

import java.util.HashSet;
import java.util.TreeSet;

public class SetOperations {
    public static void main(String[] args) {
        HashSet<String> name = new HashSet<>();
        name.add("omkar");
        name.add("aniket");
        name.add("rohan");
        name.add("amit"); //order will not get preserved
        name.add("amit"); // Duplicates are not allowed it will show only once in output of below statement
        System.out.println(name);
        //set does not have methods like lists like get method

        HashSet<Integer> set = new HashSet();
        set.add(123);
        set.add(12);
        set.add(13);
        set.add(34);
        System.out.println("set"+set);

        TreeSet tset = new TreeSet();
        tset.addAll(set);
        System.out.println(tset); // You will get sorted set when you use TreeSet

    }
}
