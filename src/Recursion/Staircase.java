package Recursion;
//A child is running up a staircase with N steps, and can hop either 1 step, 2 steps or 3 steps at a time.
// Implement a method to count how many possible ways the child can run up to the stairs.
// You need to return number of possible ways W.

//Create a recursive function (count(int n)) which takes only one parameter.

//Check the base cases. If the value of n is less than 0 then return 0, and if the value of n is
// equal to zero then return 1 as it is the starting stair.

//Call the function recursively with values n-1, n-2 and n-3 and sum up the values that are returned,
// i.e. sum = count(n-1) + count(n-2) + count(n-3)
public class Staircase {
    public static int staircase(int n){
        if(n==0){
            return 1;
        }else if(n<0){
            return 0;
        }
        int sum = staircase(n-1)+staircase(n-2)+staircase(n-3);
        return sum;
    }

    public static void main(String[] args) {
        System.out.print(staircase(5));
    }
}
