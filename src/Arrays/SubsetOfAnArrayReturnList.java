package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//YouTube video link for solution : https://www.youtube.com/watch?v=gdifkIwCJyg&list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&index=32
//Time complexity : o(n*2^n)
//Space complexity : o(2^n*n)

public class SubsetOfAnArrayReturnList {
    public static List<List<Integer>> subsetOfArray(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>(); //First create an empty list of lists named outer

        outer.add(new ArrayList<>()); // then add new empty list in outer list
        for(int num : arr){ //for every number in array perform for loop
            int size=outer.size(); // define size of the outer list
            for(int i=0;i<size;i++){
                List<Integer> internal = new ArrayList<>(outer.get(i)); //Create internal list
                internal.add(num); // add num in internal list
                outer.add(internal); //add internal list to outer list
            }
        }

        return outer; //return outer list
    }

    public static List<List<Integer>> subsetOfArrayDuplicates(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for(int i=0;i< arr.length;i++){
            start=0;
            //if current and previous element is same, start = end + 1
            if(i>0 && arr[i]==arr[i-1]){
                start = end + 1;
            }
            end= outer.size()-1;
            int size=outer.size();
            for(int j=start;j<size;j++){
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }

        return outer;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3};
        List<List<Integer>> ans = subsetOfArray(arr);
        for(List<Integer> list : ans){
            System.out.println(list);
        }
    }
}
