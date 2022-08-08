package Strings;

public class CountWords {
    public static int countWords(String str) {
        int total=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                total = total+1;
            }
        }
        total=total+1;
        if(str.length()==0){
            total=0;
        }
        return total;
    }
    public static void main(String[] args) {
        String a="this is a sample string";
        System.out.println(countWords(a));
    }

    //Answer is 5
}
