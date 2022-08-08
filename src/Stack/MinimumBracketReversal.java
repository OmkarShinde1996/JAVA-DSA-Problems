package Stack;

import java.util.Stack;
//For a given expression in the form of a string, find the minimum number of brackets that can be reversed
// in order to make the expression balanced. The expression will only contain curly brackets.
//If the expression can't be balanced, return -1.
public class MinimumBracketReversal {
    public static int countBracketReversals(String input) {
        if(input.length()%2!=0)
            return -1;
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<input.length();i++)
        {
            if(input.charAt(i)=='{')
            {
                stk.push('{');
            }
            else if(input.charAt(i)=='}')
            {
                if(stk.isEmpty() || stk.peek()=='}')
                {
                    stk.push('}');
                }
                else if(stk.peek()=='{')
                {
                    stk.pop();
                }

            }}
        int count=0;
        while(stk.size()!=0){
            char c1=stk.pop();
            char c2=stk.pop();

            if(c1==c2)
            {
                if(c2=='{')
                    c2='}';
                if(c1=='}')
                    c1='{';
                count++;
            }

            else{
                c1='{';
                c2='}';
                count++;
                count++;
            }}
        return count;
    }

    public static void main(String[] args) {
        String s = "{{{";
        System.out.println(countBracketReversals(s));
    }
}
