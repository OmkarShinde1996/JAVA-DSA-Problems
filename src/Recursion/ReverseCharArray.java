package Recursion;

public class ReverseCharArray {
    public static void reverseString(char[] s) {
        int si=0;
        int ei=s.length-1;
        reverseString(s,si,ei);
    }
    public static void reverseString(char[] s,int si, int ei) {
        if(si>ei){
            return;
        }
        char temp=s[si];
        s[si]=s[ei];
        s[ei]=temp;
        reverseString(s,si+1,ei-1);
    }
    public static void main(String[] args) {
        char arr[]={'H','e','l','l','o'};
        reverseString(arr);
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]);
        }
    }

}
