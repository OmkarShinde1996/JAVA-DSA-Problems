package Arrays;

import java.util.ArrayList;
//Expected Time Complexity: O(N)
//Expected Auxiliary Space: O(N)
public class MoveAllNegativeElementsToEnd {
    public static void segregateElements(int arr[], int n) {
        // code here
        ArrayList<Integer> pos = new ArrayList<Integer>();
        ArrayList<Integer> neg = new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            if(arr[i]<0)
                neg.add(arr[i]);
            else if(arr[i]>=0)
                pos.add(arr[i]);
        }
        int l1 = pos.size();
        int l2 = neg.size();
        int j=0,k=0,s=0;
        while(j< l1){
            arr[j]=pos.get(j);
            j++;
            k++;
        }
        while(s< l2){
            arr[k]=neg.get(s);
            s++;
            k++;
        }
    }

    public static void main(String[] args) {
        int arr[]={9, 4, -2, -1, 5, 0, -5, -3, 2};
        segregateElements(arr,9);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
