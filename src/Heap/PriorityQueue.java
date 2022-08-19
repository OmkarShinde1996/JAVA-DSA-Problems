package Heap;

import java.util.ArrayList;
//implementation of min heap
public class PriorityQueue {
    private static ArrayList<Integer> heap;

    public PriorityQueue() {
        heap = new ArrayList<>();
    }

    //Time Complexity = O(1)
    public static boolean isEmpty(){
        return heap.size()==0;
    }
    //Time Complexity = O(1)
    public static int size(){
        return heap.size();
    }
    //Time Complexity = O(1)
    public static int getMin() throws PriorityQueueException {
        if(isEmpty()){
            throw new PriorityQueueException();
        }
        return heap.get(0);
    }


}
