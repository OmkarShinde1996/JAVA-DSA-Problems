package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TraverseExample {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("omkar");
        name.add("aniket");
        name.add("rohan");
        name.add("mohit");
        name.add("ramesh");

        //Traversing using for each loop
        System.out.println("Traversing using for each loop");
        for(String str:name){
            System.out.print(str + "\t" + str.length() +"\t");
            StringBuffer br = new StringBuffer(str);
            System.out.println(br.reverse());
        }
        System.out.println("----------------------------------------");
        //Traversing using Iterator
        System.out.println("Traversing using Iterator");
        Iterator<String> itr=name.iterator();
        while(itr.hasNext()){
            String next = itr.next();
            System.out.println(next);
        }
        System.out.println("----------------------------------------");
        //Backward traversing using ListIterator
        System.out.println("Backward traversing using ListIterator");
        ListIterator<String> listitr = name.listIterator(name.size());
        while (listitr.hasPrevious()){
            String pre = listitr.previous();
            System.out.println(pre);
        }
        System.out.println("----------------------------------------");
        //Traversing using foreach method
        System.out.println("Traversing using foreach method");
        name.forEach(e->{
            System.out.println(e);
        });

    }
}
