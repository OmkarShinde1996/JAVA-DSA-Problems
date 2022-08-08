package Recursion;

public class PrintSubsequences {
    public static void printSubsequences(String input, String outputSoFar){
        if(input.length()==0){
            System.out.println(outputSoFar);
            return;
        }
        //We choose not to include 1st char
        printSubsequences(input.substring(1), outputSoFar);
        //We choose to include 1st char
        printSubsequences(input.substring(1), outputSoFar+input.charAt(0));
    }
    public static void printSubsequences(String s){
        printSubsequences(s,"");
    }
    public static void main(String[] args) {
        String s="xyz";
        printSubsequences(s);
    }
}
