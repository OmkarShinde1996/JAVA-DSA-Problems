package Arrays;

import java.util.ArrayList;

public class FirstAndLastOccurrencesOfX {
    public static ArrayList<Long> find(long arr[], int n, int x)
    {
        long firstIndex=-1;
        long lastIndex=-1;
        ArrayList<Long> al=new ArrayList<>();
        int si=0;
        int ei= arr.length-1;
        while(si<=arr.length-1){
            if(arr[si]==x){
                firstIndex=si;
                break;
            }
            si++;
        }
        while(ei>=0){
            if(arr[ei]==x){
                lastIndex=ei;
                break;
            }
            ei--;
        }
        al.add(firstIndex);
        al.add(lastIndex);
        return al;
    }


//    public int[] searchRange(int[] nums, int target) {
//
//        // Performing binary search on `nums` array
//        int idx = Arrays.binarySearch(nums,target);
//        if(idx < 0) return new int[]{-1,-1};
//
//        int n = nums.length, i = idx, j = idx;
//
//        // For first index
//        while(i>0 && nums[i-1] == target) i--;
//
//        // For last index
//        while(j < n-1 && nums[j+1] == target) j++;
//
//        return new int[]{i,j};
//    }





    public static void main(String[] args) {
        long arr[]={6,9};
        int n=arr.length;
        ArrayList<Long> al = find(arr,n,9);
        for(int i=0;i<al.size();i++){
            System.out.println(al.get(i));
        }
    }

}
