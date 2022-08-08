package Recursion;

public class PrintKeypadCode {
    public static void printKeypad(int n, String outputSoFar){
        if(n==0 || n==1){
            System.out.println(outputSoFar);
            return;
        }
        String smallAns[]=helper(n%10);
        for(int i=0;i< smallAns.length;i++){
            printKeypad(n/10,smallAns[i]+outputSoFar);
        }

    }
    public static void printKeypad(int n){
        printKeypad(n,"");
    }
    public static String[] helper(int n){
        if(n==0 || n==1){
            String s[]={""};
            return s;
        }else if(n==2){
            String s[]={"a","b","c"};
            return s;
        }else if(n==3){
            String s[]={"d","e","f"};
            return s;
        }else if(n==4){
            String s[]={"g","h","i"};
            return s;
        }else if(n==5){
            String s[]={"j","k","l"};
            return s;
        }else if(n==6){
            String s[]={"m","n","o"};
            return s;
        }else if(n==7){
            String s[]={"p","q","r","s"};
            return s;
        }else if(n==8){
            String s[]={"t","u","v"};
            return s;
        }else if(n==9){
            String s[]={"w","x","y","z"};
            return s;
        }
        return null;
    }
    public static void main(String[] args) {
        int n=33;
        printKeypad(n);
    }
}

