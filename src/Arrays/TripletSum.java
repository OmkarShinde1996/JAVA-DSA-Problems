package Arrays;

import java.util.Arrays;

public class TripletSum {
    public static int pairSum(int[] arr, int num){
        //Your code goes here
        int count=0, n = arr.length;
        Arrays.sort(arr);
        for(int i=0; i<n-1; i++){
            int j = i + 1;
            int k = n-1;
            while(j<k){
                if(arr[i]+arr[j]+arr[k] < num)
                    j++;
                else if(arr[i]+arr[j]+arr[k] > num)
                    k--;
                else{
                    if(arr[j]==arr[k]){
                        int m=k-j+1;
                        count+= (m*(m-1))/2;
                        break;
                    }
                    int start=j+1;
                    int  end=k-1;
                    while(start<=end && arr[j]==arr[start])
                        start++;
                    while(end>=start &&arr[k]==arr[end])
                        end--;
                    int f1= start-j;
                    int f2=k-end;
                    count+=f1*f2;
                    j=start;
                    k=end;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={12, 3, 4, 1, 6, 9};
        System.out.println(pairSum(arr,24));
//        for(int i=0;i<ans.length;i++){
//            System.out.print(ans[i]);
//        }
    }
}
