package Recursion;
//Suppose you have a string, S, made up of only 'a's and 'b's. Write a recursive function that
// checks if the string was generated using the following rules:

//a. The string begins with an 'a'
//b. Each 'a' is followed by nothing or an 'a' or "bb"
//c. Each "bb" is followed by nothing or an 'a'

public class CheckAB {
    public static boolean checkAB(String input) {
        if(input.length()==0){
            return true;
        }
        if(input.length()==1 && input.charAt(0)=='a'){
            return true;
        }else if(input.length()==1 && input.charAt(0)!='a'){
            return false;
        }
        if(input.charAt(0)=='a' && input.charAt(1)=='b' && input.charAt(2)=='b'){
            boolean acAns = true;
            boolean smallAns=checkAB(input.substring(3));
            if(acAns==smallAns){
                return true;
            }else{
                return false;
            }
        }else if(input.charAt(0)=='a' && input.charAt(1)=='a'){
            boolean acAns = true;
            boolean smallAns=checkAB(input.substring(1));
            if(acAns==smallAns){
                return true;
            }else{
                return false;
            }
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.print(checkAB("abbaaabb"));
    }
}
