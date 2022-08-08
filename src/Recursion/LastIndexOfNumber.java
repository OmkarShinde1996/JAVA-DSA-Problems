package Recursion;

public class LastIndexOfNumber {
    public static int index=0;
    public static int lIndex =0;
    public static int lastIndex(int input[], int x) {
        if(index==input.length-1 && input[index]==x){
            lIndex =index;
            return lIndex;
        }else if(index==input.length-1 && input[index]!=x){
            return -1;
        }
        if(input[index]!=x){
            index++;
            return lastIndex(input,x);
        }else{
            lIndex =index;
            index++;
            lastIndex(input,x);
            return lIndex;
        }

    }
    public static void main(String[] args) {
        int arr[]={34,57,82,41,65,35,82,27,36,12,6,40,66,65,25,29,22,25,23,24,65,15,5,43,28,33,76,32,13,95,22,84,71,23,28,7,65,94,18,47,9,42,61,73};
        System.out.print(lastIndex(arr,61));
    }
}
