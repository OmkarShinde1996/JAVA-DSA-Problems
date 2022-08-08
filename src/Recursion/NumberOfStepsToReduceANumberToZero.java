package Recursion;
//Given an integer num, return the number of steps to reduce it to zero.
//In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
public class NumberOfStepsToReduceANumberToZero {
    public static int count =0;
    public static int numberOfSteps(int num) {
        if(num==0){
            return count;
        }

        if(num%2==0){
            count++;
            return numberOfSteps(num/2);
        }else{
            count++;
            return numberOfSteps(num-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(numberOfSteps(123456));
        //System.out.println(7%2);
    }
}
