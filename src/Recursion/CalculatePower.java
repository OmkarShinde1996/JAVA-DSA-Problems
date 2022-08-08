package Recursion;

public class CalculatePower {
    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        return power(x,n-1)*x;
    }

    public static double myPow(double x, int n) {
        if(n<0){
            return 1/myPower(x,-(n));
        }else{
            return myPower(x,n);
        }
    }
    public static double myPower(double x, int n){
        if(n==0){
            return 1;
        }else if(x==0.0){
            return 0;
        }
        return myPow(x,n-1)*x;
    }

    public static void main(String[] args) {
        double x=0.00001;
        int n=2147483647;
        //double s = 2;
        System.out.print(myPow(x,n));
    }
}
