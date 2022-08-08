package Stack;

import java.util.Stack;

public class StockSpan {
    public static int[] stockSpan(int[] price) {
        Stack <Integer> st = new Stack < > ();
        st.push(0);
        int S[]=new int[price.length];
        S[0] = 1;
        for (int i = 1; i < price.length; i++) {
            while (!st.empty() && price[st.peek()] < price[i])
                st.pop();

            S[i] = (st.empty()) ? (i + 1) : (i - st.peek());
            st.push(i);
        }
        return S;
    }

    public static void main(String[] args) {
        int arr[]={10,10,10,10};
        int ans[] = stockSpan(arr);
        for (int i = 0; i < ans.length; i++)
            System.out.print(ans[i] + " ");
    }
}
