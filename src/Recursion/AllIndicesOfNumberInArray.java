package Recursion;

public class AllIndicesOfNumberInArray {
    public static int[] allIndexes(int input[], int x,int start) {
        if(start==input.length){
            int[] ans = new int[0]; // empty array
            return ans;
        }
        int smallIndex[]= allIndexes(input,x, start + 1);
        if (input[start] == x){
            int[] myAns = new int[smallIndex.length + 1];
            myAns[0] = start;
            for(int i = 0; i < smallIndex.length; i++){
                myAns[i + 1] = smallIndex[i];
            }
            return myAns;
        }else{
            return smallIndex;
        }
    }
    public static int[] allIndexes(int input[], int x){
        return allIndexes(input,x,0);
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,4,3,2,1};
        int arr1[] = allIndexes(arr,1);
        for(int i=0;i< arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}
