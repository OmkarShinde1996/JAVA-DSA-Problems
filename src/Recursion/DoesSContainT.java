package Recursion;
//Given two string s and t, write a function to check if s contains all characters of t (in the same order as they are in string t).
//Return true or false.
//Do it recursively.
//E.g. : s = “abchjsgsuohhdhyrikkknddg” contains all characters of t=”coding” in the same order. So function will return true.
public class DoesSContainT {
    public static boolean checkSequence(String a, String b) {
        //if length of the b = 0
        //then we return true
        if(b.length()==0)
            return true;

        //if length of a = 0
        //that means b is not present in
        //a so we return false
        if(a.length() == 0)
            return false;

        if(a.charAt(0) == b.charAt(0))
            return checkSequence(a.substring(1), b.substring(1));
        else
            return checkSequence(a.substring(1), b);
    }

    public static void main(String args[])
    {
        String a = "abchjsgsuohhdhyrikkknddg";
        String b = "coding";
        System.out.println(checkSequence(a,b));
    }
}
