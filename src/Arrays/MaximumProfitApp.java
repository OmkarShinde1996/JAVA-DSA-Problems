package Arrays;

import java.util.Arrays;

//You have made a smartphone app and want to set its subscription price such that the profit earned is maximised. There are certain users who will subscribe to your app only if their budget is greater than or equal to your price.
//You will be provided with a list of size N having budgets of subscribers and you need to return the maximum profit that you can earn.
//Lets say you decide that price of your app is Rs. x and there are N number of subscribers. So maximum profit you can earn is :
public class MaximumProfitApp {
    //Below example will give Time limit exceeded error
//    public static int maximumProfit(int budget[]) {
//        int len = budget.length;
//        int i = 0;
//        int numOfBud = 0;
//        int profit = 0;
//        int[] profitArr = new int[len];
//        while(i < len){
//            int budgetToCompare = budget[i];
//            for(int j=0; j<len; j++){
//                if(budgetToCompare <= budget[j]){
//                    numOfBud++;
//                }
//            }
//            profitArr[i] = budgetToCompare * numOfBud;
//            numOfBud = 0;
//            i++;
//        }
//        Arrays.sort(profitArr);
//        profit = profitArr[len-1];
//        return profit;
//    }

    //Below is the optimized solution

    public static int maximumProfit(int budget[]) {
        Arrays.sort(budget);
        int cost[] = new int[budget.length];

        for(int i=0; i<budget.length; i++){
            cost[i] = budget[i]*(budget.length-i);
        }
        int max = Integer.MIN_VALUE;

        for(int i:cost){
            if(i>max){
                max = i;
            }
        }
        return max;
    }

    public static void main(String args[])
    {
        int arr[] = {34,78,90,15,67};
        System.out.println(maximumProfit(arr));
    }
}
