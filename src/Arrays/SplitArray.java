package Arrays;
//Given an integer array A of size N, check if the input array can be splitted in two parts such that -
//- Sum of both parts is equal
//- All elements in the input, which are divisible by 5 should be in same group.
//- All elements in the input, which are divisible by 3 (but not divisible by 5) should be in other group.
//- Elements which are neither divisible by 5 nor by 3, can be put in any group.
public class SplitArray {
    static boolean helper(int arr[], int n,int start, int lsum, int rsum){

        // If reached the end
        if (start == n)
            return lsum == rsum;

        // If divisible by 5 then add to the left sum
        if (arr[start] % 5 == 0)
            lsum += arr[start];

            // If divisible by 3 but not by 5
            // then add to the right sum
        else if (arr[start] % 3 == 0)
            rsum += arr[start];

            // Else it can be added to any of the sub-arrays
        else

            // Try adding in both the sub-arrays (one by one)
            // and check whether the condition satisfies
            return helper(arr, n, start + 1, lsum + arr[start], rsum)
                    || helper(arr, n, start + 1, lsum, rsum + arr[start]);

        // For cases when element is multiple of 3 or 5.
        return helper(arr, n, start + 1, lsum, rsum);
    }

    public static boolean splitArray(int input[]) {
        int n=input.length;
        return helper(input, n, 0, 0, 0);
    }


    public static void main(String args[])
    {
        int arr[]={1,4,3};
        System.out.println(splitArray(arr));
    }
}
