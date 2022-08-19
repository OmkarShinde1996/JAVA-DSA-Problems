package Heap;

public class PriorityQueueUse {
    public static void main(String[] args) throws PriorityQueueException {
        Priority_Queue queue = new Priority_Queue();
        int[] arr = {5,1,9,2,0};
        for(int i=0; i<arr.length;i++){
            queue.insert(arr[i]);//for insertion time complexity will be O(n log n)
        }
        while(!queue.isEmpty()){
            System.out.print(queue.removeMin()+" ");//for deletion time complexity will be O(n log n)
        }
        System.out.println();
    }
}

//Overall time complexity for Heap sort will be O(n log n)
//Space complexity will be O(n)
