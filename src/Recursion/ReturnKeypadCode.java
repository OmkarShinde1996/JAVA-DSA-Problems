package Recursion;

public class ReturnKeypadCode {
    public static String[] keypad(int n){
        if(n==0 || n==1){
            String str[]={""};
            return str;
        }
        String smallOutput[]=keypad(n/10);
        String smallAns[]=helper(n%10);
        String ans[]=new String[smallOutput.length* smallAns.length];
        int k=0;
        for(int i=0;i< smallAns.length;i++){
            for(int j=0;j< smallOutput.length;j++){
                //ans[k]=smallAns[i]+smallOutput[j];
                ans[k]=smallOutput[j]+smallAns[i];
                k++;
            }
        }
        return ans;
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
        int n=3023;
        String str[]=keypad(n);
        for(int i=0;i< str.length;i++){
            System.out.println(str[i]);
        }
    }
}
