package Strings;

import java.util.Arrays;

public class CheckPermutationStrings {
    public static boolean isPermutation(String str1, String str2){
        //first save length in veriable
        int len1 = str1.length();
        int len2 = str2.length();
        //compare the 2 strings length. return false if mismatch
        if(len1>len2 || len1<len2){
            return false;
        }
        //Create charater array of strings
        char ch1[]=str1.toCharArray();
        char ch2[]=str2.toCharArray();
        //Sort the arrays
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        //Compare array elements. return if mismatch
        for(int i=0;i<len1;i++){
            if(ch1[i]!=ch2[i]){
                return false;
            }
        }
        //return true if mismatch not found
        return true;
    }
    public static void main(String[] args) {
        String str1= "abcde";
        String str2="bcdae";
        System.out.println(isPermutation(str1,str2));
    }
}
