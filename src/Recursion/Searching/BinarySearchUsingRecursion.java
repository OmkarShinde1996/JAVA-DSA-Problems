package Recursion.Searching;

public class BinarySearchUsingRecursion {
    public static int binarySearch(int input[], int element,int si,int ei) {
        if(si>ei){
            return -1;
        }
        int mid = (si+ei)/2;
        if(element==input[mid]){
            return mid;
        }else if(element>input[mid]){
            return binarySearch(input,element,mid+1,ei);
        }else {
            return binarySearch(input,element,si,mid-1);
        }
    }
    public static int binarySearch(int input[], int element){
        return binarySearch(input,element,0,input.length-1);
    }


    public static void main(String[] args) {
        int n[]={-1,0,3,5,9,12};
        int x=9;
        System.out.print(binarySearch(n,x));
    }
}
