package Strings;

public class ReverseEachWord {
    public static String reversString1(String str){
        int i=0;
        String ans="";
        int currentWordStart=0;
        //Now reverse each word present in String variable
        for(;i<str.length();i++){
            if(str.charAt(i)==' '){
                //Revers current word
                int currentWordEnd=i-1;
                String reversedWord="";
                for(int j=currentWordStart;j<=currentWordEnd;j++){
                    reversedWord=str.charAt(j)+reversedWord;
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
            reversedWord=str.charAt(j)+reversedWord;
        }
        //add it in final string "ans"
        ans=ans+reversedWord;
        return ans;
    }
    public static void main(String[] args) {
        String str="Hello, I am Aadil!";
        System.out.println(reversString1(str));
    }
}
