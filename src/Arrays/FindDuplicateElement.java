package Arrays;

public class FindDuplicateElement {
    public static int duplicate(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int sumFormula=((arr.length-2)*(arr.length-1))/2;
        return sum-sumFormula;
    }
    public static void main(String[] args) {
        int arr[]={0,7,2,5,4,7,1,3,6};
        System.out.print(duplicate(arr));
//        for(int i=0;i<ans.length;i++){
//            System.out.print(ans[i]);
//        }
    }
}
