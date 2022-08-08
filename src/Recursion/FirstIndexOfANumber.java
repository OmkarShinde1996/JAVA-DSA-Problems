package Recursion;

public class FirstIndexOfANumber {
    public static int index=0;
    public static int firstIndex(int input[], int x) {
        if(index==input.length-1 && input[index]==x){ //Base case
            return index;
        }else if(index==input.length-1 && input[index]!=x){
            return -1;
        }
        if(input[index]!=x){
            index++; //small problem calculation
            return firstIndex(input,x);//recursion
        }else{
            return index;
        }

    }
    public static void main(String[] args) {
        int arr[]={34,57,82,41,65,35,82,27,36,12,6,40,66,99,25,29,22,25,12,24,65,15,5,43,28,33,76,32,13,95,22,84,71,23,28,7,65,94,18,47,9,42,61,73};
        System.out.print(firstIndex(arr,677));
    }
}
