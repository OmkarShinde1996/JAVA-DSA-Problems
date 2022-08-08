package Collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListsOperations {
    public static void main(String[] args) {
        System.out.println("Welcome to code java collection framework");
        //Type safe collection {same type of data can be added in collection}
        ArrayList<String> name = new ArrayList<>();
        name.add("omkar");
        name.add("aniket");
        name.add("rohan");
        //name.add(123); you cannot add int type of data in String type of collection in Type safe collection
        System.out.println(name);
        System.out.println(name.get(2));


        //Un Type safe collection {different types of data can be added in collection}
        ArrayList arr = new ArrayList();
        arr.add("omkar");
        arr.add(123); //you can add different type of data in type safe collection
        arr.add(12.23);
        System.out.println(arr);
        System.out.println(arr.get(1));

        LinkedList list = new LinkedList();
        list.add(123);
        list.add("omkar");
        list.add(12.23);
        list.add(true);
        System.out.println(list);
        list.set(1,"aniket");
        System.out.println(list);
        list.add(1,"omkar");
        System.out.println(list);
        list.remove(list.get(2));
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains(12.23));
        System.out.println(list.get(1));
        list.clear();
        System.out.println("is list empty = "+list.isEmpty());
        list.addAll(arr);
        System.out.println("is list empty = "+list.isEmpty());
        System.out.println(list);
    }
}
