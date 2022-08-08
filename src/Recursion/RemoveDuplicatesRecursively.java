package Recursion;

public class RemoveDuplicatesRecursively {
    public static String removeConsecutiveDuplicates(String s){
        if(s.length()<=1){
            return s;
        }
        if(s.charAt(0)!=s.charAt(1)){
            String smallOutput = removeConsecutiveDuplicates(s.substring(1));
            return s.charAt(0)+smallOutput;
        }else{
            return removeConsecutiveDuplicates(s.substring(1));
        }

    }
    //abcba
    public static void main(String[] args) {
        String str = "aabccba";
        System.out.println(removeConsecutiveDuplicates(str));
    }
}
