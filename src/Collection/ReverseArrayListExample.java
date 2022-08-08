package Collection;

import java.util.ArrayList;

public class ReverseArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("omkar");
        name.add("aniket");
        name.add("rohan");
        name.add("mohit");
        name.add("ramesh");
        System.out.println(name);
        //Reversing the ArrayList using for loop
        for (int i=name.size()-1;i>=0;i--){
            System.out.print(name.get(i)+" ");
        }
        System.out.println();
        System.out.println("===========================================");
        ArrayList<Integer> age = new ArrayList<>();
        age.add(12);
        age.add(13);
        age.add(14);
        age.add(15);
        age.add(16);
        age.add(17);
        System.out.println(age);
        for (int j=age.size()-1;j>=0;j--){
            System.out.print(age.get(j)+" ");
        }
    }
}
