package HashMap;

import java.util.HashMap;

//Given an array consisting of positive and negative integers, find the length of the longest
// subarray whose sum is zero.
public class LongestSubsetZeroSum {
    public static int lengthOfLongestSubsetWithZeroSum(int arr[]) {
        if(arr.length==0)
            return 0;
        HashMap<Integer,Integer> h=new HashMap<>();
        int sum=0;
        int maxlength=0;
        int maxlength1=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            if(h.containsKey(sum)){
                int k=h.get(sum);
                int l=i-k;
                maxlength1=l;}
            // if(!h.containsKey(sum))
            else
                h.put(sum,i);
            if(sum==0){
                maxlength1=i+1;
            }
            if(maxlength1>maxlength)
                maxlength=maxlength1;
        }
        return maxlength;
    }

    public static void main(String[] args) {
        int[] arr =  {95,-97,-387,-435,-5,-70,897,127,23,284};
        System.out.println(lengthOfLongestSubsetWithZeroSum(arr));
    }
}
