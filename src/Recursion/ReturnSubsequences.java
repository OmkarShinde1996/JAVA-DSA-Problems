package Recursion;

public class ReturnSubsequences {
    public static String[] subsequesces(String s){
        if(s.length()==0){
            String str[]={""};
            return str;
        }
        String smallStr[]=subsequesces(s.substring(1));
        String ans[]=new String[2* smallStr.length];
        int k=0;
        for(int i=0;i< smallStr.length;i++){
            ans[k]=smallStr[i];
            k++;
        }
        for(int i=0;i< smallStr.length;i++){
            //ans[i+ smallStr.length]=s.charAt(0)+smallStr[i];
            ans[k]=s.charAt(0)+smallStr[i];
            k++;
        }
        return ans;
    }

    public static void main(String[] args) {
        String s="xyz";
        String str[]=subsequesces(s);
        for(int i=0;i< str.length;i++){
            System.out.println(str[i]);
        }
    }

}
