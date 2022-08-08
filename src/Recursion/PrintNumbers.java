package Recursion;

import java.util.Scanner;

public class PrintNumbers {
    public static void print(int n){
        if(n==1){
            System.out.print(1+" ");
            return;
        }
        print(n-1);
        System.out.print(n+" ");
    }
    // input = 6
    //output = 1 2 3 4 5 6
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        print(n);
    }
}
