package Heap;

import java.util.ArrayList;

public class MaxPriorityQueue {
    private static ArrayList<Integer> heap;

    public MaxPriorityQueue() {
        heap = new ArrayList<>();
    }

    boolean isEmpty() {
        return heap.size()==0;
    }

    int getSize() {
        return heap.size();

    }

    int getMax() throws PriorityQueueException {
        if(isEmpty()){
            throw new PriorityQueueException();
        }
        return heap.get(0);
    }

    void insert(int element) {
        heap.add(element);
        int childIndex = heap.size()-1;
        int parentIndex = (childIndex-1)/2;
        //Up-Heapify
        while(childIndex > 0){
            if(heap.get(childIndex) > heap.get(parentIndex)){
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

    int removeMax() throws PriorityQueueException {
        if(isEmpty()){
            throw new PriorityQueueException();
        }
        int temp = heap.get(0);
        heap.set(0, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);
        //Down-Heapify
        int parentindex = 0;
        int minIndex = parentindex;
        int leftChildIndex = 1;
        int rightChildIndex = 2;
        while(leftChildIndex < heap.size()){
            if(heap.get(leftChildIndex) > heap.get(minIndex)){
                minIndex = leftChildIndex;
            }
            if(rightChildIndex < heap.size() && heap.get(rightChildIndex) > heap.get(minIndex)){
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
