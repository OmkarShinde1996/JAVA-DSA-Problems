package Recursion;

public class SumOfElementsInArray {
    public static int sum(int input[]){
        if(input.length<=1){
            return input[0];
        }
        int smallInput[]=new int[input.length-1];
        for(int i=1;i< input.length;i++){
            smallInput[i-1]=input[i];
        }
        int smallAns=sum(smallInput)+input[0];
        return smallAns;
    }
    public static void main(String[] args) {
        int arr[]={4,2,1};
        System.out.print(sum(arr));
    }
}
