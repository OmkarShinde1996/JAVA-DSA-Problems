package Strings;

public class RemoveConsecutiveDuplicatesFromString {
    public static String removeConsecutiveDuplicates(String str){
        String ans="";
        System.out.print(str.charAt(0));
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)!=str.charAt(i-1)){
                ans=ans+str.charAt(i);
            }
        }
        return ans;
    }
    //xyzx
    public static void main(String[] args) {
        String str= "xxyyzxx";
        System.out.print(removeConsecutiveDuplicates(str));
    }
}
