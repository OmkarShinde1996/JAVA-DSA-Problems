package Recursion;
//Replace "pi" in a string with 3.14
//Base case if the string is empty or the length of the string is 1 return the string.
//If the 0th and 1st element of the string is p and we have to handle them for the rest we
// have to call recursion it will give the result.
//If not then we have to call recursion from 1st to all elements then add recursion result to
// 1st element and return it.
public class ReplacePiWith314 {
    public static String replace(String input){
        if(input.length()<=1){
            return input;
        }
        if(input.charAt(0)=='p' && input.charAt(1)=='i'){
            String smallOutput = replace(input.substring(2));
            return "3.14"+smallOutput;
        }else{
            String smallOutput = replace(input.substring(1));
            return input.charAt(0)+smallOutput;
        }
    }

    public static void main(String[] args) {
        String str = "pippppiiiipi";
        System.out.print(replace(str));
    }

}

