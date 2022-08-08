package Queus;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseTheFirstKElementsInTheQueue {
    public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) {
        //Your code goes here
        if (input.isEmpty() == true || k > input.size())
            return input;
        if (k <= 0)
            return input;

        Stack<Integer> stack = new Stack<>();

        // Push the first K elements into a Stack
        for (int i = 0; i < k; i++) {
            stack.push(input.peek());
            input.remove();
        }

        // Enqueue the contents of stack
        // at the back of the queue
        while (!stack.empty()) {
            input.add(stack.peek());
            stack.pop();
        }

        // Remove the remaining elements and enqueue
        // them at the end of the Queue
        for (int i = 0; i < input.size() - k; i++) {
            input.add(input.peek());
            input.remove();
        }
        return input;
    }
    public static void main(String[] args) {
        Queue<Integer> input = new LinkedList<>();
        input.add(3);
        input.add(4);
        input.add(2);
        input.add(5);
        input.add(6);
        input.add(7);
        input.add(8);
        reverseKElements(input,7);
        while (!input.isEmpty()) {
            System.out.print(input.peek() + " ");
            input.remove();
        }
    }
}
