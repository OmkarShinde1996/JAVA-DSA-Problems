package Strings;

public class ReverseString {

    //one way to reverse string by traversing OG string from last to start
    public static String reverseString(String str){
        String str1="";
        for(int i=str.length()-1;i>=0;i--){
            str1=str1+str.charAt(i);
        }
        return str1;
    }

    //Another way tp reverse string to traverse OG string from start to end
    public static String reverseString1(String str){
        String str1="";
        for(int i=0;i<str.length();i++){
            str1=str.charAt(i)+str1;
        }
        return str1;
    }

    public static void main(String[] args) {
        String str="omkar";
        System.out.println(reverseString1(str));
    }
}
