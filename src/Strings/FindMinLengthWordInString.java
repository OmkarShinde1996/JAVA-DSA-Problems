package Strings;

public class FindMinLengthWordInString {
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

    public static String minLengthWord(String input){
        int currentLen=0;
        String currentStr="";
        String smallStr="";
        int minLength=Integer.MAX_VALUE;
        //System.out.println(input.length());
        int j=0;
        for(int i=0;i<countWords(input);i++){
            while(j<input.length() && input.charAt(j)!=' '){
                currentStr=currentStr+input.charAt(j);
                j++;
                currentLen++;
            }
            if(currentLen<minLength){
                minLength=currentLen;
                smallStr=currentStr;
                currentStr="";
                currentLen=0;
            }
            if(j<input.length() && input.charAt(j)==' '){
                ++j;
                currentStr="";
                currentLen=0;
            }
        }

        return smallStr;
    }

    public static void main(String[] args) {
        String str="aqwdqwd abwqdqwd bkjfkljrlfjlekrf cewfwef dewfwefw ewdwqd fqsqs gefewf hwefwef iewf jewf kewfwef lwded2e ba";
        System.out.println(minLengthWord(str));
    }
}
