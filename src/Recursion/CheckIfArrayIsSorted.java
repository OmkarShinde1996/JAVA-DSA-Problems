package Recursion;

public class CheckIfArrayIsSorted {
    public static boolean checkSorted(int input[]){
        if(input.length<=1){
            return true;
        }
        int smallInput[]=new int[input.length-1];
        for(int i=1;i< input.length;i++){
            smallInput[i-1]=input[i];
        }
        boolean smallAns = checkSorted(smallInput);
        if(!smallAns){
            return false;
        }
        return input[0]<=input[1];
//        if(input[0]<=input[1]){
//            return true;
//        }else{
//            return false;
//        }
    }

    //Best approach
//    public static boolean checkSorted_2(int input[]) {
//        if (input.length <= 1) {
//            return true;
//        }
//        if(input[0]<=input[1]){
//            return true;
//        }
//        int smallInput[] = new int[input.length - 1];
//        for (int i = 1; i < input.length; i++) {
//            smallInput[i - 1] = input[i];
//        }
//        boolean smallAns = checkSorted(smallInput);
//        return smallAns;
////        if(smallAns){
////            return true;
////        }else{
////            return false;
////        }
//
//    }

    public static int index=0;
    public static boolean checkSorted_3(int input[]){
        if(index==input.length-1 && input.length==1){
            return true;
        }else if (index==input.length-1){
            return input[input.length-1]<input[input.length];
        }
        if(input[index]<input[index+1]){
            index++;
            return checkSorted(input);
        }else {
            return false;
        }
    }


    public static void main(String[] args) {
        int arr[]={2};
        System.out.println(checkSorted(arr));
        //System.out.println(checkSorted_2(arr));
        System.out.println(checkSorted_3(arr));
    }
}
