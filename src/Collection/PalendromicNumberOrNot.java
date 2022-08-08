package Collection;

public class PalendromicNumberOrNot {
    public static boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int reversed = reverse(x);
        if(reversed==x){
            return true;
        }else{
            return false;
        }
    }

    public static int reverse(int x){
        int result=0;
        while(x!=0){
            int a = x%10;
            result=result*10+a;
            x=x/10;
        }
        return result;
    }


    public static void main(String[] args) {
        int x=-121;
        System.out.println(isPalindrome(x));
    }
}
