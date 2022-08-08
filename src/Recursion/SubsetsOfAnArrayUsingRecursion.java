package Recursion;

import java.util.ArrayList;
import java.util.List;
//Solution Youtube video : https://www.youtube.com/watch?v=AxNNVECce8c
public class SubsetsOfAnArrayUsingRecursion {
    public static void subsetOfArray(int index, List ds, int arr[], int n) {
        if(index==n){
            if(ds.size()>=0){
                System.out.println(ds);
                return;
            }
            return;
        }
        subsetOfArray(index+1,ds,arr,n);// not pick
        ds.add(arr[index]);// add to array list
        subsetOfArray(index+1,ds,arr,n);  // pick an element
        ds.remove(ds.size()-1);// remove from array list


    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        int n=arr.length;
        List<Integer> ds = new ArrayList<>();
        subsetOfArray(0,ds,arr,n);
    }
}
