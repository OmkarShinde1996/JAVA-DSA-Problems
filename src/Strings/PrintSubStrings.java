package Strings;

public class PrintSubStrings {
    public static void subStrings(String str){
        int n=str.length();
        for(int i=0;i<n;i++){
            int j=i;
            String str1="";
            while(j<n){
                if(i==j){
                    str1=str1+str.charAt(j);
                    j++;
                }else{
                    str1=str1+str.charAt(j);
                    j++;
                }
                System.out.println(str1);
            }
        }
    }
    //pqrs
    //p,pq,pqr,pqrs,q,qr,qrs,r,rs,s

    public static void printSubstrings(String str){
     /* for(int start=0;start<str.length();start++){
          //We will be printing all substrings starting with char at index start
          for(int end=start;end<str.length();end++){
              System.out.println(str.substring(start,end+1));
          }
      }*/
        for(int len=1;len<=str.length();len++){
            //We have to print all strings wih length as "len"
            for(int start=0;start<=str.length()-len;start++){
                int end=start+len-1;
                System.out.println(str.substring(start,end+1));
            }
        }
    }
    public static void main(String[] args) {
//        String str="abcdef";
//        subStrings(str);
        // System.out.println(str1.contains(str2));
        StringBuffer str1=new StringBuffer("");
        for(int i=0;i<5;i++)
        {
            str1.append((char)('a'+i));
        }
        System.out.println(str1);
    }
}
