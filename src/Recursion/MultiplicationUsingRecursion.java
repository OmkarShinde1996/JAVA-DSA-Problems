package Recursion;
//Given two integers M & N, calculate and return their multiplication using recursion.
// You can only use subtraction and addition for your calculation. No other operators are allowed.
public class MultiplicationUsingRecursion {
    public static int multiplyTwoIntegers(int m, int n){
        if(m==0||n==0){
            return 0;
        }
        return multiplyTwoIntegers(m,n-1)+m;
    }
    public static void main(String[] args) {
        int m=0;
        int n=4;
        System.out.print(multiplyTwoIntegers(m,n));
        //System.out.print(3*0);
    }
}
