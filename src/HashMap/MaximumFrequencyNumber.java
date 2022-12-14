package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
//You are given an array of integers that contain numbers in random order.
// Write a program to find and return the number which occurs the maximum times in the given input.
//If two or more elements contend for the maximum frequency, return the element which occurs in the array first.
public class MaximumFrequencyNumber {
    public static int maxFrequencyNumber(int[] arr){
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(h.containsKey(arr[i])){
                h.put(arr[i],h.get(arr[i])+1);
            }else
                h.put(arr[i],1);
        }
        int max=0;
        int maxKey=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(h.get(arr[i])>max){
                max=h.get(arr[i]);
                maxKey=arr[i];}
        }
        return maxKey ;
    }
    public static void main(String[] args) {
        int arr[] = {2,12,2,11,12,2,1,2,2,11,12,2,6};
        System.out.println(maxFrequencyNumber(arr));

    }
}
