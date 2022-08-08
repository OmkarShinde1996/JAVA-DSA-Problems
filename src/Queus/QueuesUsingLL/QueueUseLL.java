package Queus.QueuesUsingLL;

import Queus.QueuesUsingArray.QueueEmptyException;
import Queus.QueuesUsingArray.QueueFullException;
import Queus.QueuesUsingArray.QueuesUsingArray;

public class QueueUseLL {
    public static void main(String[] args) throws QueueFullException, QueueEmptyException{
        QueueUsingLL<Integer> queue = new QueueUsingLL<>();
        for(int i=1;i<=5;i++){
            queue.enqueue(i);
        }

        while(!queue.isEmpty()){
            try {
                System.out.println(queue.dequeue());
            } catch (QueueEmptyException e) {
                e.printStackTrace();
            }
        }
    }
}
