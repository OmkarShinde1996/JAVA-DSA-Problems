package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindAllDuplicatesInArray {
    public static List<Integer> findDuplicates(int[] nums) {
        int[] arr = new int[nums.length + 1];
        List<Integer> result = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++){
            arr[nums[i]]++;
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 2) result.add(i);
        }
        return result;
    }


    public static boolean containsDuplicate(int[] nums) {
        boolean result= false;
        // Make HashSet , Add value into it while checking before hand the value present or not
        HashSet<Integer> hm = new HashSet<>();
        for (int num : nums) {
            if (hm.contains(num)) {
                return true;
            } else {
                hm.add(num);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[]={4,3,2,7,8,11,9,1};
        System.out.println(containsDuplicate(arr));
//        for(int i=0;i<ans.length;i++){
//            System.out.print(ans[i]);
//        }
    }
}
