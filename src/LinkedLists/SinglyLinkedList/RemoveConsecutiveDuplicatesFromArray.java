package LinkedLists.SinglyLinkedList;

import java.util.ArrayList;

public class RemoveConsecutiveDuplicatesFromArray {
    public static ArrayList<Integer> removeDuplicates(int[] arr){
        ArrayList<Integer> newAl=new ArrayList<>();
        newAl.add(arr[0]);
        for(int i=1;i< arr.length;i++){
            if(arr[i]!=arr[i-1]){
                newAl.add(arr[i]);
            }
        }
        return newAl;
    }
    public static void main(String[] args) {
        int[] arr = {10,10,20,20,20,30,40,10,20};
        ArrayList<Integer> newAl = removeDuplicates(arr);
        for (Integer integer : newAl) {
            System.out.print(integer + " ");
        }
    }
}
