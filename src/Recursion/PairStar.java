package Recursion;

public class PairStar {
    public static String addStars(String s) {
        if(s.length()<=1){
            return s;
        }

        if(s.charAt(0)==s.charAt(1)){
            String smallOutput = addStars(s.substring(1));
            return s.charAt(0)+"*"+smallOutput;
        }else{
            String smallOutput = addStars(s.substring(1));
            return s.charAt(0)+smallOutput;
        }
    }
    //h*hel*lo
    public static void main(String[] args) {
        String str = "hhello";
        System.out.print(addStars(str));
    }

}
