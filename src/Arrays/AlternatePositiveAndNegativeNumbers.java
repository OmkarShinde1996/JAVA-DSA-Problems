package Arrays;

import java.util.ArrayList;
//Here approach is as below
//1) Create 2 array lists named as pos and neg to store respective numbers
//2) run for loop on arr[] to store pos and neg numbers in array list
//3) again run a for loop to store alternate positive and negative numbers in arr[]
//Expected Time Complexity: O(N)
//Expected Auxiliary Space: O(N)
public class AlternatePositiveAndNegativeNumbers {
    static void rearrange(int arr[], int n) {
        // code here
        ArrayList<Integer> pos = new ArrayList<Integer>();
        ArrayList<Integer> neg = new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            if(arr[i]<0)
                neg.add(arr[i]);
            else pos.add(arr[i]);
        }
        int l1 = pos.size();
        int l2 = neg.size();
        int j=0,k=0;
        for(int i=0;i<n;)
        {
            if(j<l1){
                arr[i] = pos.get(j);
                j++;
                i++;
            }
            if(k<l2) {
                arr[i] = neg.get(k);
                k++;
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={9, 4, -2, -1, 5, 0, -5, -3, 2};
        rearrange(arr,9);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
