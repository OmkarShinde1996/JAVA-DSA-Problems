package Recursion;

public class RemoveXFromString {
    public static String removeX(String input){
        if(input.length()==1 && input.charAt(0)=='x'){
            return "";
        }else if(input.length()<=1){
            return input;
        }

        if(input.charAt(0)=='x'){
            String smallOutput = removeX(input.substring(1));
            return smallOutput;
        }else{
            String smallOutput = removeX(input.substring(1));
            return input.charAt(0)+smallOutput;
        }
    }

    public static String removeX_1(String input){
        if(input.length()==0){
            return input;
        }

        String str="";
        if(input.charAt(0)!='x'){
            str=str+input.charAt(0);
        }
        String smallOutput=removeX_1(input.substring(1));
        return str+smallOutput;
    }
    //ab
    public static void main(String[] args) {
        String str = "axbx";
        System.out.println(removeX(str));
        System.out.println(removeX_1(str));
    }
}
