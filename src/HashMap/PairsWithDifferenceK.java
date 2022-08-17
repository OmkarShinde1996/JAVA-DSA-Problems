package HashMap;

import java.util.ArrayList;
import java.util.HashMap;

//You are given with an array of integers and an integer K. You have to find and print the count of all
// such pairs which have difference K.
//Note: Take absolute difference between the elements of the array.
public class PairsWithDifferenceK {
    public static int getPairsWithDifferenceK(int arr[], int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }else{
                int oldfreq=map.get(arr[i]);
                map.put(arr[i],oldfreq+1);
            }
        }
        if(k==0){
            for(int i=0;i<arr.length;i++){
                int freq=map.get(arr[i]);
                if(freq>1){
                    for(int j=0;j<(freq*(freq-1))/2;j++){
                        count++;
                    }
                }
                map.put(arr[i],0);
            }
        }else{
            for(int i=0;i<arr.length;i++){
                if(map.containsKey(arr[i]+k)){
                    int freq1=map.get(arr[i]);
                    int freq2=map.get(arr[i]+k);
                    for(int j=0;j<freq1*freq2;j++){
                        count++;
                    }
                }
                if(map.containsKey(arr[i]-k)){
                    int freq1=map.get(arr[i]);
                    int freq2=map.get(arr[i]-k);
                    for(int j=0;j<freq1*freq2;j++){
                        count++;
                    }
                }
                map.put(arr[i],0);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {4,4,4,4};
        System.out.println(getPairsWithDifferenceK(arr,0));
    }
}
