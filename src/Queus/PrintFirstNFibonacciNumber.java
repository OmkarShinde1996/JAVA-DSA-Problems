package Queus;

import Queus.QueuesUsingArray.QueueEmptyException;
import Queus.QueuesUsingArray.QueueFullException;
import Queus.QueuesUsingArray.QueuesUsingArray;

public class PrintFirstNFibonacciNumber {
    public static void main(String[] args) throws QueueFullException, QueueEmptyException {
        QueuesUsingArray q = new QueuesUsingArray();
        q.enqueue(0);
        q.enqueue(1);
        for (int i = 0; i < 10; i++)
        {
            int a = q.dequeue();
            int b = q.dequeue();
            q.enqueue(b);
            q.enqueue(a + b);
            System.out.print(a+" ");
        }
    }
}
