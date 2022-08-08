package Arrays;

import java.util.Arrays;

public class FindMissingAndRepeatingNumber {
    static int[] findTwoElement(int arr[], int n) {
        // code here
        Arrays.sort(arr);
        int num=1;
        int res[]=new int[2];
        int arr1[]=new int[n-1];
        int i=0,j=0;
        for(i=0;i<n;i++)
        {
            if(i<n-1 && arr[i]==arr[i+1])
            {
                res[0]=arr[i];
                continue;
            }
            arr1[j]=arr[i];
            j++;
        }

        for(i=0;i<n-1 && arr1[i]==num;i++,num++);
        res[1]=num;
        return res;
    }

    public static void main(String[] args) {
        int arr[]={13,33,43,16,25,19,23,31,29,35,10,2,32,11,47,15,34,46,30,26,41,18,5,17,37,39,6,4,20,27,9,3,8,40,24,44,14,36,7,38,12,1,42,12,28,22,45};
        int ar[]=findTwoElement(arr,47);
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
    }
}
