package Recursion;

import java.util.Scanner;

public class CountDigitsPresentInNumber {
    public static int count(int n){
        if(n/10==0){
            return 1;
        }
        return count(n/10)+1;
    }
    //1234 = 4
    //234 = 3
    //22 = 2
    //8 = 1
    //0 = 1
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.print(count(n));
    }
}
