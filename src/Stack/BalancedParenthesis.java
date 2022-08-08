package Stack;

import java.util.Stack;
//Time Complexity: O(n)
//Auxiliary Space: O(n) for stack.
public class BalancedParenthesis {
    public static boolean isBalanced(String expression) {
        Stack<Character> s= new Stack<>();
        for(int i=0;i<expression.length();i++){
            char x = expression.charAt(i);
            if (x == '(' || x == '[' || x == '{'){
                // Push the element in the stack
                s.push(x);
                continue;
            }
            // If current character is not opening
            // bracket, then it must be closing. So stack
            // cannot be empty at this point.
            if (s.isEmpty())
                return false;
            char check;
            switch (x) {
                case ')':
                    check = s.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;

                case '}':
                    check = s.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;

                case ']':
                    check = s.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;
            }
        }
        // Check Empty Stack
        return (s.isEmpty());
    }

    public static void main(String[] args) {
        String exp = "((((";
        System.out.println(isBalanced(exp));
    }

}
