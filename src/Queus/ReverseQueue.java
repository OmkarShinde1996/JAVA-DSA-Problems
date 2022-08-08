package Queus;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {

    public static void reverseQueue(Queue<Integer> input) {
        //Your code goes here
        Stack<Integer> stack = new Stack<>();
        while (!input.isEmpty()) {
            stack.add(input.peek());
            input.remove();
        }
        while (!stack.isEmpty()) {
            input.add(stack.peek());
            stack.pop();
        }
    }

    public static void main(String[] args) {
        Queue<Integer> input = new LinkedList<>();
        input.add(10);
        input.add(20);
        input.add(30);
        input.add(40);
        input.add(50);

        reverseQueue(input);
        while (!input.isEmpty()) {
            System.out.print(input.peek() + " ");
            input.remove();
        }
    }
}
