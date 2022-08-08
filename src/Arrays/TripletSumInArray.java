package Arrays;

import java.util.HashSet;

public class TripletSumInArray {
    public static int tripletSum(int[] arr, int num) {
        int count =0;
        for (int i = 0; i < arr.length - 1; i++){
            HashSet<Integer> s = new HashSet<>();
            for (int j = i + 1; j < arr.length; j++) {
                int x = num - (arr[i] + arr[j]);
                if (s.contains(x))
                    count++;//System.out.printf("%d %d %d\n", x, arr[i], arr[j]);
                else
                    s.add(arr[j]);
            }
        }
        return count;
    }


    // Driver code
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,5,6,7};
        int sum = 12;
        System.out.println(tripletSum(arr,sum));
    }
}
