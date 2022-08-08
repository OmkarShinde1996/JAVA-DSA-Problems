package Strings;

public class PalindromString {

    //Normal approch (reverse a original string and compare it)
    public static void palindromString(String str){
        String str1="";
        for(int i=str.length()-1;i>=0;i--){
            str1=str1+str.charAt(i);
        }
        if(str.equals(str1)){
            System.out.println("It is a palindrom string");
        }else{
            System.out.println("It is not a palindrom string");
        }
    }

    //best approach
    public static boolean palindromString1(String str){
        int i =0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }else{
                i++;
                j--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str="codoc";
        System.out.println(palindromString1(str));
       // palindromString(str);
    }
}
