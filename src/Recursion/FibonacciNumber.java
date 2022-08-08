package Recursion;

import java.util.Scanner;
//This program returns fibonacci number present on the given (nth) position
//Fibonacci series is nothing but addition of previous 2 numbers {0,1,1,2,3,5,8}
//Time complexity - O(2^n)
public class FibonacciNumber {
    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }

        return fib(n-1)+fib(n-2);
    }

    //Above function will take time or does not return fibonacci number present on 50th position so try below

    public static long fib1(int n){
        return (long)(Math.pow(((1+Math.sqrt(5))/2),n)/Math.sqrt(5)); //This is Akra-Bazzi formula
    }

//12586269025
    public static void main(String[] args) {
        System.out.print(fib1(50));
    }
}
