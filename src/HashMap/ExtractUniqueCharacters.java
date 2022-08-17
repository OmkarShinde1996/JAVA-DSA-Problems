package HashMap;

import java.util.HashMap;

//Given a string S, you need to remove all the duplicates. That means, the output string should contain
// each character only once. The respective order of characters should remain same, as in the input string.
public class ExtractUniqueCharacters {
    public static String uniqueChar(String str){
        HashMap<Character,Boolean> h=new HashMap<>();
        String s="";
        for(int i=0;i<str.length();i++){
            if(h.containsKey(str.charAt(i)))
                continue;
            s=s+str.charAt(i);
            h.put(str.charAt(i),true);
        }
        return s;
    }

    public static void main(String[] args) {
        String str = "ababacd";
        System.out.println(uniqueChar(str));
    }
}
