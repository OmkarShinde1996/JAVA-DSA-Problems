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
    //Time Complexity = O(log n)
    public static void insert(int ele){
        heap.add(ele);
        int childIndex = heap.size()-1;
        int parentIndex = (childIndex-1)/2;
        //Up-Heapify
        while(childIndex > 0){
            if(heap.get(childIndex) < heap.get(parentIndex)){
                int temp = heap.get(childIndex);
                heap.set(childIndex, heap.get(parentIndex));
                heap.set(parentIndex,temp);
                childIndex = parentIndex;
                parentIndex = (childIndex-1)/2;
            }else{
                return;
            }
        }

    }
    //Time Complexity = O(log n)
    public static int removeMin() throws PriorityQueueException {
        if(isEmpty()){
            throw new PriorityQueueException();
        }
        int temp = heap.get(0);
        heap.set(0, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);
        int parentindex = 0;
        int minIndex = parentindex;
        int leftChildIndex = 1;
        int rightChildIndex = 2;
        while(leftChildIndex < heap.size()){
            if(heap.get(leftChildIndex) < heap.get(minIndex)){
                minIndex = leftChildIndex;
            }
            if(rightChildIndex < heap.size() && heap.get(rightChildIndex) < heap.get(minIndex)){
                minIndex = rightChildIndex;
            }
            if(minIndex == parentindex){
                break;
            }else{
                int temp1 = heap.get(parentindex);
                heap.set(parentindex, heap.get(minIndex));
                heap.set(minIndex, temp1);
                parentindex = minIndex;
                leftChildIndex = 2 * parentindex + 1;
                rightChildIndex = 2 * parentindex + 2;
            }
        }
        return temp;
    }

}
