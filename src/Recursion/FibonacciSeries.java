package Recursion;

import java.util.Scanner;

//This program prints fibonacci series till the given (nth) number
//Fibonacci series is nothing but addition of previous 2 numbers {0,1,1,2,3,5,8}
public class FibonacciSeries {
    static int n1=0,n2=1,n3=0;
    static void printFibo(int count){
        if(count>0){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(n3+" ");
            printFibo(count-1);
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.print(n1+" "+n2+" ");//printing 0 and 1
        printFibo(n-2);//n-2 because 2 numbers are already printed
    }

}
