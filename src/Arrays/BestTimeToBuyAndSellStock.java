package Arrays;

public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int maxprofit=0;
        int minsofor=prices[0];
        for(int i=0;i<prices.length;i++)
        {
            minsofor=Math.min(minsofor,prices[i]);
            int profit=prices[i]-minsofor;
            maxprofit=Math.max(maxprofit,profit);

        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int arr[]={2,4,1};
        System.out.println(maxProfit(arr));
    }
}
