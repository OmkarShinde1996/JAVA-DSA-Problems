package Recursion;

public class CheckPalindromString {
    public static boolean isStringPalindrome(String input,int i,int j) {
        if(i==j || (i+1==j && j-1==i)&&(input.charAt(i)==input.charAt(j))){
            return true;
        }
        if(input.charAt(i)==input.charAt(j)){
            i++;
            j--;
            return isStringPalindrome(input,i,j);
        }else{
            return false;
        }
    }

    public static boolean isStringPalindrome(String input) {
        int i=0;
        int j=input.length()-1;
        return isStringPalindrome(input,i,j);

    }

    public static void main(String[] args) {
        String input="racecar";
        System.out.println(isStringPalindrome(input));
    }
}
