package Arrays;

public class FindTheUniqueElement {
    public static int findUnique(int[] arr){
        int ans=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            ans=ans^arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={6,3,7,5,1,3,5,1,7,9,6};
        System.out.print(findUnique(arr));
//        for(int i=0;i<ans.length;i++){
//            System.out.print(ans[i]);
//        }
    }
}
