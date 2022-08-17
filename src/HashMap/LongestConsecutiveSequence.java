package HashMap;

import java.util.ArrayList;
import java.util.HashMap;

//You are given an array of unique integers that contain numbers in random order. You have to find the
// longest possible sequence of consecutive numbers using the numbers from given array.
//You need to return the output array which contains starting and ending element. If the length of the
// longest possible sequence is one, then the output array must contain only single element.
public class LongestConsecutiveSequence {

    public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
        HashMap<Integer,Boolean> map = new HashMap<>();
        ArrayList<Integer> output = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],true);
        }
        int maxlength = 0;
        int start  = 0;
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])){
                int length = 0;
                int temp = arr[i];
                while(map.containsKey(temp)){
                    length++;
                    map.put(temp,false);
                    temp = temp+1;
                }
                int starttemp = arr[i];
                temp = arr[i]-1;
                while(map.containsKey(temp)){
                    length++;
                    map.put(temp,false);
                    starttemp = temp;
                    temp = temp-1;
                }
                if(length > maxlength){
                    maxlength = length;
                    start = starttemp;
                }else if(length == maxlength){
                    maxlength = length;
                    //start = 10 starttemp = 4
                    for(int j=0;j<arr.length;j++){
                        if(arr[j] == start){
                            start = start;
                            break;
                        }else if(arr[j] == starttemp){
                            start = starttemp;
                            break;
                        }
                    }
                }
            }
        }
        output.add(start);
        output.add(start+maxlength-1);
        return output;
    }

    public static void main(String[] args) {
        int[] arr = {3,7,2,1,9,8,41};
        ArrayList<Integer> list = longestConsecutiveIncreasingSequence(arr);
        for(int i : list){
            System.out.println(i);
        }
    }
}
