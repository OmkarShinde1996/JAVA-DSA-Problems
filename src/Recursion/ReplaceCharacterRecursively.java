package Recursion;

public class ReplaceCharacterRecursively {
    public static String replaceCharacter(String input, char c1, char c2){
        if(input.length()==0){
            return input;
        }
        if(input.charAt(0)==c1){
            String smallOutput = replaceCharacter(input.substring(1),c1,c2);
            return c2+smallOutput;
        }else{
            String smallOutput = replaceCharacter(input.substring(1),c1,c2);
            return input.charAt(0)+smallOutput;
        }
    }
    //xbxcd
    public static void main(String[] args) {
        String str = "abacd";
        System.out.println(replaceCharacter(str,'a','x'));
    }
}
