package HashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicates {
    //Time Complexity = O(n)
    public static ArrayList<Integer> removeDuplicates(int[] a){
        ArrayList<Integer> output = new ArrayList<>();
        HashMap<Integer, Boolean> seen = new HashMap<>();
        for(int i=0; i<a.length;i++){
            if(seen.containsKey(a[i])){
                continue;
            }
            output.add(a[i]);
            seen.put(a[i],true);
        }
        return output;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,2,4,1,2,2,2,10000,3,2};
        ArrayList<Integer> output = removeDuplicates(arr);
        for(int i : output){
            System.out.print(i + " ");
        }
    }
}
