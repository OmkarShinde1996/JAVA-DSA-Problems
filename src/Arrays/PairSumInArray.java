package Arrays;
//You have been given an integer array/list(ARR) and a number 'num'.
// Find and return the total number of pairs in the array/list which sum to 'num'.
public class PairSumInArray {
    public static int pairSum(int[] arr, int num){
        int count =0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==num){
                    if(arr[i]<arr[j]){
                        //System.out.println(arr[i]+" "+arr[j]);
                        count++;
                    }else {
                        //System.out.println(arr[j] + " " + arr[i]);
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={1,3,6,2,5,4,3,2,4};
        System.out.println(pairSum(arr,7));
//        for(int i=0;i<ans.length;i++){
//            System.out.print(ans[i]);
//        }
    }
}
