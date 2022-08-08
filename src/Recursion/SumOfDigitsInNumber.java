package Recursion;

import java.util.Scanner;

public class SumOfDigitsInNumber {
    public static int sumOfDigits(int input){
        if(input/10==0){
            return input;
        }
        return sumOfDigits(input/10)+input%10;
    }
    //1234 = 10
    //1099 = 19
    //2099 = 20
    public static void main(String[] args) {
        int n=2099;
        //System.out.print(3/10);
        System.out.print(sumOfDigits(n));
    }

}
