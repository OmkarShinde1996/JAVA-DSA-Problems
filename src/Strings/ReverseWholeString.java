package Strings;

public class ReverseWholeString {
    public static String reversString1(String str){
        StringBuffer str1=new StringBuffer(str);
        int x=str1.length()-1;
        int t=0;
        int i=0;
        String ans="";
        int currentWordStart=0;
        //First reverse the whole String by using StringBuffer class (In StringBuffer we can replace characters
        // just like arrays but it is not possible in String)
        while(t<x && x>t){
            char temp=str1.charAt(t);
            str1.setCharAt(t,str1.charAt(x));
            str1.setCharAt(x,temp);
            t++;
            x--;
        }
        //Store StringBuffer variable value in String variable
        String answer=str1.toString();
        //Now reverse each word present in String variable
        for(;i<answer.length();i++){
            if(answer.charAt(i)==' '){
                //Revers current word
                int currentWordEnd=i-1;
                String reversedWord="";
                for(int j=currentWordStart;j<=currentWordEnd;j++){
                    reversedWord=answer.charAt(j)+reversedWord;
                }
                //add it in final string "ans"
                ans=ans+reversedWord+" ";
                currentWordStart=i+1;
            }
        }
        //for last word in the string
        int currentWordEnd=i-1;
        String reversedWord="";
        for(int j=currentWordStart;j<=currentWordEnd;j++){
            reversedWord=answer.charAt(j)+reversedWord;
        }
        //add it in final string "ans"
        ans=ans+reversedWord;
        return ans;
    }
    //Sengupta Shreyashish am I Hello
    public static void main(String[] args) {
        String str="Hello I am Shreyashish Sengupta";
        System.out.println(reversString1(str));
    }
}
